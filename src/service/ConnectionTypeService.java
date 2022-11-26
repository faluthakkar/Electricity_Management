package service;

import entity.Connection_Type;

public interface ConnectionTypeService  {
    void delete(int id);

    public int add(Connection_Type type);

    public void update(Connection_Type type);
}
