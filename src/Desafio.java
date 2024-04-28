import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Renata";
        String tipoDeConta = "conta corrente";
        double saldo = 1599.99;
        System.out.println("*****************************");
        System.out.println("\nNome do cliente:" + nome);
        System.out.println("tipo de conta:" + tipoDeConta);
        System.out.println("saldo:" + saldo);
        System.out.println("\n*****************************");
        String menu = """
                * Digite sua opcao
                01- consult de saldo
                02- transferencia
                03- depositar
                04- sair
                     
                """;

        int opcao = 0;
        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1){
                System.out.println("seu saldo e de :" + saldo);
                System.out.println("\n*****************************");
            } else if (opcao == 2) {
                System.out.println("qual o valor que deseja transferir?");
                System.out.println("\n*****************************");
//                funcao abaixo le oque o cliente vai digitar
                double valor = leitura.nextDouble();
                if (valor > saldo){
                    System.out.println("transferencia n aprovada, saldo insuficiente");
                    System.out.println("\n*****************************");
                } else  {
//                     saldo recebe saldo menos o valor
                    saldo = saldo -valor;
                    System.out.println("transferencia realizada com sucesso, saldo atualizado:" + saldo);
                    System.out.println("\n*****************************");
                }
            } else if (opcao == 3) {
                System.out.println("qual valor a depositar");
                System.out.println("\n*****************************");
                double  valor = leitura.nextInt();
                saldo += valor;
                System.out.println("deposito realizado com sucesso, saldo atualizado:" + saldo);
                System.out.println("\n*****************************");
            } else if (opcao != 4) {
                System.out.println("opcao invalida");
                System.out.println("\n*****************************");
            }
        }

    }
}
