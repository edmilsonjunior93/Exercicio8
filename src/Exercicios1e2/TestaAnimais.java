package Exercicios1e2;

public class TestaAnimais {
    
    public static void main(String[] args){
    Papagaio p=new Papagaio("Theo",true,"Eu sou o cara!");
    p.talk();
    p.imprime();
    
    Arara a=new Arara("Matheus",false);
    a.talk();
    a.imprime();
    
    Cachorro c=new Cachorro("Rayka",4, true);
    c.talk();
    c.imprime();
    
    Vaca v=new Vaca("Rosinha", 4, true);
    v.talk();
    v.imprime();
      
    }
}
