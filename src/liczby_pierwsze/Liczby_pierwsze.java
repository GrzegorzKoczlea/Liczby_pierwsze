package liczby_pierwsze;

public class Liczby_pierwsze {

    public static void Sprawdz_czy_liczba_pierwsza(int[] liczby_pierwsze){
        
        for (int i = 0; i < liczby_pierwsze.length; i++) {
            for (int dzielnik = 2; dzielnik <= liczby_pierwsze[i]; dzielnik++) {

                if(liczby_pierwsze[i] % dzielnik == 0 && dzielnik != liczby_pierwsze[i]){
                    System.out.println("liczba " +liczby_pierwsze[i]+  " nie jest liczbą pierwszą");
                    break;
                }
                else if(dzielnik == liczby_pierwsze[i]){
                    System.out.println("liczba " +liczby_pierwsze[i]+  " jest liczbą pierwszą");
                }
            }
        }
    }     

    public static void main(String[] args) {
        
        int[] tablica_liczb = new int[5];
        
        tablica_liczb[0] = 12;
        tablica_liczb[1] = 16;
        tablica_liczb[2] = 7;
        tablica_liczb[3] = 6;
        tablica_liczb[4] = 8;
        
        Sprawdz_czy_liczba_pierwsza(tablica_liczb);    
    }
}
    
