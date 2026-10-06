import java.util.Scanner;

public class IntervaloAberto {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int somaPares = 0;

        System.out.print("Informe o limite inferiror: ");
        int inferior = scanner.nextInt();
        System.out.print("Informe o limite superior: ");
        int superior = scanner.nextInt();

        for(int i = inferior + 1; i < superior; i++){
            if(i%2==0){
                System.out.println(i);
                somaPares += i;
            }
       }
        System.out.println("A soma dos números pares do intervalo informado é: " + somaPares);
    }
}
