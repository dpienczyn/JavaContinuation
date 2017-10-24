//Napisz program, kt�ry w zadeklarowanej tablicy dwuwymiarowej
//10�10 o nazwie macierz umieszcza na przek�tnej liczb� 1,
//a poza przek�tn� 0. Dodatkowo program powinien oblicza�
//sum� element�w wyr�nionych w tablicy, tj. tych znajduj�cych
//si� na jej przek�tnej.
public class MacierzJedynkiPoPrzekatnej {

	public static void main(String[] args) {
		int j, i;
		int[][] tab = new int[10][10];
		for(i=0; i<10; i++){
			for(j=0; j<10; j++){
				if(i==j)
					tab[i][j]=1;
				else
					tab[i][j]=0;
				
			}
			}
		//wyswietlanie macierzy
		for(i=0; i<10; i++){
			for(j=0; j<10; j++){
				System.out.print(tab[i][j] + "  |  ");
			}
		}
		//suma jedynek po przekatnej
		int suma = 0;
		for(i=0; i<10; i++){
			suma+=tab[i][i];
		}
		System.out.printf("\nSuma wyr�nionych element�w po przek�tnej wynosi: %d ", suma);
	}}

