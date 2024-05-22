package mk.ukim.finki.emt.tablescatalog.domain.repository;

import jakarta.persistence.Table;
import mk.ukim.finki.emt.tablescatalog.domain.model.TableId;
import mk.ukim.finki.emt.tablescatalog.domain.model.TableModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TableRepository extends JpaRepository<TableModel, TableId> {
}
