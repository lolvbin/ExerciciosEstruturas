import java.util.Scanner;

public class TemperaturaAmbiente {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double valorTemperatura = 0, totalTemperatura = 0, mediaTemperatura = 0;
        int calor = 0, qt = 0;

        System.out.print("Digite a temperatura atual (ou -111 para encerrar): ");
        valorTemperatura = input.nextDouble();

        while(valorTemperatura != -111){
            totalTemperatura += valorTemperatura;
            qt++;

                if(valorTemperatura > 30){
                    calor++;
                }

            System.out.print("Digite a temperatura atual (ou -111 para encerrar): ");
            valorTemperatura = input.nextDouble();
            }
        input.close();

        if(qt > 0){
            mediaTemperatura = totalTemperatura / qt;
            System.out.println("A media de temperatura do dia foi: " + mediaTemperatura);

            if(calor > 0){
                System.out.println("Alerta Calor!\nA temperatura ultrapassou 30 graus " + calor + " vezes!");
            }
        }else{
            System.out.println("Nenhuma temperatura válida foi registrada.");
        }

        mediaTemperatura = totalTemperatura / qt;

        System.out.println("A media de temperatura do dia foi: " +  mediaTemperatura);
        if(calor > 1){
            System.out.println("Alerta Calor!\nA temperatura ultrapassou 30 graus " + calor + " vezes!");
        }
        System.out.println("A temperatura ultrapassou 30 graus " + calor + " vezes!");
    }
}
