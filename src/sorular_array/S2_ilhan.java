package sorular_array;

import java.util.Arrays;

public class S2_ilhan {

    public static void main(String[] args) {


        // arr in 3. indexini 20 yap

        // arr'in lenght gosteriniz

        // arr'in son elementini yazdirin

        // arr'in tum elementlerini yazdir

        // arr'de 6 yi sil 5 yap

        int[] arr = {2,4,6,8,10};

        arr[3]=20;

        System.out.println(Arrays.toString(arr));

        System.out.println(arr.length);

        System.out.println(arr[arr.length-1]);

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] +" ");
        }



    }
}
