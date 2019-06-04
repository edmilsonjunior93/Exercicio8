package Exercicios1e2;

public class Ave extends Animal {
    
    public Ave(String n,boolean v) {
        super(n);
        setVoa(v);
    }
    
    private boolean voa;
    
    
    public void talk(){
        System.out.println("piu-piu");
    } 
    
    public boolean getVoa(){
        return this.voa;
    } 
    public void setVoa(boolean v){
        this.voa=v;
    } 
    
}
