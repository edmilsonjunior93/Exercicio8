package Exercicios1e2;

public class Papagaio extends Ave{
    
    public Papagaio(String n, boolean v,String f) {
        super(n, v);
        setFrase(f);
    }
    
    private String frase;
    
     public void talk(){
        System.out.println(getFrase());
    } 
    
    public String getFrase(){
        return this.frase;
    } 
    public void setFrase(String f){
        this.frase=f;
    } 
    
}
