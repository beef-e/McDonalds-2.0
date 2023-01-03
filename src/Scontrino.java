import java.util.Scanner;

public class Scontrino {

	int [] scelti=new int[10];
	public Scontrino(){

	}

	void scegliere(){
		Scanner input=new Scanner(System.in);
		int scelta=input.nextInt();
		if (scelta>0 && scelta<11){
			aggiornaScontrino(scelta);
			System.out.println("Si desidera scegliere un altro panino?");
			System.out.println("1: Sì");
			System.out.println("0: No");
			Scanner input2=new Scanner(System.in);
			int otherPanin=input2.nextInt();

			if (otherPanin==1){
				scegliere();
			}else{
				pagamento();
			}

		}else {
			System.out.println("Si è pregati di scegliere un numero valido");
			scegliere();
		}
	}

	void aggiornaScontrino(int scelta){
		scelti[scelta]=scelti[scelta]+1;
	}

	void pagamento(){
		System.out.println("Si sono selezionati i seguenti panini: ");

		for (int i = 0; i < 10; i++) {
			if (scelti[i]>0){
				System.out.print(scelti[i]+"x");
				if (i%2==0){
					System.out.print(" Numero2.\n");
				}else{
					System.out.print(" Numero1.\n");
				}
			}
		}
	}
}
