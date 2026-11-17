package tracoUrbanoLPOO;

import java.time.Duration;
import java.time.LocalDateTime;

public class Agendamento implements Agendavel {
    private int id;
    private LocalDateTime inicio;
    private Duration duracao;
    private double valorCombinado;
    private StatusAgendamento status;

    public Agendamento(LocalDateTime inicio, Duration duracao, double valorCombinado, StatusAgendamento status) {
        this.inicio = inicio;
        this.duracao = duracao;
        this.valorCombinado = valorCombinado;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void getFim() {
        LocalDateTime fim = inicio.plus(duracao);
        System.out.println("Fim do agendamento: " + fim);
    }

    public boolean conflitaCom(Agendamento outroAgendamento) {
        LocalDateTime fim = inicio.plus(duracao);
        LocalDateTime outroFim = outroAgendamento.getInicio().plus(outroAgendamento.getDuracao());

        return (inicio.isBefore(outroFim) && fim.isAfter(outroAgendamento.getInicio()));
    }

    public LocalDateTime getTempoRestante() {
        LocalDateTime agora = LocalDateTime.now();
        LocalDateTime fim = inicio.plus(duracao);
        if (agora.isAfter(fim)) {
            return null; 
        }
        return Duration.between(agora, fim).toHours() > 0 ? agora.plus(Duration.between(agora, fim)) : null;
    }

    public LocalDateTime getInicio() {
        return inicio;
    }

    public Duration getDuracao() {
        return duracao;
    }

    public double getValorCombinado() {
        return valorCombinado;
    }

    public StatusAgendamento getStatus() {
        return status;
    }

    @Override
    public void cancelarAgendamento() {
        this.status = StatusAgendamento.CANCELADO;
        System.out.println("Agendamento cancelado.");
    }
}
