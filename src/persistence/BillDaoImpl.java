package persistence;

import entity.Bill;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BillDaoImpl implements BillDao {


    @Override
    public int add(Bill bill) {

        PreparedStatement pst;
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/electrcity_management", "root",
                "root123456##")) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            pst = conn.prepareStatement("insert into bill( id,connectionId,consumerId,connectionTypeId,\n" +
                    "year Month,oldReading,newReading,billedUnits) values(?,?,?,?,?,?,?,?)");
            pst.setInt(1, bill.getId());
            pst.setInt(2, bill.getConnectionId());
            pst.setInt(3, bill.getConsumerId());
            pst.setInt(4, bill.getConnectionTypeId());
            pst.setString(5, bill.getYear());
            pst.setString(6, bill.getMonth());
            // pst.setInt(7,bill.getOldReading());
            pst.setInt(7, bill.getNewReading());
            pst.setInt(8, bill.getBilledUnits());
            int rows = pst.executeUpdate();
            System.out.println(rows + " Affected ");
            return rows;
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

    public void getBillDetails(Bill bill) {
        PreparedStatement pst;
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/electrcity_management", "root",
                "root123456##")) {
            Class.forName("com.mysql.cj.jdbc.Driver");







        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
