package br.com.vet.faturamento.domain.repository;

import br.com.vet.faturamento.domain.enums.StatusItem;
import br.com.vet.faturamento.domain.model.Medicamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;
import java.util.Optional;

public interface MedicamentoRepository extends JpaRepository<Medicamento, Long>, JpaSpecificationExecutor<Medicamento> {

    Optional<Medicamento> findByIdAndDeletadoEmIsNull(Long id);

    boolean existsByNomeIgnoreCaseAndDeletadoEmIsNull(String nome);

    boolean existsByNomeIgnoreCaseAndDeletadoEmIsNullAndIdNot(String nome, Long id);

    List<Medicamento> findByDeletadoEmIsNullAndStatusOrderByNomeAsc(StatusItem status);
}
