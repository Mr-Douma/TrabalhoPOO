package trabalho04;

abstract class Humano implements Movimento, Som{
	@Override
	public void andar() {
		System.out.println("*Andando*");
	}
	@Override 
	public void fazersom() {
		System.out.println("Olá!");
	}
}
