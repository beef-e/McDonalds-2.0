public class Tipo_1 {
	static Panino panino1=new Panino();
	static Panino panino2=new Panino();

	public Tipo_1(){

	}

	void composizione(){
		panino1.nome="Classic";
		panino2.nome="Big Classic";

		panino1.prezzo= 1;
		panino2.prezzo= 2;

		panino1.codice= (int) (Math.random()*100+Math.random()*10)+1;
		panino2.codice= (int) (Math.random()*100+Math.random()*10)+1;

		panino1.descrizione="Lorem Ipsum Dolor Sit Amet";
		panino2.descrizione="Lorem Ipsum Dolor Sit Amet";

		panino1.quantità=10;
		panino2.quantità=10;
	}
}
