package tracoUrbanoLPOO;

public enum StatusAgendamento {
    AGENDADO("Agendado"),
    CANCELADO("Cancelado"),
    CONCLUIDO("Concluído"),
    PENDENTE("Pendente");


    private final String descricao;

    StatusAgendamento(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
