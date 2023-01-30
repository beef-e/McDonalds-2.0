public class Tipo_2 {
	static Panino panino1=new Panino();
	static Panino panino2=new Panino();

	public Tipo_2(){

	}

	void composizione(){
		panino1.nome="Vegan";
		panino2.nome="Big Vegan";

		panino1.prezzo= 5;
		panino2.prezzo= 6;

		panino1.codice= (int) (Math.random()*100+Math.random()*10)+2;
		panino2.codice= (int) (Math.random()*100+Math.random()*10)+2;

		panino1.descrizione="Lorem Ipsum Dolor Sit Amet";
		panino2.descrizione="Lorem Ipsum Dolor Sit Amet";

		panino1.quantità=10;
		panino2.quantità=10;
	}
}
