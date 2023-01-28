import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		ArrayList<Panino> purchased = new ArrayList<>();

		Tipo_1 prima=new Tipo_1();
		Tipo_2 seconda=new Tipo_2();
		Tipo_3 terza=new Tipo_3();
		Tipo_4 quarta=new Tipo_4();
		Tipo_5 quinta=new Tipo_5();

		prima.composizione();
		seconda.composizione();
		terza.composizione();
		quarta.composizione();
		quinta.composizione();

		choice(prima, seconda, terza, quarta, quinta, purchased);


	}

	public static void stampaMenu(Tipo_1 prima, Tipo_2 seconda, Tipo_3 terza, Tipo_4 quarta, Tipo_5 quinta){
		System.out.print("1. "+prima.panino1.nome +" "+prima.panino1.prezzo +"€" +"\n");
		System.out.print("2. "+prima.panino2.nome +" "+prima.panino2.prezzo +"€" +"\n");
		System.out.print("3. "+seconda.panino1.nome +" "+seconda.panino1.prezzo +"€" +"\n");
		System.out.print("4. "+seconda.panino2.nome +" "+seconda.panino2.prezzo +"€" +"\n");
		System.out.print("5. "+terza.panino1.nome +" "+terza.panino1.prezzo +"€" +"\n");
		System.out.print("6. "+terza.panino2.nome +" "+terza.panino2.prezzo +"€" +"\n");
		System.out.print("7. "+quarta.panino1.nome +" "+quarta.panino1.prezzo +"€" +"\n");
		System.out.print("8. "+quarta.panino2.nome +" "+quarta.panino2.prezzo +"€" +"\n");
		System.out.print("9. "+quinta.panino1.nome +" "+quinta.panino1.prezzo +"€" +"\n");
		System.out.print("10. "+quinta.panino2.nome +" "+quinta.panino2.prezzo +"€" +"\n");
	}

	public static void choice(Tipo_1 prima, Tipo_2 seconda, Tipo_3 terza, Tipo_4 quarta, Tipo_5 quinta,
							  ArrayList purchased){
		System.out.println("Prego, scegli il tuo panino");
		stampaMenu(prima,seconda,terza,quarta,quinta);
		System.out.print("\n >>>");

		Scanner input=new Scanner(System.in);
		int scelta=input.nextInt();

		switch (scelta){
			case 1:
				purchased.add(prima.panino1);
				prima.panino1.quantità=prima.panino1.quantità-1;
				break;
			case 2:
				purchased.add(prima.panino2);
				prima.panino2.quantità=prima.panino2.quantità-1;
				break;
			case 3:
				purchased.add(seconda.panino1);
				seconda.panino1.quantità=seconda.panino1.quantità-1;
				break;
			case 4:
				purchased.add(seconda.panino2);
				seconda.panino2.quantità=seconda.panino2.quantità-1;
				break;
			case 5:
				purchased.add(terza.panino1);
				break;
			case 6:
				purchased.add(terza.panino2);
				break;
			case 7:
				purchased.add(quarta.panino1);
				break;
			case 8:
				purchased.add(quarta.panino2);
				break;
			case 9:
				purchased.add(quinta.panino1);
				break;
			case 10:
				purchased.add(quinta.panino2);
				break;
		}

		System.out.println("Panino Registrato, vuoi aggiungere altro? \n1.Sì\n0.No");
		input=new Scanner(System.in);
		scelta=input.nextInt();

		if (scelta==1){
			choice(prima, seconda, terza, quarta, quinta, purchased);
		}else{
			Scontrino.pagamento(purchased);
		}
	}
}