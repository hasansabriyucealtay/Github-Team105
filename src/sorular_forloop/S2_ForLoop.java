package sorular_forloop;

public class S2_ForLoop {

    public static void main(String[] args) {

        // verilen in sayinin rakamlar toplamini bulunuz

        int sayi = 1453;
        int rakamlartoplam = 0;
        int birlerbasamagi = 0;

        String str = ""+sayi;


        for (int i = 0; i < str.length(); i++) {

           birlerbasamagi=sayi%10;
           rakamlartoplam+=birlerbasamagi;
           sayi = sayi/10;
        }
        System.out.println(rakamlartoplam);
    }
}
