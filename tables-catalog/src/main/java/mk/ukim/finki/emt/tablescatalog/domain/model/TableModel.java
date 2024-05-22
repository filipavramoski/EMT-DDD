package mk.ukim.finki.emt.tablescatalog.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import mk.ukim.finki.emt.sharedkernel.domain.base.AbstractEntity;

@Entity
@Table(name="rest_table")
@Getter
public class TableModel extends AbstractEntity<TableId> {
    private int tableSize;
    private int numOfTables;
    @ManyToOne
    @JoinColumn(name = "restaurantId", nullable = false)
    private Restaurant restaurant;

    protected TableModel() {
        super(TableId.randomId());
    }

    public TableModel(int tableSize, int numOfTables, Restaurant restaurant) {
        super(TableId.randomId());
        this.tableSize = tableSize;
        this.numOfTables = numOfTables;
        this.restaurant = restaurant;
    }
}
