package br.erik5594.ioasysapi.repository;

import br.erik5594.ioasysapi.entity.Enterprise;
import br.erik5594.ioasysapi.entity.EnterpriseType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author erik_
 * Data Criacao: 03/11/2020 - 10:56
 */

@Repository
public interface EnterpriseRepository extends JpaRepository<Enterprise, Long> {

    @Query("Select e from Enterprise e where upper(e.enterpriseName) like upper(:name) ")
    List<Enterprise> findAllByEnterpriseName(@Param("name") String name);

    List<Enterprise> findAllByEnterpriseType(EnterpriseType enterpriseType);

    @Query("Select e from Enterprise e where upper(e.enterpriseName) like upper(:name) or e.enterpriseType = :enterpriseType")
    List<Enterprise> findAllByEnterpriseNameOrEnterpriseType(@Param("name") String name, @Param("enterpriseType") EnterpriseType enterpriseType);
}
