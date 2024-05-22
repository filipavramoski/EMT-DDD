package mk.ukim.finki.emt.reservationscatalog.xports.client;


import mk.ukim.finki.emt.reservationscatalog.domain.valueobjects.Restaurant;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Collections;
import java.util.List;

@Service
public class RestaurantClient {

    private final RestTemplate restTemplate;
    private final String serverUrl;

    public RestaurantClient(@Value("${app.reservations-catalog.url}") String serverUrl) {
        this.serverUrl = serverUrl;
        this.restTemplate = new RestTemplate();
        var requestFactory = new SimpleClientHttpRequestFactory();
        this.restTemplate.setRequestFactory(requestFactory);
    }

    private UriComponentsBuilder uri() {
        return UriComponentsBuilder.fromUriString(this.serverUrl);
    }

    public List<Restaurant> findAll() {
        try {
            return restTemplate.exchange(uri().path("/api/restaurant").build().toUri(), HttpMethod.GET, null, new ParameterizedTypeReference<List<Restaurant>>() {}).getBody();
        } catch (Exception e) {
            return Collections.emptyList();
        }
    }

    public Restaurant findById(String restaurantId) {
        try {
            return restTemplate.getForObject(uri().path("/api/restaurant/" + restaurantId).build().toUri(), Restaurant.class);
        } catch (Exception e) {
            return null;
        }
    }
}
