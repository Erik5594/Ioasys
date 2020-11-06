package br.erik5594.ioasysapi.dto;

import br.erik5594.ioasysapi.entity.Enterprise;
import br.erik5594.ioasysapi.entity.Portfolio;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * @author erik_
 * Data Criacao: 31/10/2020 - 21:25
 */
public class PortfolioDto {

    @JsonProperty("enterprises_number")
    private int enterprisesNumber;
    private List<EnterpriseDto> enterprises;

    public PortfolioDto(Portfolio portfolio) {
        this.enterprisesNumber = portfolio.getEnterprisesNumber();
        this.enterprises = new ArrayList<>();
        for(Enterprise enterprise : portfolio.getEnterprises()){
            this.enterprises.add(new EnterpriseDto(enterprise, true));
        }

    }

    public int getEnterprisesNumber() {
        return enterprisesNumber;
    }

    public void setEnterprisesNumber(int enterprisesNumber) {
        this.enterprisesNumber = enterprisesNumber;
    }

    public List<EnterpriseDto> getEnterprises() {
        return enterprises;
    }

    public void setEnterprises(List<EnterpriseDto> enterprises) {
        this.enterprises = enterprises;
    }
}
