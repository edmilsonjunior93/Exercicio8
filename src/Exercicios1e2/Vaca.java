package Exercicios1e2;

public class Vaca extends Mamifero{
    
    public Vaca(String n, int p,boolean t) {
        super(n, p);
        setTemLeite(t);
    }
    
    private boolean temLeite;
    
    public boolean isTemLeite(){
        return this.temLeite;
    } 
    public void setTemLeite(boolean t){
        this.temLeite=t;
    } 
    
    public void talk(){
        System.out.println("Muuu");}
}
