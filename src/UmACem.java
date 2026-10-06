public class UmACem {
    public static void main(String[] args) {
        double quadrado = 0, cubo = 0;

        for(int i=1;i<=100;i++){
            if(i%2==0){
                cubo = Math.pow(i, 3);
                System.out.println(i + " - " + cubo);
            }else{
                quadrado = Math.pow(i, 2);
                System.out.println(i + " - " + quadrado);
            }
        }
    }
}
