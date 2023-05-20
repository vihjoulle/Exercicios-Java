import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Peter Paker";
        String tipoConta = "Corrente";
        double saldo = 1600.29;
        int opcao = 0;

        System.out.println("*****************************");
        System.out.println("\n Nome do Cliente: " + nome);
        System.out.println(" Tipo de Conta: " + tipoConta);
        System.out.println(" Saldo Inicial: " + saldo);
        System.out.println("\n*****************************");

        String menu = """
                **Digite sua opção **
                1- Consultar Saldo da conta.
                2- Transferir Valor da conta.
                3- Receber valor
                """;

        Scanner leitura =new Scanner(System.in);
                        
        while (opcao != 4 ) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("O valor do seu saldo é " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor que deseja transferir");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não há saldo para realizar a sua transferência");
                } else {
                    saldo -= valor;
                    System.out.println("Novo saldo " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido:");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo " + saldo);
            } else if (opcao == 4) {
                System.out.println("Opção Inválida");

                 }
            }
        }

    }

