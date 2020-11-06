package br.erik5594.ioasysapi.services.impl;

import br.erik5594.ioasysapi.dto.EnterpriseDto;
import br.erik5594.ioasysapi.dto.EnterpriseTypeDto;
import br.erik5594.ioasysapi.entity.Enterprise;
import br.erik5594.ioasysapi.entity.EnterpriseType;
import br.erik5594.ioasysapi.exception.NotFound;
import br.erik5594.ioasysapi.repository.EnterpriseRepository;
import br.erik5594.ioasysapi.repository.EnterpriseTypeRepository;
import br.erik5594.ioasysapi.services.EnterpriseService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author erik_
 * Data Criacao: 31/10/2020 - 22:21
 */
@Service
public class EnterpriseServiceImpl implements EnterpriseService {

    @Autowired
    private EnterpriseTypeRepository enterpriseTypeRepository;
    @Autowired
    private EnterpriseRepository enterpriseRepository;

    @Override
    public List<EnterpriseDto> listEnterprise(Long idEnterpriseType, String enterpriseName) {
        List<Enterprise> enterprises;

        if(idEnterpriseType != null && StringUtils.isNotBlank(enterpriseName)){
            EnterpriseType enterpriseType = enterpriseTypeRepository.findById(idEnterpriseType).orElse(null);
            enterprises = enterpriseRepository.findAllByEnterpriseNameOrEnterpriseType("%"+enterpriseName+"%", enterpriseType);
        }else if (idEnterpriseType != null){
            EnterpriseType enterpriseType = enterpriseTypeRepository.findById(idEnterpriseType).orElse(null);
            enterprises = enterpriseRepository.findAllByEnterpriseType(enterpriseType);
        }else if (StringUtils.isNotBlank(enterpriseName)){
            enterprises = enterpriseRepository.findAllByEnterpriseName("%"+enterpriseName+"%");
        }else{
            enterprises = enterpriseRepository.findAll();
        }

        List<EnterpriseDto> enterprisesDto = new ArrayList<>();
        for(Enterprise enterprise : enterprises){
            enterprisesDto.add(new EnterpriseDto(enterprise, true));
        }
        return enterprisesDto;
    }

    @Override
    public EnterpriseDto getEnterprise(Long id) {
        Enterprise enterprise = enterpriseRepository.findById(id).orElse(null);
        if(enterprise != null){
            return new EnterpriseDto(enterprise, false);
        }
        throw new NotFound("404", "Not Found");
    }
}
