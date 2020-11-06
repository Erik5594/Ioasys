package br.erik5594.ioasysapi.entity;

import br.erik5594.ioasysapi.dto.EnterpriseTypeDto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author erik_
 * Data Criacao: 31/10/2020 - 22:08
 */
@Entity
@Table
public class EnterpriseType {

    @Id
    private Long id;
    @Column(name = "enterprise_type_name")
    private String enterpriseTypeName;

    public EnterpriseType() {
    }

    public EnterpriseType(EnterpriseTypeDto enterpriseTypeDto) {
        this.id = enterpriseTypeDto.getId();
        this.enterpriseTypeName = enterpriseTypeDto.getEnterpriseTypeName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEnterpriseTypeName() {
        return enterpriseTypeName;
    }

    public void setEnterpriseTypeName(String enterpriseTypeName) {
        this.enterpriseTypeName = enterpriseTypeName;
    }
}
