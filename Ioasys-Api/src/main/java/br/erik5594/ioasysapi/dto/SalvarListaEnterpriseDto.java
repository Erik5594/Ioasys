package br.erik5594.ioasysapi.dto;

import java.util.List;

/**
 * @author erik_
 * Data Criacao: 03/11/2020 - 09:57
 */
public class SalvarListaEnterpriseDto {
    private List<EnterpriseDto> enterprises;

    public List<EnterpriseDto> getEnterprises() {
        return enterprises;
    }

    public void setEnterprises(List<EnterpriseDto> enterprises) {
        this.enterprises = enterprises;
    }
}
