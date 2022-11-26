package presentation;

import entity.Connection;
import entity.Connection_Type;
import entity.Consumer;
import service.ConnectionTypeService;
import service.ConnectionTypeServiceImpl;
import service.ConsumerService;
import service.ConsumerServiceImpl;

import java.sql.SQLException;
import java.util.Collection;
import java.util.Scanner;

public class ConsumerDisImpl implements ConsumerDisplay{
    private ConsumerService consumerService=new ConsumerServiceImpl();
    private ConnectionTypeService connectionTypeService = new ConnectionTypeServiceImpl();
    @Override
    public void showMenu() {

        System.out.println("===========================");
        System.out.println("Electricity Bill Calculator ");
        System.out.println("1. List All Consumer");
        System.out.println("2. Register New Consumer");
        System.out.println("3. Generate Bill");
        System.out.println("4.Bills of all Consumers");
        System.out.println("5.Bill of consumer in specific City and Area");
       // System.out.println(6.);
        System.out.println("6. Exit");
        System.out.println("============================");
    }

    @Override
    public void performMenu(int choice) throws SQLException {
        Scanner s=new Scanner(System.in);
        switch (choice) {
            case 1:
                Collection<Consumer> consumers= consumerService.getAllConsumer();
                //print using streams/iterator
                for(Consumer con:consumers) {
                    System.out.println(con);
                }
                break;
            case 2:
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
                else
                    System.out.println("Consumer with id "+newConsumer.getId()+" already exist, so cannot add it as a new consumer!");
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
                    System.out.println("Consumer with id "+newConnection.getConn_Id()+" already exist, so cannot add it as a new");
                break;
           /* case 3:
                Rate_Table r  = new Rate_Table();
                Consumer c = new Consumer();
                System.out.println("Enter the consumer Id for which you want to generate Bill");
                c.setId(s.nextInt());
                System.out.println("Enter the year");
                //.setYear(s.nextInt());
                System.out.println();
                r.setArea(s.next());*/
            case 4:
                System.out.println("Thanks for using Electricity Bill Calculator");
                System.exit(0);
            default:
                System.out.println("Invalid Choice!");
                break;
        }

    }
}
