import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size;
        do {
            System.out.println("Podaj rozmiar tablicy");
            size = sc.nextInt();
        } while(size<0);
        int[] tablica = new int[size];

        System.out.println("Podaj elementy tablicy");
        for (int i = 0; i < size; i++) {
            tablica[i] = sc.nextInt();
        }

        if(isPalindrom(tablica)){
            System.out.println("Jest palindromem");
        }
        else{
            System.out.println("Nie jest palindromem");
        }
        sc.close();
    }

    private static boolean isPalindrom(int[] tablica){
        boolean isPalindrom=true;
        for (int i = 0; i < tablica.length / 2; i++) {
            if (tablica[i] != tablica[tablica.length - 1 - i]) {
                isPalindrom=false;
                break;
            }
        }
        return isPalindrom;
    }
}