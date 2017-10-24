import java.util.Random;
import java.io.*;

//Napisz program, który za pomoc¹ instrukcji while znajduje
//najwiêksz¹ i najmniejsz¹ liczbê ze zbioru n wylosowanych
//liczb ca³kowitych od 0 do 99 (w zadaniu n = 5) oraz oblicza
//œredni¹ ze wszystkich wylosowanych liczb.
public class MaxMin {

	public static void main(String[] args) {
		
		Random r = new Random();
		int [] tab = new int[5];
		System.out.println("Program wyszukuje spoœród wylosowanych liczb najmniejsza i najwieksza\n ");
		for(int i=0; i<tab.length; i++){
			tab[i] = r.nextInt(99);
		System.out.printf("Wylosowana liczba: %d\n  ", tab[i]);
		}
		
		boolean True = true;
        int min =0; 
        while(True){
                     for(int i=0; i<tab.length; i++){
                           if(tab[i]==min){
                                 True = false;
                                 System.out.printf("Wartoœæ minimalna wylosowanych liczb to: %d\n", tab[i]);
                           }
                        }
                 min++;
        }
        int max=99; True = true;
        while(True){
                     for(int i=0; i<tab.length; i++){
                           if(tab[i]==max){
                                 True = false;
                                 System.out.printf("Wartoœæ maksymalna wylosowanych liczb to: %d\n", tab[i]);
                           }
                        }
                        max--;
        }
		
		int suma = 0;
		//liczymy sume liczb
		for(int i=0; i<tab.length; i++){
			suma+=tab[i];
		}
		System.out.printf("Suma wylosowanych liczb wynosi %d\n ", suma);
		
		float srednia_ocen = suma/tab.length;
		System.out.printf("Srednia arytmetyczna wszystkich wylosowanych liczb wynosi %2.1f", srednia_ocen);
		
		
		
	}
}
