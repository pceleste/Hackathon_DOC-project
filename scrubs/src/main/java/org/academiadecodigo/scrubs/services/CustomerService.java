package org.academiadecodigo.scrubs.services;

import org.academiadecodigo.scrubs.exceptions.*;
import org.academiadecodigo.scrubs.persistence.model.Customer;


import java.util.List;

/**
 * Common interface for customer services, provides methods to manage customers
 */
public interface CustomerService {

    /**
     * Gets the customer with the given id
     *
     * @param id the customer id
     * @return the customer
     */
    Customer get(Integer id);


    /**
     * Saves a customer
     *
     * @param customer the customer to save
     * @return the saved custoemr
     */
    Customer save(Customer customer);

    /**
     * Deletes the customer
     *
     * @param id the customer id
     * @throws CustomerNotFoundException
     */
    void delete(Integer id) throws CustomerNotFoundException;

    /**
     * Gets a list of the customers
     *
     * @return the customers list
     */
    List<Customer> list();


}
