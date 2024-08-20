import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double mat,fizik,kimya,turkce,tarih;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik dersi notunuz : ");
        mat = input.nextDouble();
        System.out.print("Fizik dersi notunuz : ");
        fizik = input.nextDouble();
        System.out.print("Kimya dersi notunuz : ");
        kimya = input.nextDouble();
        System.out.print("Türkçe dersi notunuz : ");
        turkce = input.nextDouble();
        System.out.print("Tarih dersi notunuz : ");
        tarih = input.nextDouble();

        double ort = (mat+fizik+kimya+turkce+tarih)/5;
        System.out.println("Ortlama : " + ort);

        if(ort < 60){
            System.out.println("Sınıfta kaldın.");
        } else {
            System.out.println("Sınıfı geçtin.");
        }


    }
}
