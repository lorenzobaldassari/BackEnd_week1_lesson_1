import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        System.out.println("inserisci la base");
        Scanner input1 = new Scanner(System.in);
        double base= Integer.parseInt(input1.nextLine());
        System.out.println("inserisci l'altezza");
        Scanner input2 = new Scanner(System.in);
        double altezza= Integer.parseInt(input2.nextLine());
        double perimetroRettangolo= rett(base,altezza);
        System.out.println("il preimetro del reattognolo e' "+perimetroRettangolo);

        System.out.println("Scegli un numero intero");
        Scanner input5 = new Scanner(System.in);
        int numer= Integer.parseInt(input5.nextLine());
        int numeroEstratto=par(numer);

        if (numeroEstratto==0)
                 {System.out.println("il numero e' pari");}
             else{System.out.println("il numero e' dispari");}





        System.out.println("inserisci la base");
        Scanner input3 = new Scanner(System.in);
        double baseTri= Integer.parseInt(input3.nextLine());
        System.out.println("inserisci l'altezza");
        Scanner input4 = new Scanner(System.in);
        double altezzaTri= Integer.parseInt(input4.nextLine());
        double areaTrinangolo= tri(baseTri,altezzaTri);
        System.out.println("l'area del triangolo e' "+areaTrinangolo);



    }
    public static double rett(double base,double altezza){
        return (base+altezza)*2;
    }
    public static double tri(double base,double altezza){
        return (base*altezza)/2;
    }
    public static int par(int num1){
          return num1%2;


    }

}
