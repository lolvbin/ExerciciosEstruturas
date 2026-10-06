import java.util.Scanner;

public class NotasFiscais {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int codigoProduto, quantidade, precoUnitario = 0;
        double precoFinal, precoDesconto, precoNota = 0;

        System.out.print("Digite o codigo do produto: ");
        codigoProduto = input.nextInt();

        if(codigoProduto <= 0 || codigoProduto > 40) {
            System.out.println("Código Invalido!\n Tente novamente!");
            System.exit(1);
        }

        System.out.print("Digite o quantidade a ser comprada: ");
        quantidade = input.nextInt();

        input.close();

            if (codigoProduto >= 1 && codigoProduto <= 10) {
                precoUnitario = 10;
                precoNota = precoUnitario * quantidade;

                if(precoNota > 250 &&  precoNota <= 500){
                    precoDesconto = precoNota * 0.10;
                    precoFinal = precoNota - precoDesconto;
                }else if(precoNota > 500){
                    precoDesconto = precoNota * 0.15;
                    precoFinal = precoNota - precoDesconto;
                }else
                    precoDesconto = precoNota * 0.05;
                    precoFinal = precoNota - precoDesconto;

                    System.out.println("O valor unitario do produto comprado é R$ " + precoUnitario);
                    System.out.println("Segue o valor total da nota: R$ " + precoNota);
                    System.out.println("Segue o valor do desconto: R$ " + precoDesconto);
                    System.out.println("Segue o valor final da nota com desconto: R$ " + precoFinal);
            }else if(codigoProduto > 10 && codigoProduto <= 20){
                precoUnitario = 15;
                precoNota = precoUnitario * quantidade;

                if(precoNota > 250 &&  precoNota <= 500){
                    precoDesconto = precoNota * 0.10;
                    precoFinal = precoNota - precoDesconto;
                }else if(precoNota > 500){
                    precoDesconto = precoNota * 0.15;
                    precoFinal = precoNota - precoDesconto;
                }else
                    precoDesconto = precoNota * 0.05;
                precoFinal = precoNota - precoDesconto;

                System.out.println("O valor unitario do produto comprado é R$ " + precoUnitario);
                System.out.println("Segue o valor total da nota: R$ " + precoNota);
                System.out.println("Segue o valor do desconto: R$ " + precoDesconto);
                System.out.println("Segue o valor final da nota com desconto: R$ " + precoFinal);
            }else if(codigoProduto > 20 && codigoProduto <= 30){
                precoUnitario = 20;
                precoNota = precoUnitario * quantidade;

                if(precoNota > 250 &&  precoNota <= 500){
                    precoDesconto = precoNota * 0.10;
                    precoFinal = precoNota - precoDesconto;
                }else if(precoNota > 500){
                    precoDesconto = precoNota * 0.15;
                    precoFinal = precoNota - precoDesconto;
                }else
                    precoDesconto = precoNota * 0.05;
                precoFinal = precoNota - precoDesconto;

                System.out.println("O valor unitario do produto comprado é R$ " + precoUnitario);
                System.out.println("Segue o valor total da nota: R$ " + precoNota);
                System.out.println("Segue o valor do desconto: R$ " + precoDesconto);
                System.out.println("Segue o valor final da nota com desconto: R$ " + precoFinal);
            } else {
                precoUnitario = 30;
                precoNota = precoUnitario * quantidade;

                if(precoNota > 250 &&  precoNota <= 500){
                    precoDesconto = precoNota * 0.10;
                    precoFinal = precoNota - precoDesconto;
                }else if(precoNota > 500){
                    precoDesconto = precoNota * 0.15;
                    precoFinal = precoNota - precoDesconto;
                }else
                    precoDesconto = precoNota * 0.05;
                precoFinal = precoNota - precoDesconto;

                System.out.println("O valor unitario do produto comprado é R$ " + precoUnitario);
                System.out.println("Segue o valor total da nota: R$ " + precoNota);
                System.out.println("Segue o valor do desconto: R$ " + precoDesconto);
                System.out.println("Segue o valor final da nota com desconto: R$ " + precoFinal);
            }
    }
}
