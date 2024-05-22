package mk.ukim.finki.emt.sharedkernel.domain.base;


import jakarta.persistence.EmbeddedId;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;

@MappedSuperclass
@Getter
public class AbstractEntity<ID extends DomainObjectId> {//Persistence
    @EmbeddedId
    private ID id;
    protected AbstractEntity() {
    }

    public AbstractEntity(ID id) {
        this.id = id;
    }

}
