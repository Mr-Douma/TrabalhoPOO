package trabalho03;

public class Pipoqueira extends Panela {
    private String cor;
    
    public Pipoqueira(){
        this.tipo= "Pipoqueira";
    }
        
    
    public String getCor(){
        return this.cor;
    }
    public void setCor (String cor){
        this.cor= cor;
    }
    @Override 
    public void cozinhar(){
        System.out.println("preparando pipoca!");
    }
    @Override 
    public void exibir(){
        super.exibir();
        System.out.println("Cor: " + this.cor);
    }
}