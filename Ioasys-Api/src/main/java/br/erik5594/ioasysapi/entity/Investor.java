package br.erik5594.ioasysapi.entity;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.util.Collection;

/**
 *
 * @author erik_
 * Data Criacao: 31/10/2020 - 22:08
 */

@Entity
@Table
public class Investor {

    @Id
    private Long id;
    @Column(name = "investor_name")
    private String investorName;
    private String email;
    private String city;
    private String country;
    private double balance;
    private String photo;
    @JoinColumn(name = "id_portfolio")
    @OneToOne
    private Portfolio portfolio;
    @Column(name = "portfolio_value")
    private double portfolioValue;
    @Column(name = "first_acess")
    private boolean firstAcess;
    @Column(name = "super_angel")
    private boolean superAngel;
    @Column
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInvestorName() {
        return investorName;
    }

    public void setInvestorName(String investorName) {
        this.investorName = investorName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public double getPortfolioValue() {
        return portfolioValue;
    }

    public void setPortfolioValue(double portfolioValue) {
        this.portfolioValue = portfolioValue;
    }

    public boolean isFirstAcess() {
        return firstAcess;
    }

    public void setFirstAcess(boolean firstAcess) {
        this.firstAcess = firstAcess;
    }

    public boolean isSuperAngel() {
        return superAngel;
    }

    public void setSuperAngel(boolean superAngel) {
        this.superAngel = superAngel;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public org.springframework.security.core.userdetails.User getUserDetails(Collection<? extends GrantedAuthority> roles) {
        return new org.springframework.security.core.userdetails.User(
                email,
                password,
                true,
                true,
                true,
                true,
                roles);
    }
}
