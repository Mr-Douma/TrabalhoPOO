package trabalho03;

//essa classse é uma panela qualquer
public class Panela {
    protected String tamanho;
    protected int volume_interno;
    protected String tipo;
        
    public String getTamanho(){
        return this.tamanho;
        
    }
    public void setTamanho(String tamanho){
        this.tamanho= tamanho;
    }
    public int getVolume_Interno(){
        return this.volume_interno;
    }
    public void setVolume_Interno(int volume_interno){
        this.volume_interno=volume_interno;
    }
    public String getTipo(){
        return this.tipo;
    }
    public void setTipo(String tipo){
        this.tipo=tipo;
    }
    
    public void cozinhar(){
        System.out.println("Conzinhado uma comida qualquer");
    }
    public void exibir(){
        System.out.println("Tamanho: " + this.tamanho);
        System.out.println("Volume interno: " + this.volume_interno + " litros");
        System.out.println("Tipo: " + this.tipo);
    }
    
    
}