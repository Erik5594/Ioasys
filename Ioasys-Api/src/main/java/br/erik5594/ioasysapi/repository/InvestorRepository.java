package br.erik5594.ioasysapi.repository;

import br.erik5594.ioasysapi.entity.Investor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author erik_
 * Data Criacao: 03/11/2020 - 17:22
 */

@Repository
public interface InvestorRepository extends JpaRepository<Investor, Long> {
    Investor findByEmail(String email);
}
