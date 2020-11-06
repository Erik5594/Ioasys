package br.erik5594.ioasysapi.resources;

import br.erik5594.ioasysapi.dto.EnterpriseDto;
import br.erik5594.ioasysapi.dto.EnterpriseListResponseDto;
import br.erik5594.ioasysapi.dto.EnterpriseResponseDto;
import br.erik5594.ioasysapi.dto.SalvarListaEnterpriseDto;
import br.erik5594.ioasysapi.services.EnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author erik_
 * Data Criacao: 30/10/2020 - 16:55
 */

@RestController
@RequestMapping("/api")
public class EnterpriseResource {

    @Autowired
    private EnterpriseService enterpriseService;

    @RequestMapping(value = "/v1/enterprises/{id}", method = RequestMethod.GET)
    public ResponseEntity buscar(@PathVariable("id") Long id){
        EnterpriseDto enterpriseDto = enterpriseService.getEnterprise(id);
        return ResponseEntity.status(HttpStatus.OK).body(new EnterpriseResponseDto(enterpriseDto));
    }

    @RequestMapping(value = "/v1/enterprises", method = RequestMethod.GET)
    public ResponseEntity listar(@RequestParam(value = "enterprise_types", required = false) Long id,
                                 @RequestParam(name = "name", required = false) String name){
        return ResponseEntity.status(HttpStatus.OK).body(new EnterpriseListResponseDto(enterpriseService.listEnterprise(id, name)));
    }
}
