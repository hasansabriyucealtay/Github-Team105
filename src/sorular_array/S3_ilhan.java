package sorular_array;

import java.util.Arrays;

public class S3_ilhan {

    public static void main(String[] args) {

        String[] arr = {"Ali", "Ulus", "Nesrin"};

        // bu array'in tum elementlerini aralarinda bir bosluk birakarak azdiralim

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");

        }
        System.out.println();
        System.out.println(Arrays.toString(arr));
    }
}
