package trabalho01;

public abstract class Produto1 {
    protected String nome;
    
    public Produto1(String nome){
        this.nome = nome;
    }
    
    public void comprar(){
        System.out.println(this.nome + " foi comprado!");
    }
}