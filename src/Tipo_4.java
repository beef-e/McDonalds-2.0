public class Tipo_4 {
	static Panino panino1=new Panino();
	static Panino panino2=new Panino();

	public Tipo_4(){

	}

	void composizione(){
		panino1.nome="Maxi";
		panino2.nome="SuperDuper Maxi";

		panino1.prezzo= (int) (Math.random() * 10) +1;
		panino2.prezzo= (int) (Math.random() * 10) +1;

		panino1.codice= (int) (Math.random()*100+Math.random()*10)+4;
		panino2.codice= (int) (Math.random()*100+Math.random()*10)+4;

		panino1.descrizione="Lorem Ipsum Dolor Sit Amet";
		panino2.descrizione="Lorem Ipsum Dolor Sit Amet";

		panino1.quantità=10;
		panino2.quantità=10;
	}
}
