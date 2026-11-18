
package br.com.vet.faturamento.application.gateway;

public interface AgendamentoGateway {

    void validarInicioAtendimento(
            Long agendamentoId,
            Long animalId,
            Long veterinarioId
    );

    void alterarStatus(Long agendamentoId, String novoStatus);
}
