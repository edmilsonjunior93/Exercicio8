package Exercicios1e2;

public class Cachorro extends Mamifero{
    
    public Cachorro(String n, int p,boolean l) {
        super(n, p);
        setLateAlto(l);
    }
    
    private boolean lateAlto;
    
    public boolean isLateAlto(){
        return this.lateAlto;
    } 
    public void setLateAlto(boolean l){
        this.lateAlto=l;
    } 
    
    public void talk(){
        System.out.println("Au,au");}
}
