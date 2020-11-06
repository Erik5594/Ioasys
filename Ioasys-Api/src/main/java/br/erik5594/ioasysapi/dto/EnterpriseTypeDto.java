package br.erik5594.ioasysapi.dto;

import br.erik5594.ioasysapi.entity.Enterprise;
import br.erik5594.ioasysapi.entity.EnterpriseType;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author erik_
 * Data Criacao: 30/10/2020 - 16:56
 */
public class EnterpriseTypeDto {

    private Long id;
    @JsonProperty("enterprise_type_name")
    private String enterpriseTypeName;

    public EnterpriseTypeDto() {
    }

    public EnterpriseTypeDto(EnterpriseType enterpriseType) {
        this.id = enterpriseType.getId();
        this.enterpriseTypeName = enterpriseType.getEnterpriseTypeName();
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
