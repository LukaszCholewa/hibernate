package pl.camp.it.gui;

import pl.camp.it.services.CustomerService;
import pl.camp.it.services.ICustomerService;

import java.util.Scanner;

public class GUI {

    static ICustomerService customerService = new CustomerService();

    public static void showAddCustomerScreen(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imie:");
        String name = scanner.next();
        System.out.println("Podaj nazwisko:");
        String surname = scanner.next();
        System.out.println("Podaj pesel:");
        String pesel = scanner.next();

        customerService.generateAndSaveCustomer(name, surname, pesel);

        System.out.println("Zostałeś dodany do bazy i masz niezapłacone faktury !!");
    }
}
