package trabalho06;

abstract class Pombo implements Voar, Comer{
	@Override
	public void comendo() {
		System.out.println("Nhac");
	}
	@Override
	public void voando() {
		System.out.println("*Voando baixo*");
	}
}
