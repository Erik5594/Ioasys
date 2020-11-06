package br.erik5594.ioasysapi.services;

import br.erik5594.ioasysapi.dto.EnterpriseDto;

import java.util.List;

/**
 *
 * @author erik_
 * Data Criacao: 31/10/2020 - 22:21
 */

public interface EnterpriseService {

    List<EnterpriseDto> listEnterprise(Long enterpriseType, String enterpriseName);
    EnterpriseDto getEnterprise(Long id);

}
