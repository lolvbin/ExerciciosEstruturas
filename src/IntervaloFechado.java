import java.util.Scanner;

public class IntervaloFechado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro valor: ");
        int n1 = scanner.nextInt();
        System.out.print("Informe o segundo valor: ");
        int n2 = scanner.nextInt();

        if(n1>n2){
            for(int i = n1; i >= n2; i--){
                System.out.println(i);
            }
        }else if(n2>n1){
            for(int i = n1; i <= n2; i++){
                System.out.println(i);
            }
        }
    }
}
