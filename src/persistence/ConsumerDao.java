package persistence;

import entity.Consumer;

import java.sql.SQLException;
import java.util.List;

public interface ConsumerDao {

    List<Consumer> getAllConsumer();
    int registerConsumer(Consumer consumer) throws SQLException;

}
