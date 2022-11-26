package persistence;

import entity.Bill;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BillDaoImpl implements BillDao {


    @Override
    public void add(Bill bill) {

        PreparedStatement pst;
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/electrcity_management", "root",
                "root123456##")) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            pst = conn.prepareStatement("insert into bill values(?,?,?,?,?)");





        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }




        @Override
    public void remove(int id) {

    }



    @Override
    public void update(Bill bill) {

    }
}
