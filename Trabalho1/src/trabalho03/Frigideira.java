package trabalho03;

public class Frigideira extends Panela {
    private int tamanho_cabo;
    public Frigideira(){
        this.tipo= "Frigideira";
    }
    
    public int getTamanho_Cabo(){
        return this.tamanho_cabo;
        
    }
    public void setTamanho_Cabo(int tamanho_cabo){
        this.tamanho_cabo= tamanho_cabo;
    }
    
    @Override 
    public void cozinhar(){
        System.out.println("Fritando alguma coisa");
    }
    @Override
    public void exibir(){
        super.exibir();
        System.out.println("Tamanho do Cabo: " + this.tamanho_cabo + " CM");
    }
    
}