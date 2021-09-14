package Entities;

import java.util.Date;

public class Supplier extends Customer {
private String supplierNumber;
    public Supplier(int id, String firstName, String lastName, Date dateofBirth, String nationalId,String supplierNumber) {
        super(id, firstName, lastName, dateofBirth, nationalId);
        this.supplierNumber=supplierNumber;
    }

    public String getSupplierNumber() {
        return supplierNumber;
    }

    public void setSupplierNumber(String supplierNumber) {
        this.supplierNumber = supplierNumber;
    }
}
