package sorular_array;

import java.util.Arrays;

public class S4_ilhan {

    public static void main(String[] args) {


        // Soru1- Verilen bir int array'in tum elemanlarini 2 arttirip bize donduren
        //        eski array'i yeni haliyle kaydedin

        int[] arr = {2,4,6,8};

        for (int i = 0; i < arr.length; i++) {

            arr[i]=arr[i]+2;

        }
        System.out.println(Arrays.toString(arr));
    }
}
