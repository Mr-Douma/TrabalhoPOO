package trabalho05;

public class Coruja extends Animal {
    public Coruja(String nome) {
        super(nome);
    }
    @Override
    void emitirsom() {
        System.out.println("hu hu");
    }
}