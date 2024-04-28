public class condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 1986;
       boolean incluidoNoPlano = true;
       double notaDoFilme = 8.1;
        String tipoPlano = "plus";

       if (anoDeLancamento >= 2022){
           System.out.println("lancamento que os clientes estao curtindo");
       } else {
           System.out.println("filme retro que vale a pena assistir");
       }

//       se estiver incluido no plano, E for plus o filme esta liberado
       if (incluidoNoPlano == true && tipoPlano.equals("plus") ){
           System.out.println("Fiilme liberado");
       }else {
           System.out.println("tera que pagar a locacao");
        }
    }
}
