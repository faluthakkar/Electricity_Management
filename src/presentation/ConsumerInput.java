package presentation;

import entity.Bill;
import entity.Connection_Type;
import entity.Consumer;
import persistence.BillDao;
import persistence.BillDaoImpl;
import service.ConnectionTypeService;
import service.ConnectionTypeServiceImpl;
import service.ConsumerService;
import service.ConsumerServiceImpl;

import java.sql.SQLException;
import java.util.Scanner;

public class ConsumerInput {
    private ConsumerService consumerService=new ConsumerServiceImpl();
    private BillDao billDao = new BillDaoImpl();
    private ConnectionTypeService connectionTypeService = new ConnectionTypeServiceImpl();
    Scanner s = new Scanner(System.in);

    void takeConsumerInput() throws SQLException {
        Consumer newConsumer = new Consumer();
        System.out.println("Enter Consumer Name ");
        newConsumer.setCname(s.next());
        s.nextLine();
        System.out.println("Enter Consumer City ");
        newConsumer.setCity(s.nextLine());
        System.out.println("Enter Consumer Area ");
        newConsumer.setArea(s.nextLine());
        if(consumerService.registerConsumer(newConsumer)>0)
            System.out.println("Add Other Details");
       /// else
        //    System.out.println("Consumer with id "+newConsumer.getId()+" already exist, so cannot add it as a new consumer!");
        Connection_Type newConnection = new Connection_Type();
        System.out.println("Enter Consumer Connection Type");
        newConnection.setCon_Type(s.next());
        System.out.println("Enter Fixed charge");
        newConnection.setFixed_charge(s.nextInt());
        System.out.println("Enter Charge per unit");
        newConnection.setCharge_per_unit(s.nextDouble());
        if(connectionTypeService.add(newConnection)>0)
            System.out.println("Consumer Registered");
        else
            System.out.println("Registration failed");
    }

    void takeBillDetails(){
        Bill b = new Bill();
        Connection_Type t = new Connection_Type();
        System.out.println("Enter the consumer Id  ");
        b.setConsumerId(s.nextInt());
        System.out.println("Enter the Connection id ");
        b.setConnectionId(s.nextInt());
        System.out.println("Enter the Connection_Type id ");
        b.setConnectionTypeId(s.nextInt());
        System.out.println("Enter the year of the bill");
        b.setYear(s.next());
        System.out.println("Enter the month of the bill ");
        b.setMonth(s.nextLine());
        System.out.println("Enter the new Reading");
        b.setNewReading(s.nextInt());
        System.out.println("Enter billed Units");
        b.setBilledUnits(s.nextInt());
        System.out.println("Bill Detail Added Successfully");



    }
}
