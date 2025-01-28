package trabalho02;

//esse é um exemplo de overreloading(sobrecarga)
public class Main {
    public static void main(String[] args) {
        
        Calculadora c1= new Calculadora();
            c1.setN1(4);
            c1.setN2(6);
            c1.setN3(8);
            c1.setN4(9);
            c1.operacao();
            c1.operacao(3,7,5,4);
            c1.operacao(6,7);
        
            
    }
    
    
}