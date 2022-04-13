package org.academiadecodigo.scrubs.persistence.model;


import javax.persistence.*;

/**
 * The customer model entity
 */
@Entity
@Table(name = "customer")
public class Customer extends AbstractModel {

    private String firstName;
    private String lastName;
    private String idade;
    private String email;
    private String phone;
    private String sexo;
    private String profissao;
    private Integer smoker;


    /**
     * Gets the first name of the customer
     *
     * @return the customer last name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the first name of the customer
     *
     * @param firstName the name to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets the last name of the customer
     *
     * @return the customer last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the last name of the customer
     *
     * @param lastName the name to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets the email of the customer
     *
     * @return the customer email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email of the customer
     *
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets the phone of the customer
     *
     * @return the customer phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the phone of the customer
     *
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }



    /**
     * @see Object#toString()
     */
    @Override
    public String toString() {

        // printing recipients with lazy loading
        // and no session will cause issues
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", idade='" + idade + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", sexo='" + sexo + '\'' +
                ", profissao='" + profissao + '\'' +
                ", smoker=" + smoker + "}" + super.toString();
    }

    public Integer getSmoker() {
        return smoker;
    }

    public void setSmoker(Integer smoker) {
        this.smoker = smoker;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
}