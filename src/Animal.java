public class Animal {
    private String nome;
    
    public Animal(String n){
       setNome(n); 
    }   
    
    public void imprime(){
        System.out.println(getNome());
    } 
     
    public void talk(){
    } 
    
    public String getNome(){
        return this.nome;
    } 
    public void setNome(String n){
        this.nome=n;
    } 
      
}
