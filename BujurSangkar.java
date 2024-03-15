
public class BujurSangkar extends BangunDatar{
    
    BujurSangkar(int s){
        super(s);
        
    }
    
    int hitungLuas(){
        int s = super.getS();
        return s * s;
        
    }
    
    int  hitungKeliling(){
        int s = super.getS();
        return 4 * s;
    }
    
    @Override
    public String toString(){
       String hasil = "luas BujurSangkar :" + hitungLuas() + "\n"+
       "Keliling BujurSangkar:" + hitungKeliling();
       
       return hasil;
    }
    
}
