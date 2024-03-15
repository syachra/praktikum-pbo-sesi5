
import java.util.Scanner;


public class HitungBangunDatar {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        
        System.out.println("1.Bujursangkar");
        System.out.println("2.Persegi panjang");
        System.out.println("---Isikan Pilihan---");
        
        System.out.print("pilihlah : ");
        int pilihan = sc.nextInt();
        
        if(pilihan==1){
            System.out.println("Masukan nilai Sisi: ");
            int s = sc.nextInt();
            BujurSangkar bs = new BujurSangkar(s);
            System.out.println(bs);
        }
        else if(pilihan==2){
            System.out.println("Masukan nilai panjang: ");
            int p = sc.nextInt();
            
            System.out.println("Masukan nilai lebar: ");
            int l = sc.nextInt();
            
            PersegiPanjang ps = new PersegiPanjang(p, l);
            System.out.println(ps);
        }
    }
    
}
