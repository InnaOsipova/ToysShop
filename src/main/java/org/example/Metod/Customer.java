package org.example.Metod;

import java.io.Serializable;

public class Customer implements Serializable {
    private Integer idCustomer;
    private String customerName;
    private String customerAdres;
    private String customerPhonNumber;

    public Customer(Integer idCustomer, String customerName, String customerAdres, String customerPhonNumber) {
        this.idCustomer = idCustomer;
        this.customerName = customerName;
        this.customerAdres = customerAdres;
        this.customerPhonNumber = customerPhonNumber;
    }

    public Integer getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Integer idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAdres() {
        return customerAdres;
    }

    public void setCustomerAdres(String customerAdres) {
        this.customerAdres = customerAdres;
    }

    public String getCustomerPhonNumber() {
        return customerPhonNumber;
    }

    public void setCustomerPhonNumber(String customerPhonNumber) {
        this.customerPhonNumber = customerPhonNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "idCustomer=" + idCustomer +
                ", customerName='" + customerName + '\'' +
                ", customerAdres='" + customerAdres + '\'' +
                ", customerPhonNumber='" + customerPhonNumber + '\'' +
                '}';
    }
}
