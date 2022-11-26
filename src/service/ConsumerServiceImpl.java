package service;

import entity.Consumer;
import persistence.ConsumerDao;
import persistence.ConsumerDaoImpl;

import java.sql.SQLException;
import java.util.Collection;

public class ConsumerServiceImpl  implements ConsumerService{

    private ConsumerDao consumerDao=new ConsumerDaoImpl();
    @Override
    public Collection<Consumer> getAllConsumer() {
        return consumerDao.getAllConsumer();
    }

    @Override
    public int registerConsumer(Consumer consumer) throws SQLException {
        if(consumerDao.registerConsumer(consumer)>0)
            return 1;
        return 0;
    }
}
