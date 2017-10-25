import java.io.*;
import java.util.Scanner;

class pole_prostokata{
	double a, b, pole;
	
public void czytaj_dane(){
	Scanner odczyt = new Scanner(System.in);
	System.out.println("Podaj a: ");
	a = odczyt.nextDouble();
	System.out.println("Podaj b: ");
	b = odczyt.nextDouble();
}
public void przetworz_dane(){
	pole = a*b;
}
public void wyswietl_dane(){
	System.out.printf("a = %4.2f  ", a);
	System.out.printf("b = %4.2f  ", b);
	System.out.printf("pole prostokota wynosi: %4.2f  ", pole);
}
}

public class ProgramowanieObiektowe {
	
	public static void main(String[] args) {
		pole_prostokata p = new pole_prostokata();
		p.czytaj_dane();
		p.przetworz_dane();
		p.wyswietl_dane();

	}

}
