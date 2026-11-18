package br.com.vet.faturamento.application.dto.response;

import br.com.vet.faturamento.domain.enums.StatusPagamento;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record PagamentoResponse(
        Long id,
        Long atendimentoId,
        BigDecimal valor,
        StatusPagamento status,
        LocalDateTime registradoEm,
        LocalDateTime pagoEm
) {
}
