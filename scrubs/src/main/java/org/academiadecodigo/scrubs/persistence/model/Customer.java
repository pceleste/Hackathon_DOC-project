package org.academiadecodigo.scrubs.persistence.model;

import javax.persistence.*;

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
    private Integer numeroPe;
    private String patologias;
    private String signo;
    private Integer meds;
    private Integer sexoActivo;
    private Integer sexoSemana;
    private Integer parceiros;
    private Integer anal;
    private Integer protecao;
    private String clitoris;
    private Integer bebidas;
    private Integer cigars;
    private Integer drugs;
    private String quais;
    private Integer cornos;
    private Integer alimentacao;

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

    public Integer getNumeroPe() {
        return numeroPe;
    }

    public void setNumeroPe(Integer numeroPe) {
        this.numeroPe = numeroPe;
    }

    public String getPatologias() {
        return patologias;
    }

    public void setPatologias(String patologias) {
        this.patologias = patologias;
    }

    public String getSigno() {
        return signo;
    }

    public void setSigno(String signo) {
        this.signo = signo;
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
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", idade='" + idade + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
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