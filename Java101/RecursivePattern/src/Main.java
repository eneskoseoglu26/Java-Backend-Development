import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);

        System.out.print("N = ");
        n = input.nextInt();

        boolean isDecreasing = true;

        pattern(n,n,isDecreasing);

    }

    static void pattern(int n, int originalN, boolean isDecreasing) {

        // Sayıyı ekrana yazdır
        System.out.print(n + " ");

        // Eğer sayı azalıyor ve 0 veya negatif ise artırmaya başla
        if (n <= 0) {
            isDecreasing = false;
        }

        // Sayı azalıyor ve 0'dan büyükse 5 çıkar, artıyorsa 5 ekle
        if (isDecreasing) {
            pattern(n - 5, originalN, isDecreasing);
        } else if (n < originalN) {
            pattern(n + 5, originalN, isDecreasing);
        }
    }



    /*  2.ÇÖZÜM:

    public static void pattern(int n) {
        // Sayı ekrana yazdırılır
        System.out.print(n + " ");

        // Eğer sayı 0 veya negatif değilse, 5 çıkararak yeniden çağır
        if (n > 0) {
            pattern(n - 5);
        }

        // Sayı sıfır ya da negatife geldikten sonra yeniden 5 ekleyerek yazdırma aşaması
        if (n > 0) {
            System.out.print(n + " ");
        }
    }

     */

}
