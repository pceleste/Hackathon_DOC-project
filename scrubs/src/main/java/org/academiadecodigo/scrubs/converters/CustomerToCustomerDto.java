package org.academiadecodigo.scrubs.converters;

import org.academiadecodigo.scrubs.command.CustomerDto;
import org.academiadecodigo.scrubs.persistence.model.Customer;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class CustomerToCustomerDto extends AbstractConverter<Customer, CustomerDto> {

    @Override
    public CustomerDto convert(Customer customer) {

        CustomerDto customerDto = new CustomerDto();

        customerDto.setId(customer.getId());
        customerDto.setFirstName(customer.getFirstName());
        customerDto.setLastName(customer.getLastName());
        customerDto.setIdade(customer.getIdade());
        customerDto.setEmail(customer.getEmail());
        customerDto.setPhone(customer.getPhone());
        customerDto.setSexo(customer.getSexo());
        customerDto.setProfissao(customer.getProfissao());
        customerDto.setSmoker(customer.getSmoker());
        customerDto.setNumeroPe(customer.getNumeroPe());
        customerDto.setSigno(customer.getSigno());
        customerDto.setPatologias(customer.getPatologias());
        customerDto.setMeds(customer.getMeds());
        customerDto.setSexoActivo(customer.getSexoActivo());
        customerDto.setSexoSemana(customer.getSexoSemana());
        customerDto.setParceiros(customer.getParceiros());
        customerDto.setAnal(customer.getAnal());
        customerDto.setProtecao(customer.getProtecao());
        customerDto.setClitoris(customer.getClitoris());
        customerDto.setBebidas(customer.getBebidas());
        customerDto.setCigars(customer.getCigars());
        customerDto.setDrugs(customer.getDrugs());
        customerDto.setQuais(customer.getQuais());
        customerDto.setCornos(customer.getCornos());
        customerDto.setAlimentacao(customer.getAlimentacao());

        return customerDto;
    }
}