public class Tipo_5 {
	static Panino panino1=new Panino();
	static Panino panino2=new Panino();

	public Tipo_5(){

	}

	void composizione(){
		panino1.nome="Baby";
		panino2.nome="Non_così_Baby";

		panino1.prezzo= 5.50;
		panino2.prezzo= 6.50;

		panino1.codice= (int) (Math.random()*100+Math.random()*10)+5;
		panino2.codice= (int) (Math.random()*100+Math.random()*10)+5;

		panino1.descrizione="Lorem Ipsum Dolor Sit Amet";
		panino2.descrizione="Lorem Ipsum Dolor Sit Amet";

		panino1.quantità=10;
		panino2.quantità=10;
	}
}
