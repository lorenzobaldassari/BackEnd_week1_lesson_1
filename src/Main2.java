import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main2 {
    public static void main(String[] args) {
        System.out.println("inserisci una stringa e premi invio");
        Scanner input1 = new Scanner(System.in);
        String name1= input1.nextLine();
        System.out.println("inserisci una stringa e premi invio");
        Scanner input2 = new Scanner(System.in);
        String name2= input2.nextLine();
        System.out.println("inserisci una stringa e premi invio");
        Scanner input3 = new Scanner(System.in);
        String name3= input3.nextLine();
        String linear = string1(name1,name2,name3);
        String linear2 = stringReverse(name1,name2,name3);
        System.out.println(linear);
        System.out.println(linear2);
    }
    public static String string1(String str1,String str2,String str3){
        return str1+" "+str2+" "+str3;
    }
    public static String stringReverse(String str1,String str2,String str3){
        return str3+" "+str2+" "+str1;
    }
}