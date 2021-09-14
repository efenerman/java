package Entities;

import Abstract.IEntity;
import java.time.LocalDate;


public class Customer implements IEntity {
    public int Id;
    public String firstName;
    public String lastName;
    public LocalDate dateOfBirth;
    public String nationalityId;

    public Customer(int id, String firstName, String lastName, LocalDate dateOfBirth, String nationalityId) {
        Id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.nationalityId = nationalityId;
    }

}
