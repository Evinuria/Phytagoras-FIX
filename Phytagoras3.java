import java.util.Scanner;
class Phytagoras3 {
    int pilih[]={1,2,3};
    //float a[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26};
    //float b[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26};
    double a;
    double b;
    double c;
    int pitagoras;
public Phytagoras3(){}
    public void pitagoras1(){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan a =  ");
        a=input.nextInt();
        System.out.println("Masukkan b =  ");
        b=input.nextInt();
        c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        System.out.println("c =" + c);
    }
    public void pitagoras2(){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan c =  ");
        c=input.nextInt();
        System.out.println("Masukkan b =  ");
        b=input.nextInt();
        a = Math.sqrt(Math.pow(c,2) - Math.pow(b,2));
    System.out.println("a =" + a);
    }
    public void pitagoras3(){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan c =   ");
        c=input.nextInt();
        System.out.println("Masukkan a =   ");
        a=input.nextInt();
        b = Math.sqrt(Math.pow(c,2) - Math.pow(a,2));
    System.out.println("b =" + b);
    }
}