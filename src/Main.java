import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
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

		System.out.println("Benvenuto in McDonald's. Prego, scegli il tuo panino");
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
		System.out.print("\n >>>");
	}
}