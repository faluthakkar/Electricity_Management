package presentation;

import entity.Connection;
import entity.Connection_Type;
import entity.Consumer;
import persistence.ConsumerDaoImpl;
import service.ConnectionTypeService;
import service.ConnectionTypeServiceImpl;
import service.ConsumerService;
import service.ConsumerServiceImpl;

import java.sql.SQLException;
import java.util.Collection;
import java.util.Scanner;

public class ConsumerDisImpl extends ConsumerInput implements ConsumerDisplay{

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
                ConsumerInput c = new ConsumerInput();
                c.takeConsumerInput();

                break;
            case 3:
                ConsumerInput c1 = new ConsumerInput();
                c1.takeBillDetails();
                System.out.println("Enter the consumer Id for which you want to generate Bill");
                c1.setId(s.nextInt());
               break;;
            case 4:
                System.out.println("Thanks for using Electricity Bill Calculator");
                System.exit(0);
            default:
                System.out.println("Invalid Choice!");
                break;
        }

    }
}
