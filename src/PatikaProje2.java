import java.util.Scanner;

public class PatikaProje2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Ücret Tutarını Giriniz: ");
        int ücret=input.nextInt();
        double kdvli_tutar;
        double kdv= (ücret>1000)?0.08:0.18;
        kdvli_tutar=ücret*kdv+ücret;
        System.out.println("KDV'li tutar: "+kdvli_tutar);
        System.out.println("KDV'siz tutar: "+ücret);
        System.out.println("KDV oranı: "+kdv);

    }
}
