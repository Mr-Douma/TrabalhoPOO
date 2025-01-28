package trabalho04;

abstract class Sapo implements Som, Movimento{
	@Override
	public void fazersom() {
		System.out.println("*som de sapo*");
	}
	public void andar() {
		System.out.println("*pulando*");
	}
}
