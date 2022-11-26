package service;

import entity.Consumer;

import java.sql.SQLException;
import java.util.Collection;

public interface ConsumerService {
    Collection<Consumer> getAllConsumer();
    int registerConsumer(Consumer consumer) throws SQLException;
}
