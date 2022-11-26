package service;

import entity.Connection_Type;
import entity.Consumer;
import persistence.ConnectionTypeDao;
import persistence.ConnectionTypeDaoImpl;
import persistence.ConsumerDao;
import persistence.ConsumerDaoImpl;

import java.sql.SQLException;
import java.util.Collection;

public class ConnectionTypeServiceImpl implements ConnectionTypeService {
    private ConnectionTypeDao  connectionTypeDao=new ConnectionTypeDaoImpl();


   /* @Override
    public int registerConsumer(Consumer consumer) throws SQLException {
        if(consumerDao.registerConsumer(consumer)>0)
            return 1;
        return 0;
    }*/


    @Override
    public void delete(int id) {

    }

    @Override
    public int add(Connection_Type type) {
     if(connectionTypeDao.add(type)>0){
         System.out.println("Insertion done");
    }
     return 1;


}

    @Override
    public void update(Connection_Type type) {

    }
}
