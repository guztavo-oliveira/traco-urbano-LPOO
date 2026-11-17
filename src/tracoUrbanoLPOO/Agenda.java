package tracoUrbanoLPOO;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Agenda {
    private ArrayList<Agendamento> agendamentos;

    public Agenda() {
        this.agendamentos = new ArrayList<>();
    }

    public void adicionarAgendamento(Agendamento agendamento) {
        for (Agendamento a : agendamentos) {
            if (a.conflitaCom(agendamento)) {
                System.out.println("Conflito de horário com outro agendamento.");
                return;
            }
        }
        agendamentos.add(agendamento);
        System.out.println("Agendamento adicionado com sucesso.");
    }

    public void removerAgendamento(Agendamento agendamento) {
        if (agendamentos.remove(agendamento)) {
            System.out.println("Agendamento removido com sucesso.");
        } else {
            System.out.println("Agendamento não encontrado.");
        }
    }

    public ArrayList<Agendamento> consultarPorData(LocalDateTime data) {
        ArrayList<Agendamento> resultados = new ArrayList<>();
        for (Agendamento a : agendamentos) {
            if (a.getInicio().toLocalDate().equals(data.toLocalDate())) {
                resultados.add(a);
            }
        }
        return resultados;
    }

    public boolean verificarDisponibilidade(LocalDateTime inicio, Duration duracao) {
        Agendamento novoAgendamento = new Agendamento(inicio, duracao, 0, StatusAgendamento.PENDENTE);
        for (Agendamento a : agendamentos) {
            if (a.conflitaCom(novoAgendamento)) {
                return false;
            }
        }
        return true;
    }
}
