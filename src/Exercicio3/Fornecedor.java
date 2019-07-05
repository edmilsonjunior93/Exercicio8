package Exercicio3;

public class Fornecedor extends Pessoa{
    private double valorCredito;
    private double valorDivida;

    public Fornecedor(String n, String e, String t,double c,double d) {
        super(n, e, t);
        setValorCredito(c);
         setValorDevida(d);
    }
    
    public double obterSaldo(){
    return this.getValorCredito()-this.getValorDivida();
    }
    
    public double getValorCredito(){
        return this.valorCredito;}
    
    public double getValorDivida(){
        return this.valorDivida;}
    
    public void setValorCredito(double c){
    this.valorCredito=c;
    }
    
    public void setValorDevida(double d){
    this.valorDivida=d;
    }
                 
}
