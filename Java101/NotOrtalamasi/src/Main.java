import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double mat,fizik,kimya,turkce,tarih;
        double toplam = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik dersi notunuz : ");
        mat = input.nextDouble();
        if(mat >= 0 && mat <= 100) {
            toplam += mat;
        }
        System.out.print("Fizik dersi notunuz : ");
        fizik = input.nextDouble();
        if(fizik >= 0 && fizik <= 100) {
            toplam += fizik;
        }
        System.out.print("Kimya dersi notunuz : ");
        kimya = input.nextDouble();
        if(kimya >= 0 && kimya <= 100) {
            toplam += kimya;
        }
        System.out.print("Türkçe dersi notunuz : ");
        turkce = input.nextDouble();
        if(turkce >= 0 && turkce <= 100) {
            toplam += turkce;
        }
        System.out.print("Tarih dersi notunuz : ");
        tarih = input.nextDouble();
        if(tarih >= 0 && tarih <= 100) {
            toplam += tarih;
        }

        double ort = toplam/5;
        System.out.println("Ortlama : " + ort);

        if(ort < 60){
            System.out.println("Sınıfta kaldın.");
        } else {
            System.out.println("Sınıfı geçtin.");
        }


    }
}
