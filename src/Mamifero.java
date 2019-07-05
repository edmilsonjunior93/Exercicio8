public class Mamifero extends Animal{
    
    public Mamifero(String n,int p) {
        super(n);
        setPatas(p);
    }
    
    private int patas;
    
    public int getPatas(){
        return this.patas;
    } 
    public void setPatas(int p){
        this.patas=p;
    } 
    
   
    
    
}
