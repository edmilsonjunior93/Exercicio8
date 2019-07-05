package Exercicio3;

public class Administrador extends Empregado{
    private double ajudaDeCusto;

    public Administrador(String n, String e, String t, int c, double s, double i
            ,double a) {
        super(n, e, t, c, s, i);
        setAjudaDeCusto(a);
    }
    
    public double getAjudaDeCusto(){
        return this.ajudaDeCusto;
    }
    
    public void setAjudaDeCusto(double a){
        this.ajudaDeCusto=a;
    }
    
    public double calcularSalario(){
        return super.calcularSalario()+this.getAjudaDeCusto();
    }
    
    
}
