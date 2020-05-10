
import dataaccess.customerAccess;
import java.util.Scanner;
import model.Customer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pooripro
 */
public class MainMenu {

    private Scanner sc;
    private int selectChoice;

    public void menu() {
        System.out.println("----------\n"
                + "1. add customer \n"
                + "2. list all customer \n"
                + "3. select customer");

       
    }

    public void runMenu() {
        do {
            menu();
            selectChoice = sc.nextInt();
            switch (selectChoice) {
                case 1:
                    addCustomer();
                    break;
                case 2:
                    //listAllCustomer();
                    break;
                case 3:
                    //selectCustomer();
                    break;
                case 4:
                default:
                    System.out.println("--- Try Again ---");
            }
        } while (selectChoice != 4);
    }

    private void addCustomer() {
        String fN;
        String lN;
        
        System.out.println("---ADD CUSTOMER---");
        System.out.println("First Name : ");
        fN = sc.nextLine();
        System.out.println("Last Name : ");
        lN = sc.nextLine();
        
        Customer temp = new Customer(fN, lN);
        customerAccess.insert(temp);
    }

    private void listAllCustomer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void selectCustomer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   
}
