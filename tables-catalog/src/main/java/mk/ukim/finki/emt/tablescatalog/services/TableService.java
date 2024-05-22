package mk.ukim.finki.emt.tablescatalog.services;

import mk.ukim.finki.emt.tablescatalog.domain.model.TableId;
import mk.ukim.finki.emt.tablescatalog.domain.model.TableModel;

import java.util.List;
import java.util.Optional;

public interface TableService {
    List<TableModel> getAllTables();

    Optional<TableModel> getTableById(TableId tableId);
}
