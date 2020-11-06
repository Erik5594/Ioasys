package br.erik5594.ioasysapi.dto;

import br.erik5594.ioasysapi.entity.Enterprise;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author erik_
 * Data Criacao: 30/10/2020 - 16:56
 */
public class EnterpriseDto {


    private Long id;
    @JsonProperty("enterprise_name")
    private String enterpriseName;
    private String description;
    @JsonProperty("email_enterprise")
    private String emailEnterprise;
    private String facebook;
    private String twitter;
    private String linkedin;
    private String phone;
    @JsonProperty("own_enterprise")
    private boolean ownEnterprise;
    private String photo;
    private int value;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Long shares;
    @JsonProperty("share_price")
    private double sharePrice;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("own_shares")
    private Integer ownShares;
    private String city;
    private String country;
    @JsonProperty("enterprise_type")
    private EnterpriseTypeDto enterpriseType;

    public EnterpriseDto() {
    }

    public EnterpriseDto(Enterprise enterprise, boolean lista) {
        this.id = enterprise.getId();
        this.enterpriseName = enterprise.getEnterpriseName();
        this.description = enterprise.getDescription();
        this.emailEnterprise = enterprise.getEmailEnterprise();
        this.facebook = enterprise.getFacebook();
        this.twitter = enterprise.getTwitter();
        this.linkedin = enterprise.getLinkedin();
        this.phone = enterprise.getPhone();
        this.ownEnterprise = enterprise.isOwnEnterprise();
        this.photo = enterprise.getPhoto();
        this.value = enterprise.getValue();
        this.shares = lista ? null:enterprise.getShares();
        this.sharePrice = enterprise.getSharePrice();
        this.ownShares = lista ? null:enterprise.getOwnShares();
        this.city = enterprise.getCity();
        this.country = enterprise.getCountry();
        this.enterpriseType = new EnterpriseTypeDto(enterprise.getEnterpriseType());
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

    public EnterpriseTypeDto getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseTypeDto enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
}
