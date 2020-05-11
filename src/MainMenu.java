
import static dataaccess.customerAccess.insert;
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
    
    public MainMenu(){
        this.sc = new Scanner(System.in);
    }
    
    public void menu() {
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n"
                + "         APPLICATION CUSTOMER LIST\n"
                + "1. add customer \n"
                + "2. list all customer \n"
                + "3. select customer\n"
                + "▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n"
                + "Enter number of Choice : ");
        selectChoice = sc.nextInt();
    }

    public void runMenu() {
        do {
            menu();
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
//                    deleteCustomer();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n"
                            + "System : Try Again\n"
                            + "▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
            }
        } while (selectChoice != 5);
    }

    private void addCustomer() {
        String firstName = null;
        
        System.out.println("------------------");
        System.out.println("---ADD CUSTOMER---");
        do{
            System.out.println("Enter first name :");
            firstName = sc.nextLine();
        }while(firstName.equals(""));
        
        String lastName = null;
        do{
            System.out.println("Enter last name : ");
            lastName = sc.nextLine();
        }while(lastName.equals(""));
        
        Customer obj = new Customer(firstName, lastName);
        System.out.println(obj);
        insert(obj);
        
    }

    private void listAllCustomer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void selectCustomer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void deleteCustomer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   
}
