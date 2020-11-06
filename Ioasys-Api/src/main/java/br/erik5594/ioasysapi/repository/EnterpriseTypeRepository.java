package br.erik5594.ioasysapi.repository;

import br.erik5594.ioasysapi.entity.EnterpriseType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author erik_
 * Data Criacao: 03/11/2020 - 10:06
 */

@Repository
public interface EnterpriseTypeRepository extends JpaRepository<EnterpriseType, Long> {
}
