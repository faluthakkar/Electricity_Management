package persistence;

import entity.Connection_Type;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnectionTypeDaoImpl implements  ConnectionTypeDao{
    @Override
    public boolean delete(int id) {
return false;
    }

    @Override
    public int add(Connection_Type type) {
        PreparedStatement pst;
        try (java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/electrcity_management", "root",
                "root123456##")) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            pst = conn.prepareStatement("insert into connection_type(type,fixed_charge,per_unit_charge) values(?,?,?)");

            pst.setString(1, type.getCon_Type());
            pst.setInt(2, type.getFixed_charge());
            pst.setDouble(3, type.getCharge_per_unit());
            int rows = pst.executeUpdate();
            System.out.println("Successful insertion " + rows);
            return rows;

        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public boolean update(Connection_Type type) {
return false;
    }
}
