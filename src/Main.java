import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Dzień Dobry Polsko!");
        int wylosowanaLiczba = (int) (Math.random() * 100 + 1); //rzutowanie
        System.out.println(wylosowanaLiczba);

        System.out.println("Zgadnij liczbę");
        Scanner klawiatura = new Scanner(System.in); //nowy obiekt klasy skaner, system.in znaczy że wprowadza z klawiatury
        int wpisanaLiczba = klawiatura.nextInt();  //wylosowuje liczbe

        if (wpisanaLiczba == wylosowanaLiczba) {
            System.out.println("Gratulacje, wygrana!");
        } else {
            System.out.println("Przegrana!");
        }
        int roznica = wylosowanaLiczba > wpisanaLiczba ? wylosowanaLiczba - wpisanaLiczba : wpisanaLiczba - wylosowanaLiczba; //wyrażenie warunkowe, które zwraca wartość
        System.out.println("Różnica pomiędzy liczbami wyniosła: " + roznica);
        roznica = roznica / 10; //dzielenie całkowite

        switch (roznica) {
            case 0:
                System.out.println("Brawo!");
                break;
            case 1:
                System.out.println("Bardzo blisko!");
                break;
            case 2:
                System.out.println("Blisko!");
                break;
            default:
                System.out.println("Słabo!");
        }
        System.out.println(switch (roznica) {
            case 0 -> "Brawo!";
            case 1 -> "Bardzo blisko!";
            case 2 -> "Blisko!";
            default -> "Słabo!";
        });

        //zgadujemy 10 razy
        for (int i = 0; i < 10; i++) {
            System.out.println("Podaj liczbę");
            wpisanaLiczba = klawiatura.nextInt();
            if (wpisanaLiczba == wylosowanaLiczba){
                System.out.println("Zgadłeś!");
                break;
            }else{
                System.out.println("Nie zgadłeś!");
            }
        }

        //zgadujemy aż do skutku
        do{
            System.out.println("Podaj liczbę");
            wpisanaLiczba = klawiatura.nextInt();
            if (wylosowanaLiczba>wpisanaLiczba){
                System.out.println("Wpisano za mało");
            }else{
                System.out.println("Wpisano za dużo");
            }
        }
        while (wpisanaLiczba != wylosowanaLiczba);
            System.out.println("Podaj liczbę");
            wpisanaLiczba = klawiatura.nextInt();

    }
}
/*Nazwa pliku i nazwa klasy muszą być takie same
  Nazwa klasy musi zaczynać się z dużej litery... bo tak :)

  git init - puste reprezytorium
  git config --global - żeby zapamiętało konto
  git config --local user.name "JustSG" - login
  git config --local user.email "szymonfujawa.07@gmail.com" - email
  git add . - dodaj wszystkie pliki do reprezytorium
  git commit -m "pusty projekt" - tworzy migawke o nazwie pusty projekt
  git log - aby sprawdzić commita
  git remote add origin https://github.com/JustSG/Zgadywanka.git - link do reprezytorium
  git push -u origin master - dodaj do reprezytorium

  menedżer poświadczeń - aby usuwać zapisane hasła

  Są 2 typy w javie:
  proste - tylko wartość, z małej litery. Typy proste: int, long, short, byte, float, char, double
  złożone - które mają własności i metody, z dużej litery

  Rzutowanie - np. zmiana typu double na int
 */