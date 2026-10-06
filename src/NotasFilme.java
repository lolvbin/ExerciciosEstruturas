import java.util.Scanner;

public class NotasFilme
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int qtdOtimo = 0, qtdRegular = 0, qtdBom = 0, qtdRuim = 0, qtdPessimo = 0;
        int somaIdadesRuim = 0, maiorIdadePessimo = -1, maiorIdadeOtimo = -1, maiorIdadeRuim = -1;
        double espectadores = 1, diffOtimoRuim = 0, mediaRuim= 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite sua idade: ");
            int idade = scanner.nextInt();

            System.out.print("Digite sua nota para o filme: ");
            char nota = scanner.next().charAt(0);

            if(nota == 'A'){
                qtdOtimo++;
                if(idade > maiorIdadeOtimo){
                    maiorIdadeOtimo = idade;
                }
            } else if(nota == 'B'){
                qtdBom++;
            } else if(nota == 'C'){
                qtdRegular++;
            } else if(nota == 'D'){
                qtdRuim++;
                somaIdadesRuim += idade;
                if(idade > maiorIdadeRuim){
                    maiorIdadeRuim = idade;
                }
            } else if(nota == 'E'){
                qtdPessimo++;
                if(idade > maiorIdadePessimo){
                    maiorIdadePessimo = idade;
                }
            }
        }

        scanner.close();

        double percBom = (qtdBom / 5.0) * 100;
        double percRegular = (qtdRegular / 5.0) * 100;
        double percPessimo = (qtdPessimo / 5.0) * 100;

        double diffBomRegular = Math.abs(percBom - percRegular);

        if(qtdRuim > 0){
            mediaRuim = somaIdadesRuim / qtdRuim;
        }

        if(maiorIdadeOtimo != -1 && maiorIdadeRuim != -1){
            diffOtimoRuim = Math.abs(maiorIdadeOtimo - maiorIdadeRuim);
        }

        System.out.println("");
        System.out.println("Quantidade de notas ótimas: " + qtdOtimo);
        System.out.println("Diferença percentual entre Bom e Regular: " + diffBomRegular +"%");
        System.out.println("Média de idade das pessoas que responderam ruim: " + mediaRuim);
        System.out.println
                ("Porcentagem de respostas péssimo: " + percPessimo + "%" + "\nMaior idade que utilizou a opção pessimo: " + maiorIdadePessimo);
        System.out.println("Diferença de idade entre a maior idade que respondeu ótimo e a maior idade que respondeu ruim: " + diffOtimoRuim);

    }
}