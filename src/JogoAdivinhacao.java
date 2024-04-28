import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        int numeroAleatorio = random.nextInt(100);
        int tentativas = 5;
        boolean acertou = false;

        System.out.println("--- Jogo adivinhação Número ---");

        for(int i = 0; i <= tentativas; i++) {
            System.out.println("Digite um número de 0 a 100:");
            int numeroChute = entrada.nextInt();


            if (numeroChute == numeroAleatorio) {
                System.out.println("Parabéns! Você acertou!");
                return;
            }else if(numeroChute > numeroAleatorio) {
                System.out.println("Tente novamente, o valor do número é menor");
            }else {
                System.out.println("Tente novamente, o valor do número é maior");
            }
        }

        if(!acertou) {System.out.println("Acabaram suas tentativas, você perdeu! O número correto era: " + numeroAleatorio);}
        entrada.close();
    }
}

