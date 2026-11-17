package tracoUrbanoLPOO;

public abstract class Pessoa {
    private String id;
    private String nome;
    private String cpf;
    private String telefone;
    private String email;

    public Pessoa(String id, String nome, String cpf, String telefone, String email) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void getPapel() {
        System.out.println("Papel: " + this.getClass().getSimpleName());
    }

    public abstract void exibirInformacoes();
}
