import java.util.Scanner;

public class leitura {
    public static void main(String[] args) {
//        imp biblioteca usa Scanner coloca o nome do arquivo new Scanner e systen ponto a funcao, systen. in permite identificar o toque no teclado
        Scanner leitura = new Scanner(System.in);
//        ponto nextLine permite ver oque eu digitei
        System.out.println("digite seu filme favorito");
        String filme = leitura.nextLine();
        System.out.println(filme);
        System.out.println("qual o ano de lancaento?");
//        nextIn permite ler um lumero inteiro
        int anoDeLancamento = leitura.nextInt();
        System.out.println(anoDeLancamento);
        System.out.println("qual e a sua nota para o filme");
       double avaliacao = leitura.nextDouble();
        System.out.println(avaliacao);
    }
}
