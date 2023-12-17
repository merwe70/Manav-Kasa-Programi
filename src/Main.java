import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        double armutPrice= 2.14, elmaPrice= 3.67, domatesPrice = 1.11, muzPrice = 0.95, patlicanPrice = 5.0,
        armut,elma,domates,muz,patlican, total;

        Scanner input =new Scanner(System.in);
        System.out.println("Kaç Kilo Armut Aldınız? : ");
        armut= input.nextDouble();
        System.out.println("Kaç Kilo Elma Aldınız? : ");
        elma= input.nextDouble();
        System.out.println("Kaç Kilo Domates Aldınız? : ");
        domates= input.nextDouble();
        System.out.println("Kaç Kilo Muz Aldınız? : ");
        muz= input.nextDouble();
        System.out.println("Kaç Kilo Patlıcan Aldınız? : ");
        patlican= input.nextDouble();

        total= (armutPrice*armut)+(elmaPrice*elma)+(domatesPrice*domates)+(muzPrice*muz)+(patlicanPrice*patlican);

        System.out.println("Toplam Tutar : " + total);








        }
    }
