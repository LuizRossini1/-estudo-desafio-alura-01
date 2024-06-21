import java.util.Scanner;

public class Conta {
    public int saldo;

    public Conta (int saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void Transferencia(int valor) {
        if (valor <= 0) {
            System.out.println("Não foi possível realizar a transferência!");
        } else if (saldo < valor) {
            System.out.println("Não foi possível realizar a transferência!");
        } else {
            saldo -= valor;
            System.out.println("Transfêrencia realizada com sucesso!");
        }
    }

    public void ExibirSaldo() {
        System.out.println("Seu saldo atual é: " + saldo);
    }

    public void ReceberValor(int valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido para receber!");
        } else {
            saldo += valor;
            System.out.println("Valor recebido com sucesso!");
        }
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Conta minhaConta = new Conta(2100);
        Cliente meuCliente = new Cliente("Luz Rossini", "Corrente");

        System.out.println("Bem-vindo ao aplicativo! Cliente atual:");
        meuCliente.exibirDados();
        minhaConta.ExibirSaldo();

        String menu = ("""
                Operações:
                1 - Consultar saldo
                2 - Receber valor
                3 - Transferir valor
                4 - Sair
                """);
        System.out.println(menu);

        int escolha = 0;

        while (escolha != 4) {
            escolha = leitor.nextInt();
            System.out.println(menu);

            switch (escolha) {
                case 1:
                    minhaConta.ExibirSaldo();
                    break;
                case 2:
                    System.out.println("Digite o valor a ser recebido:");
                    int valorRecebido = leitor.nextInt();
                    minhaConta.ReceberValor(valorRecebido);
                    minhaConta.ExibirSaldo();
                    break;
                case 3:
                    System.out.println("Digite o valor para ser tranferido:");
                    minhaConta.Transferencia(leitor.nextInt());
                    minhaConta.ExibirSaldo();
                    break;
                case 4:
                    System.out.println("Fechando aplicativo. Até mais!");
                    leitor.close();
                    break;
                default:
                    System.out.println("Operação inválida!");
                    break;
            }
        }
            leitor.close();
    }
}