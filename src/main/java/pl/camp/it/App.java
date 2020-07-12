package pl.camp.it;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import pl.camp.it.dao.CustomerDAO;
import pl.camp.it.dao.ProductDAO;
import pl.camp.it.model.Address;
import pl.camp.it.model.Customer;
import pl.camp.it.model.Invoice;
import pl.camp.it.model.Product;

import java.util.Date;

public class App {

    public static SessionFactory sessionFactory =
            new Configuration().configure().buildSessionFactory();

    /*public static void main(String[] args) {
        System.out.println("hibernate !!");

        Customer customer = new Customer();
        //customer.setId(10);
        customer.setName("Mateusz");
        customer.setSurname("Bereda");
        customer.setPesel(54039443234L);

        Address address = new Address();
        address.setCity("Kraków");
        address.setStreet("Ogrodowa");

        customer.setAddress(address);

        Invoice invoice = new Invoice();
        invoice.setDate(new Date());
        invoice.setSignature("FV/1/7/2020");

        customer.getInvoices().add(invoice);

        Invoice invoice2 = new Invoice();
        invoice2.setDate(new Date());
        invoice2.setSignature("FV/2/7/2020");

        customer.getInvoices().add(invoice2);

        CustomerDAO.saveCustomerToDatabase(customer);

        Product product = new Product();
        product.setPrice(100.0);
        product.setName("Mikser");
        product.getCustomers().add(customer);
        customer.getProducts().add(product);

        CustomerDAO.saveCustomerToDatabase(customer);

        Customer customer2 = new Customer();
        customer2.setName("Łukasz");
        customer2.setSurname("Cholewa");
        customer2.setPesel(90101022343L);

        CustomerDAO.saveCustomerToDatabase(customer2);
        System.out.println(CustomerDAO.getCustomerById(1));

        System.out.println(customer);
        System.out.println(customer2);

        System.out.println(CustomerDAO.getAllCustomers());

        Product p = ProductDAO.getProductById(1);
        System.out.println(p.toString2());

    }*/

}


