package org.example.Metod;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CustomerList implements Serializable {
    private final List<Customer> customerList;
    private Integer id =0;

    public CustomerList()  {
        this.customerList = new ArrayList<>();
    }

    public Customer addCustomer(String nameCustomer, String CustomerAdres, String customerPhonNumber) {
        for (Customer item : this.customerList) {
            if (id < item.getIdCustomer()) {
                    id = item.getIdCustomer();

            }
        }
        id++;
        Customer customer = new Customer(id, nameCustomer, CustomerAdres, customerPhonNumber);
        this.customerList.add(customer);
        return customer;
    }

    public List<Customer> getAll() {
        return this.customerList;
    }

    public List<Customer> deleteCustomer (Integer IdCustomer, List<Customer> customerList) {
        customerList.removeIf(item -> IdCustomer.equals(item.getIdCustomer()));

        return customerList;
    }
}
