package pl.camp.it;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import pl.camp.it.model.Customer;

import java.util.List;

public class App {

    public static SessionFactory sessionFactory =
            new Configuration().configure().buildSessionFactory();

    public static void main(String[] args) {
        System.out.println("hibernate !!");

        Customer customer = new Customer();
        //customer.setId(10);
        customer.setName("Mateusz");
        customer.setSurname("Bereda");
        customer.setPesel(54039443234L);

        saveCustomerToDatabase(customer);

        Customer customer2 = new Customer();
        customer2.setName("Łukasz");
        customer2.setSurname("Cholewa");
        customer2.setPesel(90101022343L);

        saveCustomerToDatabase(customer2);

        System.out.println(customer);
        System.out.println(customer2);

        System.out.println(getAllCustomers());

    }

    public static void saveCustomerToDatabase (Customer customer) {
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.saveOrUpdate(customer);
            tx.commit();
        } catch(Exception e){
            if(tx!= null){
                tx.rollback();
            }
        }finally{
            session.close();
        }
    }

    public static void deleteCustomer(Customer customer){
        Session session = sessionFactory.openSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            session.delete(customer);
            tx.commit();
        } catch(Exception e){
            if(tx != null) {
                tx.rollback();
            }
        }finally {
            session.close();
        }
    }

    public static Customer getCustomerById(int id){
        Session session = sessionFactory.openSession();
        Query<Customer> query = session.createQuery("FROM pl.camp.it.model.Customer WHERE id = " + id);
        Customer customer = query.getSingleResult();
        return customer;
    }

    public static List<Customer> getAllCustomers(){
        Session session = sessionFactory.openSession();
        Query<Customer> query = session.createQuery("FROM pl.camp.it.model.Customer");
        return query.getResultList();
    }
}


