import java.util.Scanner;

public class loopwhile {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalNota = 0;

//      enquanto nota for diferente de menos um ela imprime o print e permite digitar
        while (nota != -1) {
            System.out.println("digite sua avaliacao para o filme, ou -1 para encerrar ");
//            psso colocar sianl de + ao em vez de repetir a plv ex mediaAvaliacao += nota;
            nota = leitura.nextDouble();
//            se nota for diferente de -1 calcule a media
            if (nota != -1){
                mediaAvaliacao = mediaAvaliacao + nota;
                totalNota++;
            }
        }
        System.out.println("a media de avaliaca e " + mediaAvaliacao / totalNota);


    }
}
