import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {5,61,7,2,3,3,1,5,5,2,7,7,7,2,1,1,1};

        System.out.println("Array => " + Arrays.toString(array));
        Arrays.sort(array);
        
        System.out.println("Frequency of each element : ");
        int count = 1;
        for (int i = 0; i < array.length - 1; i++) {
            if(array[i] == array[i + 1]) {
                // Eğer bir sonraki eleman aynıysa sayacı artırıyoruz.
                count++;
            } else {
                // Eğer bir sonraki eleman farklıysa, mevcut elemanın tekrar sayısını yazdırıyoruz.
                System.out.println(array[i] + " repeated " + count + " times!");
                // Sonraki eleman için sayaç sıfırlanır.
                count = 1;
            }
        }

        System.out.println(array[array.length - 1] + " repeated " + count + " times!");

    }
}
