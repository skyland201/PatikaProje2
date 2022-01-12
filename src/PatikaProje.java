import java.sql.SQLOutput;
import java.util.Scanner;

public class PatikaProje {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik;
        double Ortalama;

        System.out.println("Matematik notunuzu giriniz: ");
        Matematik=input.nextInt();
        System.out.println("Fizik notunuzu giriniz: ");
          Fizik=input.nextInt();
        System.out.println("Kimya notunuzu giriniz: ");
          Kimya=input.nextInt();
        System.out.println("Türkçe notunuzu giriniz: ");
          Türkçe=input.nextInt();
        System.out.println("Tarih notunuzu giriniz: ");
          Tarih=input.nextInt();
        System.out.println("Müzik notunuzu giriniz: ");
          Müzik=input.nextInt();
        Ortalama=(Matematik+Fizik+Kimya+Tarih+Türkçe+Müzik)/6;
          System.out.println("Ortalamanız: "+Ortalama);
          String str=(Ortalama>60)? "Sınıfı Geçti." : "Sınıfta Kaldı.";
        System.out.println(str);

    }
}
