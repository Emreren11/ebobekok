import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);
        int a,b,ebob=0,ekok,i=1;

        System.out.println("EBOB ve EKOK değerlerinin bulunacağı 2 değeri giriniz");

        System.out.print("İlk sayı: ");
        a=inp.nextInt();

        System.out.print("İkinci sayı: ");
        b=inp.nextInt();

        while(i<=a)
        {
            if (a%i==0 && b%i==0)
                ebob=i;
            i++;
        }
        ekok=(a*b)/ebob;
        System.out.println(a+" ve "+b+" sayılarının EBOB değeri: "+ebob);
        System.out.println(a+" ve "+b+" sayılarının EKOK değeri: "+ekok);
    }
}