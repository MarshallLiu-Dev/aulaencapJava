package aulaencap;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// declarar uma instancia de objeto
		//class obj = new Construtor()
		
		Soma soma1 = new Soma();
		soma1.Valor1 = (float)5.2;
		System.out.println(soma1.Valor1);
	}		

	float v1,
	float v2,
	float fb

	Soma soma1 = new Soma();

	System.out.println("Digite o 1ª primeiro valor ")
	v1 = Pix.nextFloat();
	System.out.println("Digite o 2ª primeiro valor ")
	v2 = Pix.nextFloat();

	soma1.setValor1(v1);
	soma1.setValor2(v2);

	fg = soma1.calcular();

	System.out.println(fg);
}
