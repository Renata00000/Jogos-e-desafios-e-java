

public class Main {
    public static void main(String[] args) {
        System.out.println("Esse e o Screen Match");
        System.out.println("Filme: top gun: Maverick");

        int anoDoLancamento =2022;
        System.out.println("Ano do lancamento:" + anoDoLancamento);
        boolean incluidoNoPlano = true;
        double  notaDoFilme = 8.1;

        double media = (9.8 + 6.3 + 8.0) /3;
        System.out.println(media);
        String sinopse;
//ao colocar em 3 "" vc pode colocar tos os prints  e pular linha, sem ter a nescessidade de fazer varioss prints
        sinopse = """
                  Filme top Gun
                  filme de aventura com gala dos anos 80
                  ano de lancamento
                  """ + anoDoLancamento;
        System.out.println(sinopse);
    }
}