package mk.ukim.finki.emt.tablescatalog.services.impl;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import mk.ukim.finki.emt.tablescatalog.domain.model.TableId;
import mk.ukim.finki.emt.tablescatalog.domain.model.TableModel;
import mk.ukim.finki.emt.tablescatalog.domain.repository.TableRepository;
import mk.ukim.finki.emt.tablescatalog.services.TableService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@AllArgsConstructor
public class TableServiceImpl implements TableService {
    private final TableRepository tableRepository;

    @Override
    public List<TableModel> getAllTables() {
        return tableRepository.findAll();
    }

    @Override
    public Optional<TableModel> getTableById(TableId tableId) {
        return tableRepository.findById(tableId);
    }
}
