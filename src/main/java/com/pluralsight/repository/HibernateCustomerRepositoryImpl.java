package com.pluralsight.repository;

import com.pluralsight.model.Customer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    @Value("${dbUsername}")
    private  String dbUsername;

    @Override
    public List<Customer> findAll(){

        System.out.println(this.dbUsername);
        List<Customer> customers = new ArrayList<>();


        Customer customer = new Customer();
        customer.setFirstName("Adolfo");
        customer.setLastName("Foliaco");
        customers.add(customer);

        return  customers;

    }
}
