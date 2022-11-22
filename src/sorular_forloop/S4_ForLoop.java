package sorular_forloop;

public class S4_ForLoop {
    public static void main(String[] args) {


        // kullanicinin verdigi sayinin faktoryelini bulalim

        int sayi = 10;

        int faktoryel=1;

        for (int i = sayi; i >=1 ; i--) {

            faktoryel=faktoryel*i;

        }

        System.out.println(faktoryel);




    }
}
