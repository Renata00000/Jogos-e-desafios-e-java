import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;

//        quero 3 notas de avalicao, entao for repete 3 vzs
        for (int i = 0; i < 3; i++) {
            System.out.println("digite sua avaliacao para o filme ");
//            psso colocar sianl de + ao em vez de repetir a plv ex mediaAvaliacao += nota;
            nota = leitura.nextDouble();
            mediaAvaliacao = mediaAvaliacao + nota;
        }

        System.out.println("a media de avaliaca e " + mediaAvaliacao/3);
    }
}
