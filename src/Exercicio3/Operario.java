package Exercicio3;

public class Operario extends Empregado{
    private double valorProducao,comissao;

    public Operario(String n, String e, String t, int c, double s, double i,double cm,double v) {
        super(n, e, t, c, s, i);
        setComissao(cm);
        setValorProducao(v);
    }
    
    public double  calcularSalario(){
        return super.calcularSalario()+(this.getValorProducao()
                *this.getComissao()/100);
    }
    
    public double getValorProducao(){
        return this.valorProducao;
    }
    
    public double getComissao(){
        return this.comissao;
    }
    
    public void setValorProducao(double v){
        this.valorProducao=v;
    }
    
    public void setComissao(double cm){
        this.comissao=cm;
    }
}
