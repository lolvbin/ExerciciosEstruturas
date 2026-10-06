public class PopulacaoPaises {
    public static void main(String[] args) {

        double populacaoA = 80000;
        double populacaoB = 200000;
        int anos = 0;

        while (populacaoA < populacaoB) {

            populacaoA = populacaoA + (populacaoA * 0.03);
            populacaoB = populacaoB + (populacaoB * 0.015);

            anos++;
        }

        System.out.println("Serão necessários " + anos + " anos.");
        System.out.println("População final do País A: " + Math.round(populacaoA));
        System.out.println("População final do País B: " + Math.round(populacaoB));
    }
}