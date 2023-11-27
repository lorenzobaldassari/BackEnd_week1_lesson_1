
public class Main3 {
    public static void main(String[] args) {
        int num1=5;
        int num2=4;
        int product = prodotto(num1,num2);
        System.out.println("il prodotto di "+num1+" e "+num2+ " e' " +product);
        String concatena = concat("spartan",4);
        System.out.println("concatena e'"+concatena);
        String [] arrayOfString1={"ciao","mi","chiamo","lorenzo","baldassari"};
        String[] attayInserito= inserisciArray(arrayOfString1,"blablala");
        System.out.println("inserisci array e' "+attayInserito);
        }

        public static int prodotto(int x, int y){
        return x*y;
        }
        public static String concat(String string1, int num1){
        return string1 + num1;
        }
        public static String[] inserisciArray(String[] array3,String string3){
        String[] finalArray= {array3[0],array3[1],string3,array3[2],array3[3],array3[4]};
        return  finalArray;

        }
   }
