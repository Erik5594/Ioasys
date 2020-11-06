package br.erik5594.ioasysapi.dto;

import br.erik5594.ioasysapi.entity.Investor;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author erik_
 * Data Criacao: 31/10/2020 - 21:19
 */
public class InvestorDto {

    private Long id;
    @JsonProperty("investor_name")
    private String investorName;
    private String email;
    private String city;
    private String country;
    private double balance;
    private String photo;
    private PortfolioDto portfolio;
    @JsonProperty("portfolio_value")
    private double portfolioValue;
    @JsonProperty("first_acess")
    private boolean firstAcess;
    @JsonProperty("super_angel")
    private boolean superAngel;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String password;

    public InvestorDto() {
    }

    public InvestorDto(Investor investor) {
        this.id = investor.getId();
        this.investorName = investor.getInvestorName();
        this.email = investor.getEmail();
        this.city = investor.getCity();
        this.country = investor.getCountry();
        this.balance = investor.getBalance();
        this.photo = investor.getPhoto();
        this.portfolio = new PortfolioDto(investor.getPortfolio());
        this.portfolioValue = investor.getPortfolioValue();
        this.firstAcess = investor.isFirstAcess();
        this.superAngel = investor.isSuperAngel();
        this.password = null;
    }

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

    public PortfolioDto getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(PortfolioDto portfolio) {
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
}
