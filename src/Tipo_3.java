public class Tipo_3 {
	static Panino panino1=new Panino();
	static Panino panino2=new Panino();

	public Tipo_3(){

	}

	void composizione(){
		panino1.nome="Fish";
		panino2.nome="Big Fish";

		panino1.prezzo= 3;
		panino2.prezzo= 4;

		panino1.codice= (int) (Math.random()*100+Math.random()*10)+3;
		panino2.codice= (int) (Math.random()*100+Math.random()*10)+3;

		panino1.descrizione="Lorem Ipsum Dolor Sit Amet";
		panino2.descrizione="Lorem Ipsum Dolor Sit Amet";

		panino1.quantità=10;
		panino2.quantità=10;
	}
}
