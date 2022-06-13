package com.parker.pdbrcrm.services;

import com.parker.pdbrcrm.exceptions.NoCustomerException;
import com.parker.pdbrcrm.models.Customer;
import com.parker.pdbrcrm.repositories.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService {
    @Autowired
    CustomerRepo customerRepo;

    public void createCustomer(Customer customer) {
        customerRepo.save(customer);
    }

    public Customer getCustomer(Long customerId) throws NoCustomerException {
        Optional<Customer> customerOptional = customerRepo.findById(customerId);
        if (customerOptional.isPresent()) {
            return customerOptional.get();
        } else {
            throw new NoCustomerException("Customer not found.");
        }
    }

    public void updateCustomer(Customer customer) throws NoCustomerException {
        Optional<Customer> customerOptional = customerRepo.findById(customer.getId());
        if (customerOptional.isPresent()) {
            Customer newCustomer = customerOptional.get();
            newCustomer.setAddress(customer.getAddress());
            newCustomer.setEmail(customer.getEmail());
            newCustomer.setFirstName(customer.getFirstName());
            newCustomer.setLastName(customer.getLastName());
            newCustomer.setPhone(customer.getPhone());
            customerRepo.save(newCustomer);
        } else {
            throw new NoCustomerException("Customer not found.");
        }
    }

    public void deleteCustomer(Long customerId) throws NoCustomerException {
        Optional<Customer> customerOptional = customerRepo.findById(customerId);
        if (customerOptional.isPresent()) {
            customerRepo.delete(customerOptional.get());
        } else {
            throw new NoCustomerException("Customer not found.");
        }
    }
}
