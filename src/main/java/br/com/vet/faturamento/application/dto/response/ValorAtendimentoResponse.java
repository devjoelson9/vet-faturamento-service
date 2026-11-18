package br.com.vet.faturamento.application.dto.response;

import java.math.BigDecimal;

public record ValorAtendimentoResponse(
        Long atendimentoId,
        BigDecimal valorBase,
        BigDecimal valorProcedimentos,
        BigDecimal valorMedicamentos,
        BigDecimal valorTotal
) {
}
