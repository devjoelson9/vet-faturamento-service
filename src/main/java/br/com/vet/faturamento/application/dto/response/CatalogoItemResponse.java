package br.com.vet.faturamento.application.dto.response;

import br.com.vet.faturamento.domain.enums.TipoItemCatalogo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record CatalogoItemResponse(
        Long id,
        TipoItemCatalogo tipo,
        String nome,
        String descricao,
        BigDecimal valorBase,
        String status,
        LocalDateTime criadoEm,
        LocalDateTime atualizadoEm
) {
}
