package persistence;

import entity.Consumer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ConsumerDaoImpl  implements ConsumerDao {


    @Override
    public List<Consumer> getAllConsumer() {
        List<Consumer> consumerList = new ArrayList<>();

        Statement st = null;
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/electrcity_management", "root",
                "root123456##")) {

            Class.forName("com.mysql.cj.jdbc.Driver");

            st = conn.createStatement();

            ResultSet rs = st.executeQuery("SELECT * FROM consumer");

            while (rs.next()) {
                int id = rs.getInt("id");
                String cname = rs.getString("CName");
                String city = rs.getString("City");
                String area = rs.getString("Area");
                // String conn_type = rs.getString("Con_type");
                Consumer consumer = new Consumer(id, cname, city, area);
                consumerList.add(consumer);
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return consumerList;
    }


    @Override
    public int registerConsumer(Consumer consumer) throws SQLException {


        PreparedStatement pst;
        int rows = 0;
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/electrcity_management", "root",
                "root123456##")) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            pst = conn.prepareStatement("insert into consumer(CName,City,Area) values(?,?,?)");

            pst.setString(1, consumer.getCname());
            pst.setString(2, consumer.getCity());
            pst.setString(3, consumer.getArea());
            // pst.setString(5, consumer.getCon_Type());
            rows = pst.executeUpdate();
            return rows;


        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    public boolean generateBill(int id) {

        CallableStatement callable;
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/electrcity_management", "root",
                "root123456##")) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            callable = conn.prepareCall("{call GenerateBillProcedure(?)}");
            callable.registerOutParameter(1, Types.INTEGER);
            callable.executeUpdate();


        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return true;
    }
}

