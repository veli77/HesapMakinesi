import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n1,n2,secenek;
        Scanner input = new Scanner(System.in);
        System.out.println("ilk sayıyı giriniz= ");
        n1=input.nextInt();
        System.out.println("ikinci sayıyı giriniz= ");
        n2=input.nextInt();

        System.out.println("1 = Toplama\n2 = Çıkarma\n3 = Çarpma\n4 = Bölme");
        System.out.println("Seçiniz : ");
        secenek = input.nextInt();

        switch (secenek){
            case 1:
                System.out.println("Toplam = "+(n1+n2));
                break;
            case 2:
                System.out.println("Fark = "+(n1-n2));
                break;
            case 3:
                System.out.println("Çarpım = "+(n1*n2));
                break;
            case 4:
                System.out.println("Bölüm = "+(n1/n2));
                break;
            default:
                System.out.println("Seçim hatalı");
                break;

        }

    }




}
