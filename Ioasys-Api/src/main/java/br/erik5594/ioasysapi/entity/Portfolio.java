package br.erik5594.ioasysapi.entity;

import javax.persistence.*;
import java.util.List;

/**
 * @author erik_
 * Data Criacao: 31/10/2020 - 22:08
 */
@Entity
@Table
public class Portfolio {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name =  "enterprises_number")
    private int enterprisesNumber;

    @JoinColumn(name = "id_enterprise")
    @OneToMany
    private List<Enterprise> enterprises;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getEnterprisesNumber() {
        return enterprisesNumber;
    }

    public void setEnterprisesNumber(int enterprisesNumber) {
        this.enterprisesNumber = enterprisesNumber;
    }

    public List<Enterprise> getEnterprises() {
        return enterprises;
    }

    public void setEnterprises(List<Enterprise> enterprises) {
        this.enterprises = enterprises;
    }
}
