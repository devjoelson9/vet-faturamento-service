package br.com.vet.faturamento.domain.repository;

import br.com.vet.faturamento.domain.model.ItemAtendimento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ItemAtendimentoRepository extends JpaRepository<ItemAtendimento, Long> {

    Optional<ItemAtendimento> findByIdAndAtendimentoIdAndDeletadoEmIsNull(Long id, Long atendimentoId);

    List<ItemAtendimento> findByAtendimentoIdAndDeletadoEmIsNullOrderByCriadoEmAsc(Long atendimentoId);
}
