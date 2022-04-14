package org.academiadecodigo.scrubs.converters;

import org.academiadecodigo.scrubs.command.CustomerDto;
import org.academiadecodigo.scrubs.persistence.model.Customer;
import org.academiadecodigo.scrubs.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class CustomerDtoToCustomer implements Converter<CustomerDto, Customer> {

    private CustomerService customerService;

    @Autowired
    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }

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
        customer.setNumeroPe(customerDto.getNumeroPe());
        customer.setSigno(customerDto.getSigno());
        customer.setPatologias(customerDto.getPatologias());
        customer.setMeds(customerDto.getMeds());
        customer.setSexoActivo(customerDto.getSexoActivo());
        customer.setSexoSemana(customerDto.getSexoSemana());
        customer.setParceiros(customerDto.getParceiros());
        customer.setAnal(customerDto.getAnal());
        customer.setProtecao(customerDto.getProtecao());
        customer.setClitoris(customerDto.getClitoris());
        customer.setBebidas(customerDto.getBebidas());
        customer.setCigars(customerDto.getCigars());
        customer.setDrugs(customerDto.getDrugs());
        customer.setQuais(customerDto.getQuais());
        customer.setCornos(customerDto.getCornos());
        customer.setAlimentacao(customerDto.getAlimentacao());

        return customer;
    }
}