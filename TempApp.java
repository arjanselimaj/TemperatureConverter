import java.util.Scanner;

public class TempApp {

	public static void main(String[] args) {
		
		Scanner skaneri = new Scanner(System.in);
		System.out.println("Konvertimi i Fahrenheit ne Celsius (1) dhe konvertimi i Celcius ne Fahrenheit (2)");
		
		int inputKlienti = skaneri.nextInt();
		
		if (inputKlienti == 1) {
			//kalkulo fahrenheit ne celsius
			System.out.println("TI KE ZGJEDHUR KONVERTIMIN NGA FAHRENHEIT NE CELCIUS");
			System.out.println("JU LUTEM FUTENI NJE VLERE PER TE KONVERTUAR");
			double vlera = skaneri.nextDouble();
			
			//e perdorim formulen per konvertim nga fahrenheit ne celcius (F - 32) * 1.81 = C
			double vleraFinale = (vlera - 32)*5/9;
			System.out.println("Rezultati i konvertimin nga F ne C eshte: ");
			System.out.println(Math.round(vleraFinale*10.0)/10.0);
			
			
		}else if (inputKlienti == 2){
			//kalkulo celcius ne fahrenheit
			System.out.println("TI KE ZGJEDHUR KONVERTIMIN NGA CELCIUS NE FAHRENHEIT");
			System.out.println("JU LUTEM FUTENI NJE VLERE PER TE KONVERTUAR");
			double vlera2 = skaneri.nextDouble();
			
			//e perdorim formulen per konvertim nga celcius ne fahrenheit (C * 5/9) + 32 = F
			double vleraFinale2 = (vlera2 * 1.8) + 32;
			System.out.println("Rezultati i konvertimit nga C ne F eshte: ");
			System.out.println(Math.round(vleraFinale2*10.0)/10.0);
		}else {
			System.err.println("Ju lutem zgjidhni njerin nga opsionet e dhena: 1 ose 2");
		}
	}

}
