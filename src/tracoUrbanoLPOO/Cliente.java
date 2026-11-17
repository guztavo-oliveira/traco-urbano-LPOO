package tracoUrbanoLPOO;

import java.time.LocalDateTime;
import java.util.UUID;

public class Cliente extends Pessoa {
    private LocalDateTime dataNascimento;

    public Cliente(String nome, String cpf, String email, String telefone, LocalDateTime dataNascimento) {
        super(UUID.randomUUID().toString(), nome, cpf, email, telefone);
        this.dataNascimento = dataNascimento;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Email: " + getEmail());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Data de Nascimento: " + dataNascimento);
    }
}