package persistence;

import entity.Connection_Type;

public interface ConnectionTypeDao {

    boolean delete(int id);

    public int add(Connection_Type type);

    public boolean update(Connection_Type type);
}
