package br.erik5594.ioasysapi.entity;

import br.erik5594.ioasysapi.dto.EnterpriseDto;

import javax.persistence.*;

/**
 *
 * @author erik_
 * Data Criacao: 31/10/2020 - 22:07
 */
@Entity
@Table
public class Enterprise {

    @Id
    private Long id;

    @Column(name = "enterprise_name")
    private String enterpriseName;
    @Column(length = 1000)
    private String description;
    @Column(name = "email_enterprise")
    private String emailEnterprise;
    private String facebook;
    private String twitter;
    private String linkedin;
    private String phone;
    @Column(name = "own_enterprise")
    private boolean ownEnterprise;
    private String photo;
    private int value;
    private Long shares;
    @Column(name = "share_price")
    private double sharePrice;
    @Column(name = "own_shares")
    private Integer ownShares;
    private String city;
    private String country;
    @JoinColumn(name = "id_enterprise_type")
    @OneToOne
    private EnterpriseType enterpriseType;

    public Enterprise() {
    }

    public Enterprise(EnterpriseDto enterpriseDto) {
        this.id = enterpriseDto.getId();
        this.enterpriseName = enterpriseDto.getEnterpriseName();
        this.description = enterpriseDto.getDescription();
        this.emailEnterprise = enterpriseDto.getEmailEnterprise();
        this.facebook = enterpriseDto.getFacebook();
        this.twitter = enterpriseDto.getTwitter();
        this.linkedin = enterpriseDto.getLinkedin();
        this.phone = enterpriseDto.getPhone();
        this.ownEnterprise = enterpriseDto.isOwnEnterprise();
        this.photo = enterpriseDto.getPhoto();
        this.value = enterpriseDto.getValue();
        this.shares = enterpriseDto.getShares();
        this.sharePrice = enterpriseDto.getSharePrice();
        this.ownShares = enterpriseDto.getOwnShares();
        this.city = enterpriseDto.getCity();
        this.country = enterpriseDto.getCountry();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEmailEnterprise() {
        return emailEnterprise;
    }

    public void setEmailEnterprise(String emailEnterprise) {
        this.emailEnterprise = emailEnterprise;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isOwnEnterprise() {
        return ownEnterprise;
    }

    public void setOwnEnterprise(boolean ownEnterprise) {
        this.ownEnterprise = ownEnterprise;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Long getShares() {
        return shares;
    }

    public void setShares(Long shares) {
        this.shares = shares;
    }

    public double getSharePrice() {
        return sharePrice;
    }

    public void setSharePrice(double sharePrice) {
        this.sharePrice = sharePrice;
    }

    public Integer getOwnShares() {
        return ownShares;
    }

    public void setOwnShares(Integer ownShares) {
        this.ownShares = ownShares;
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

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
}
