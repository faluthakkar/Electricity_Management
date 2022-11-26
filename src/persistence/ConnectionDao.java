package persistence;

import entity.Connection;

public interface ConnectionDao  {
    void delete(int id);

    public void add(Connection connection);

    public void updateOldReading(Connection connection);
}
