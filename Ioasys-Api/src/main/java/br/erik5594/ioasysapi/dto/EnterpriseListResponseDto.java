package br.erik5594.ioasysapi.dto;

import java.util.ArrayList;
import java.util.List;

/**
 * @author erik_
 * Data Criacao: 01/11/2020 - 01:35
 */
public class EnterpriseListResponseDto {
    private List<EnterpriseDto> enterprises;

    public EnterpriseListResponseDto(List<EnterpriseDto> enterprises) {
        this.enterprises = enterprises;
    }

    public List<EnterpriseDto> getEnterprises() {
        if(enterprises == null){
            enterprises = new ArrayList<>();
        }
        return enterprises;
    }

    public void setEnterprises(List<EnterpriseDto> enterprises) {
        this.enterprises = enterprises;
    }
}
