import java.util.ArrayList;
import java.util.Scanner;

public class Scontrino {

	static double totale=0;
	public Scontrino(){

	}

	/*void scegliere(){
		Scanner input=new Scanner(System.in);
		int scelta=input.nextInt();
		if (scelta>0 && scelta<11){
	//		aggiornaScontrino(scelta);
			System.out.println("Si desidera scegliere un altro panino?");
			System.out.println("1: Sì");
			System.out.println("0: No");
			Scanner input2=new Scanner(System.in);
			int otherPanin=input2.nextInt();

			if (otherPanin==1){
				scegliere();
			}else{
			//	pagamento();
			}

		}else {
			System.out.println("Si è pregati di scegliere un numero valido");
			scegliere();
		}
	}*/

	public static void pagamento(ArrayList<Panino>purchased){
		System.out.println("Si sono selezionati i seguenti panini: ");
		for (int i = 0; i < purchased.size(); i++) {
			System.out.println("" +purchased.get(i).nome +"   €" +purchased.get(i).prezzo);
			totale=totale+purchased.get(i).prezzo;
		}
		System.out.println("TOTALE>>>   "+"€"+totale);
		System.out.println("Scegliere il metodo di pagamento: \n1. Carta\n2.Contante\n\n>>>");
		Scanner in=new Scanner(System.in);
		int scelta=in.nextInt();
		if (scelta==1){
			System.out.println("Prego, avvicinare la carta al lettore");
		} else if (scelta==2) {
			System.out.println("Inserire l'ammontare di contanti inserito: ");
			double incasso=in.nextInt();
			if (incasso>=totale){
				double resto=incasso-totale;
				System.out.println("Pagamento ricevuto, il resto dovuto è di €"+resto);
			}else{
				System.out.println("L'importo inserito non è sufficiente a corpire le spese. Riprovare");
				totale=0;
				pagamento(purchased);
			}
		}
	}
}
