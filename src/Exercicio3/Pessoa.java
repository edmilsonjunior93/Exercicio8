package Exercicio3;

public class Pessoa {
    private String nome,endereco,telefone;
    
    public Pessoa(String n,String e,String t){
       setNome(n);
       setEndereco(e);
       setTelefone(t);
    }
    
    public String getNome(){
        return this.nome;}
    
    public String getEndereco(){
        return this.endereco;}
        
    public String getTelefone(){
        return this.telefone;}
    
    public void setNome(String n){
    this.nome=n;
    }
    
    public void setEndereco(String e){
    this.endereco=e;
    }
    
    public void setTelefone(String t){
    this.telefone=t;
    }
}
