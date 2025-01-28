package trabalho03;
// Esse é um exemplo de Overredeing(sobreescrita)

public class Main {
    
    public static void main(String[] args) {
       Panela p= new Panela();
        p.setTamanho("pequena");
        p.setVolume_Interno(1);
        p.setTipo("Cuscuzeira");
        p.exibir();
        p.cozinhar();
        System.out.println("_");
        Pipoqueira pi= new Pipoqueira();
        pi.setTamanho("média");
        pi.setVolume_Interno(3);
        pi.setCor("Vermelha");
        pi.exibir();
        pi.cozinhar();
        System.out.println("");
        Frigideira f= new Frigideira();
        f.setTamanho("Grande");
        f.setVolume_Interno(2);
        f.setTamanho_Cabo(5);
        f.exibir();
        f.cozinhar();
    }
    
}
