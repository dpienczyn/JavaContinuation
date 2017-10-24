//Napisz program wyœwietlaj¹cy tabliczkê mno¿enia dla liczb
//od 1 do 100 z wykorzystaniem podwójnej pêtli while.
public class TabliczkaMno¿enia {

	public static void main(String[] args) {
		int x=1;
		int y=1;
		while(x<=10){
			x =1;
			while(y<=10){
				y=1;
				int suma = x*y;
			System.out.printf("x*y= %d  ", suma);
			x++;
		}
			y++;
		}
	}

}
