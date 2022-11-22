package sorular_array;

public class S5_ilhan {

    public static void main(String[] args) {

        //Soru 2 - Verilen bir array'deki pozitif tamsayilari toplayip
        //         sonucu bize donduren bir method yaziniz.

        System.out.println(toplam());

    }

    public static int toplam() {

        int[] arr = {3, -3, 5, -7, -6, 1, -2, 3, 5};

        int toplam = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0) {

                toplam += arr[i];
            }
        }

        return toplam;

    }
}

