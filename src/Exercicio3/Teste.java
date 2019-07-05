package Exercicio3;

public class Teste { 
    public static void main(String[] args){
        Pessoa p=new Pessoa("Edmilson", "Rua A N:1", "(38)999711115");
        Fornecedor f=new Fornecedor("Theobaldo", "Rua dos Bobos N: 0", "(38)999999999", 5000, 5200);
        Empregado e=new Empregado("Matheus", "Rua kkk SN", "Nao Possui", 001, 1000, 10);
        Administrador a=new Administrador("Hader", "Rua sei la N: nunca vi", "(38)900001111", 002, 1500, 11, 500);
        Operario o=new Operario("Rodrigo", "Rua 1 N:A", "38 911110000", 003, 2000, 11,10 , 100000);
        
        System.out.println(f.obterSaldo());
        System.out.println(e.calcularSalario());
        System.out.println(a.calcularSalario());
        System.out.println(o.calcularSalario());
        
    }
    
}
