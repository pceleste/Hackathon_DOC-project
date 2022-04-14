package org.academiadecodigo.scrubs.command;

import org.academiadecodigo.scrubs.persistence.model.Customer;

import javax.validation.constraints.*;

public class CustomerDto {

    private Integer id;

    //@NotBlank(message = "Primeiro Nome é obrigatório!")
    //@Size(min = 3, max = 64)
    private String firstName;

    //@NotBlank(message = "Ultimo Nome é obrigatório!")
    //@Size(min = 3, max = 64)
    private String lastName;

    //@Email
    //@NotBlank(message = "Email é obrigatório!")
    private String email;

    //@Pattern(regexp = "^\\+?[0-9]*$", message = "Contém caracteres inválidos, apenas números")
    //@Size(min = 9, max = 16)
    private String phone;

    //@NotBlank(message = "Campo obrigatório!")
    private Integer smoker;

    //@NotBlank(message = "Campo obrigatório!")
    //@Size(min = 1, max = 3)
    private String idade;

    //@NotNull(message = "Campo obrigatório!")
    private String sexo;

    //@NotBlank(message = "Me deixas saber no que trabalhas")
    //@Size(min = 3, max = 64)
    private String profissao;

    //@NotBlank(message = "Campo obrigatório!")
    private Integer numeroPe;

    //@NotBlank(message = "Campo obrigatório!")
    private String signo;

    //@NotBlank(message = "Campo obrigatório!")
    private String patologias;

    //@NotNull(message = "Campo obrigatório!")
    private Integer meds;

    //@NotBlank(message = "Campo obrigatório!")
    private Integer sexoActivo;

    //@NotNull(message = "Campo obrigatório!")
    private Integer sexoSemana;

    //@NotBlank(message = "Campo obrigatório!")
    private Integer parceiros;

    //@NotBlank(message = "Campo obrigatório!")
    private Integer anal;

    //@NotBlank(message = "Campo obrigatório!")
    private Integer protecao;

    //@NotBlank(message = "Campo obrigatório!")
    private String clitoris;

    //@NotNull(message = "Campo obrigatório!")
    private Integer bebidas;

    //@NotNull(message = "Campo obrigatório!")
    private Integer cigars;

    //@NotBlank(message = "Campo obrigatório!")
    private Integer drugs;

    //@NotBlank(message = "Campo obrigatório!")
    private String quais;

    //@NotNull(message = "Campo obrigatório!")
    private Integer cornos;

    //@NotNull(message = "Campo obrigatório!")
    private Integer alimentacao;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getSmoker() {
        return smoker;
    }

    public void setSmoker(Integer answer) {
        smoker = answer;
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

    public Integer getNumeroPe() {
        return numeroPe;
    }

    public void setNumeroPe(Integer numeroPe) {
        this.numeroPe = numeroPe;
    }

    public String getSigno() {
        return signo;
    }

    public void setSigno(String signo) {
        this.signo = signo;
    }

    public String getPatologias() {
        return patologias;
    }

    public void setPatologias(String patologias) {
        this.patologias = patologias;
    }

    public Integer getMeds() {
        return meds;
    }

    public void setMeds(Integer meds) {
        this.meds = meds;
    }

    public Integer getSexoActivo() {
        return sexoActivo;
    }

    public void setSexoActivo(Integer sexoActivo) {
        this.sexoActivo = sexoActivo;
    }

    public Integer getSexoSemana() {
        return sexoSemana;
    }

    public void setSexoSemana(Integer sexoSemana) {
        this.sexoSemana = sexoSemana;
    }

    public Integer getParceiros() {
        return parceiros;
    }

    public void setParceiros(Integer parceiros) {
        this.parceiros = parceiros;
    }

    public Integer getAnal() {
        return anal;
    }

    public void setAnal(Integer anal) {
        this.anal = anal;
    }

    public Integer getProtecao() {
        return protecao;
    }

    public void setProtecao(Integer protecao) {
        this.protecao = protecao;
    }

    public String getClitoris() {
        return clitoris;
    }

    public void setClitoris(String clitoris) {
        this.clitoris = clitoris;
    }

    public Integer getBebidas() {
        return bebidas;
    }

    public void setBebidas(Integer bebidas) {
        this.bebidas = bebidas;
    }

    public Integer getCigars() {
        return cigars;
    }

    public void setCigars(Integer cigars) {
        this.cigars = cigars;
    }

    public Integer getDrugs() {
        return drugs;
    }

    public void setDrugs(Integer drugs) {
        this.drugs = drugs;
    }

    public String getQuais() {
        return quais;
    }

    public void setQuais(String quais) {
        this.quais = quais;
    }

    public Integer getCornos() {
        return cornos;
    }

    public void setCornos(Integer cornos) {
        this.cornos = cornos;
    }

    public Integer getAlimentacao() {
        return alimentacao;
    }

    public void setAlimentacao(Integer alimentacao) {
        this.alimentacao = alimentacao;
    }


    @Override
    public String toString() {
        return "CustomerDto{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", idade='" + idade + '\'' +
                ", sexo='" + sexo + '\'' +
                ", profissao='" + profissao + '\'' +
                ", smoker=" + smoker +
                ", numeroPe=" + numeroPe +
                ", signo='" + signo + '\'' +
                ", patologias='" + patologias + '\'' +
                ", meds=" + meds +
                ", sexoActivo=" + sexoActivo +
                ", sexoSemana=" + sexoSemana +
                ", parceiros=" + parceiros +
                ", anal=" + anal +
                ", protecao=" + protecao +
                ", clitoris='" + clitoris + '\'' +
                ", bebidas=" + bebidas +
                ", cigars=" + cigars +
                ", drugs=" + drugs +
                ", quais='" + quais + '\'' +
                ", cornos='" + cornos + '\'' +
                ", alimentacao=" + alimentacao +
                '}' + super.toString();
    }
}