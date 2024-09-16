import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {10,2,52,5,5,11,12,2,62,1,52};
        boolean flag = false;

        System.out.println("Array => " + Arrays.toString(array));
        Arrays.sort(array);

        System.out.print("Repeating even numbers in array : ");
        for(int i = 1; i < array.length - 1; i++) {
            if((array[i - 1] == array[i]) && (array[i] % 2 == 0) && (array[i] != array[i + 1])) {
                System.out.print(array[i] + " ");
                flag = true;
            }
        }

        if(array[array.length - 2] == array[array.length - 1]) {
            System.out.print(array[array.length-1] + " ");
        }

        if(!flag) {
            System.out.println("------");
        }

    }
}
