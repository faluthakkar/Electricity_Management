package client;

import presentation.ConsumerDisImpl;
import presentation.ConsumerDisplay;

import java.sql.SQLException;
import java.util.Scanner;

public class ConsumerClient {
    public static void main(String[] args) throws SQLException {
        Scanner sc=new Scanner(System.in);

        ConsumerDisplay consumerDisplay=new ConsumerDisImpl();

        while(true) {
            consumerDisplay.showMenu();
            System.out.println("Enter Choice : ");
            int choice=sc.nextInt();
            consumerDisplay.performMenu(choice);
        }

    }

}

