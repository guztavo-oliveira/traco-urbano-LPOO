package tracoUrbanoLPOO;

import java.util.Scanner;

public class Menu {

    private Scanner scanner;

    public Menu() {
        this.scanner = new Scanner(System.in);
    }

    public void executar() {
        int opcao;

        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    menuCadastros();
                    break;

                case 2:
                    menuAgendamentos();
                    break;

                case 3:
                    menuSessoes();
                    break;

                case 4:
                    menuOrcamentos();
                    break;

                case 5:
                    menuRetornos();
                    break;

                case 6:
                    menuRelatorios();
                    break;

                case 7:
                    menuDados();
                    break;

                case 0:
                    System.out.println("Salvando dados...");
                    // estudio.salvarDados();
                    System.out.println("Sistema encerrado. Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);
    }

    private void exibirMenu() {
        System.out.println("\n========================================");
        System.out.println("              TRAÇO URBANO");
        System.out.println("       Sistema de Gestão do Estúdio");
        System.out.println("========================================");
        System.out.println("1. Cadastros");
        System.out.println("2. Agendamentos");
        System.out.println("3. Sessões");
        System.out.println("4. Orçamentos");
        System.out.println("5. Retornos");
        System.out.println("6. Relatórios");
        System.out.println("7. Dados do Sistema");
        System.out.println("0. Sair");
        System.out.println("========================================");
        System.out.print("Escolha uma opção: ");
    }

    private void menuCadastros() {
        System.out.println("\n===== CADASTROS =====");
        System.out.println("1. Cadastrar cliente");
        System.out.println("2. Cadastrar profissional");
        System.out.println("3. Cadastrar procedimento");
        System.out.println("4. Listar clientes");
        System.out.println("5. Listar profissionais");
        System.out.println("6. Listar procedimentos");
        System.out.println("0. Voltar");
        System.out.print("Escolha uma opção: ");

        int opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 0:
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }

    private void menuAgendamentos() {
        System.out.println("\n===== AGENDAMENTOS =====");
        System.out.println("1. Realizar agendamento");
        System.out.println("2. Cancelar agendamento");
        System.out.println("3. Listar agendamentos");
        System.out.println("4. Consultar disponibilidade");
        System.out.println("5. Consultar próximos agendamentos");
        System.out.println("0. Voltar");
        System.out.print("Escolha uma opção: ");

        int opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 0:
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }

    private void menuSessoes() {
        System.out.println("\n===== SESSÕES =====");
        System.out.println("1. Registrar sessão realizada");
        System.out.println("2. Histórico de sessões por cliente");
        System.out.println("3. Consultar sessões por profissional");
        System.out.println("0. Voltar");
        System.out.print("Escolha uma opção: ");

        int opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 0:
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }

    private void menuOrcamentos() {
        System.out.println("\n===== ORÇAMENTOS =====");
        System.out.println("1. Criar orçamento");
        System.out.println("2. Consultar orçamentos");
        System.out.println("3. Aprovar orçamento");
        System.out.println("4. Recusar orçamento");
        System.out.println("5. Consultar orçamentos pendentes");
        System.out.println("0. Voltar");
        System.out.print("Escolha uma opção: ");

        int opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 0:
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }

    private void menuRetornos() {
        System.out.println("\n===== RETORNOS =====");
        System.out.println("1. Agendar retorno");
        System.out.println("2. Consultar retornos pendentes");
        System.out.println("3. Cancelar retorno");
        System.out.println("0. Voltar");
        System.out.print("Escolha uma opção: ");

        int opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 0:
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }

    private void menuRelatorios() {
        System.out.println("\n===== RELATÓRIOS =====");
        System.out.println("1. Histórico completo do cliente");
        System.out.println("2. Agenda de profissional por data");
        System.out.println("3. Próximos atendimentos");
        System.out.println("4. Tempo até a próxima sessão");
        System.out.println("5. Faturamento por profissional");
        System.out.println("6. Procedimentos mais realizados");
        System.out.println("7. Retornos pendentes");
        System.out.println("0. Voltar");
        System.out.print("Escolha uma opção: ");

        int opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 0:
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }

    private void menuDados() {
        System.out.println("\n===== DADOS DO SISTEMA =====");
        System.out.println("1. Salvar dados");
        System.out.println("2. Carregar dados");
        System.out.println("0. Voltar");
        System.out.print("Escolha uma opção: ");

        int opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao) {
            case 1:
                break;
            case 2:
                break;
            case 0:
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
}
