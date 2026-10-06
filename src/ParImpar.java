import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero = 0;

        System.out.print("Digite um número: ");
        numero = input.nextInt();

        if(numero%2==0){
            System.out.println("Par");
            double quadrado = Math.pow(numero, 2);
            System.out.println("Quadrado: " + quadrado);
        }else{
            System.out.println("Impar");
            double cubo = Math.pow(numero, 3);
            System.out.println("Cubo: " + cubo);
        }
        input.close();
    }
}
