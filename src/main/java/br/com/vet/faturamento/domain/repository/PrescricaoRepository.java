package br.com.vet.faturamento.domain.repository;

import br.com.vet.faturamento.domain.model.Prescricao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PrescricaoRepository extends JpaRepository<Prescricao, Long> {

    Optional<Prescricao> findByAtendimentoIdAndDeletadoEmIsNull(Long atendimentoId);

    boolean existsByAtendimentoIdAndDeletadoEmIsNull(Long atendimentoId);
}
