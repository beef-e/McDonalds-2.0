public class Tipo_4 {
	Panino panino1;
	Panino panino2;

	public Tipo_4(){

	}

	void composizione(){
		panino1.prezzo=Math.random()*10+1;
		panino2.prezzo=Math.random()*10+1;

		panino1.codice= (int) (Math.random()*100+Math.random()*10)+4;
		panino2.codice= (int) (Math.random()*100+Math.random()*10)+4;

		panino1.descrizione="Lorem Ipsum Dolor Sit Amet";
		panino2.descrizione="Lorem Ispum Dolor Sit Amet";

		panino1.quantità=10;
		panino2.quantità=10;
	}
}
