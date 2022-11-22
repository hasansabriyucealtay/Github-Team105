package sorular_forloop;

public class S3_ForLoop {
    public static void main(String[] args) {

       // Kullanicidan bir String isteyin ve String’i tersine cevirip kaydedin.

        String input = "java her gecen gun guzellesiyor";

        String tersInput = "";

        for (int i = input.length()-1; i >=0 ; i--) {

            tersInput+=input.substring(i,i+1);

        }
        System.out.println(tersInput);


    }
}
