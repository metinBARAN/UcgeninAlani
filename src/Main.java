import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a,b,c;
        double u;
        double alan;
        Scanner login= new Scanner(System.in);

        System.out.println("1.Kenari Giriniz: ");
        a=login.nextInt();

        System.out.println("2.Kenari Giriniz: ");
        b=login.nextInt();

        System.out.println("3.Kenari Giriniz: ");
        c=login.nextInt();

        u=(a+b+c)/2;
        alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Ucgenin Alani: "+alan);
    }
}
