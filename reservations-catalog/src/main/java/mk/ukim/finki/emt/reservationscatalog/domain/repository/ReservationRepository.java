package mk.ukim.finki.emt.reservationscatalog.domain.repository;

import mk.ukim.finki.emt.reservationscatalog.domain.models.Reservation;
import mk.ukim.finki.emt.reservationscatalog.domain.models.ReservationId;
import mk.ukim.finki.emt.reservationscatalog.domain.valueobjects.TableId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;

public interface ReservationRepository extends JpaRepository<Reservation,ReservationId> {

}
