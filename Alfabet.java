//Wyswietlanie liter drukowanych i nie drukowanych Alfabetu
public class Alfabet {

	public static void main(String[] args) {
		char znak;
		System.out.println("Alfabet drukowane litery!");
		for(znak=65; znak<91; znak++){
			System.out.printf("%c  ", znak);
		}
		System.out.println("\n");
		System.out.println("Alfabet nie drukowane litery!");
		for(znak=97; znak<121; znak++){
			System.out.printf("%c  ", znak);
		}

	}

}
