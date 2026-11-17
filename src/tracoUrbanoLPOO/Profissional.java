package tracoUrbanoLPOO;

import java.util.UUID;

public class Profissional extends Pessoa {
    private String especialidade;
    private double percentualComissao;
    private Agenda agenda;

    public Profissional(String nome, String cpf, String telefone, String email, String especialidade, double percentualComissao) {
        super(UUID.randomUUID().toString(), nome, cpf, telefone, email);
        this.especialidade = especialidade;
        this.percentualComissao = percentualComissao;
        this.agenda = new Agenda();
    }

    public Agenda getAgenda() {
        return agenda;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void getPapel() {
        System.out.println("Papel: Profissional");
    }

    public void calcularComissao(double valorServico) {
        double comissao = valorServico * (percentualComissao / 100);
        System.out.println("Comissão: R$ " + comissao);
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Email: " + getEmail());
        System.out.println("Profissão: " + especialidade);
    }
    
}