
public class BangunDatar {
    
    private int p,l,s;
    
    //Konstruktor untuk Bujursangkar
    BangunDatar (int s){
        this.s = s;
        
    }
    //Konstruktor untuk persegi panjang
    BangunDatar(int p, int l){
        this.p = p;
        this.l = l;
        
    }
    
    void setPL(int p, int l){
        this.p = p;
        this.l = l;
    }
    
    void setSisi(int s){
        this.s = s;
    }
    
    int getP(){
        return p;
    }
    
    int getL(){
        return l;
    }
    
    int getS(){
        return s;
    }
    
}
