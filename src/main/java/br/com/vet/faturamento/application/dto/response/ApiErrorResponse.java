package br.com.vet.faturamento.application.dto.response;

import java.time.LocalDateTime;

public record ApiErrorResponse(
        Integer status,
        String error,
        String message,
        LocalDateTime timestamp,
        String path
) {
}
