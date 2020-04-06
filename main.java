import java.util.Scanner;
public class main{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("PITAGORAS");
        System.out.println("1. Mencari sisi miring segitiga siku-siku / Nilai c");
        System.out.println("2. Mencari tinggi segitiga siku-siku / Nilai a");
        System.out.println("3. Mencari alas segitiga siku-siku / Nilai b");
        System.out.println("Pilih nomer berapa = ");
        int pilih = input.nextInt();
        Phytagoras3 Soal;
        Soal = new Phytagoras3();
        if (pilih==1){Soal.pitagoras1();}
        if (pilih==2){Soal.pitagoras2();}
        if (pilih==3){Soal.pitagoras3();} 
        }
    }