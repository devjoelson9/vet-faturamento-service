package br.com.vet.faturamento.application.event;

import br.com.vet.faturamento.domain.model.Atendimento;

public interface AtendimentoEventPublisher {

    void publicarIniciado(Atendimento atendimento);

    void publicarFinalizado(Atendimento atendimento);

    void publicarCancelado(Atendimento atendimento);
}
