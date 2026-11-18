package br.com.vet.faturamento.application.dto.request;

import br.com.vet.faturamento.domain.enums.StatusItem;
import jakarta.validation.constraints.NotNull;

public record StatusItemRequest(
        @NotNull(message = "Status é obrigatório")
        StatusItem status
) {
}
