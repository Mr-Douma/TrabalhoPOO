package trabalho05;

public abstract class Animal {
    protected String nome;
    public Animal(String nome) {
        this.nome = nome;
    }
    abstract void emitirsom();
    public void passear() {
        System.out.println(this.nome + " está passeando");
    }
}