package pl.camp.it.model;

import javax.persistence.*;

@Entity  (name = "tcustomer")   //adnotacja funkcyjna mowiaca zeby hibernate mogl cos z tym zrobic (nazwac np. tcustomer)
public class Customer {
    @Id                         //adnotacja aby Id było kluczem głównym
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // oznaczenie autoinkrementacji
    private int id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String surname;
    @Column(unique = true, nullable = false)     // oznaczenie uniklnosci wartosci w tabeli
    private long pesel;

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getName() { return name;}

    public void setName(String name) { this.name = name; }

    public String getSurname() { return surname; }

    public void setSurname(String surname) { this.surname = surname; }

    public long getPesel() { return pesel; }

    public void setPesel(long pesel) { this.pesel = pesel; }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", pesel=" + pesel +
                '}';
    }
}
