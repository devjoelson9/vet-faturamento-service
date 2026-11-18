package br.com.vet.faturamento.domain.repository;

import br.com.vet.faturamento.domain.model.ItemPrescricao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ItemPrescricaoRepository extends JpaRepository<ItemPrescricao, Long> {

    Optional<ItemPrescricao> findByIdAndPrescricaoIdAndDeletadoEmIsNull(Long id, Long prescricaoId);

    List<ItemPrescricao> findByPrescricaoIdAndDeletadoEmIsNullOrderByCriadoEmAsc(Long prescricaoId);
}
