package persistence;

import entity.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnectionDaoImpl implements ConnectionDao {
    @Override
    public void delete(int id) {
        PreparedStatement pst;
        try (java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/electrcity_management", "root",
                "root123456##")) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            pst = conn.prepareStatement("delete from connection where id = ?");
            pst.setInt(1, id);
            int row = pst.executeUpdate();
            System.out.println("Successfully deleted " + row);


        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void add(Connection connection) {
        PreparedStatement pst;
        try (java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/electrcity_management", "root",
                "root123456##")) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            pst = conn.prepareStatement("insert into connection(old_reading,connection_type_id,consumer_id) values(?,?,?)");

            pst.setInt(1, connection.getOldReading());
            pst.setInt(2, connection.getConnectionTypeId());
            pst.setInt(3, connection.getConsumerId());
            int rows = pst.executeUpdate();
            System.out.println("Successful insertion " + rows);
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void updateOldReading(Connection connection) {
        PreparedStatement pst;
        try (java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/electrcity_management", "root",
                "root123456##")) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String sql ="Update connection SET old_reading =(Select newReading from bill where connection.id=bill.connectionId)";

            pst=conn.prepareStatement(sql);
            pst.executeUpdate();

        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
