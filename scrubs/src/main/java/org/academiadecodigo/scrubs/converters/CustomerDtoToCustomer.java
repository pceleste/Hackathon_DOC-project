package org.academiadecodigo.scrubs.converters;

import org.academiadecodigo.scrubs.command.CustomerDto;
import org.academiadecodigo.scrubs.persistence.model.Customer;
import org.academiadecodigo.scrubs.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * A {@link Converter} implementation, responsible for {@link CustomerDto} to {@link Customer} type conversion
 */
@Component
public class CustomerDtoToCustomer implements Converter<CustomerDto, Customer> {

    private CustomerService customerService;

    /**
     * Sets the customer service
     *
     * @param customerService the customer service to set
     */
    @Autowired
    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }

    /**
     * Converts the customer DTO into a customer model object
     *
     * @param customerDto the customer DTO
     * @return the customer
     */
    @Override
    public Customer convert(CustomerDto customerDto) {

        Customer customer = (customerDto.getId() != null ? customerService.get(customerDto.getId()) : new Customer());

        customer.setFirstName(customerDto.getFirstName());
        customer.setLastName(customerDto.getLastName());
        customer.setIdade(customerDto.getIdade());
        customer.setEmail(customerDto.getEmail());
        customer.setPhone(customerDto.getPhone());
        customer.setSexo(customerDto.getSexo());
        customer.setProfissao(customerDto.getProfissao());
        customer.setSmoker(customerDto.getSmoker());

        return customer;
    }
}