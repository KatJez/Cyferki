package pl.lait.kalkulator;

import java.util.Scanner;

public class Calc {

	static Scanner wczytywanieZklawiatury = new Scanner(System.in);

	public static void main(String[] args) {

		// tworzymy nowy obiekt przyklad1 - jako instancja klasy Dzialania
		Dzialania przyklad1 = new Dzialania();
		/*
		 * int wynikDodawania = przyklad1.dodawanie(5,6); int wynikOdejmowania =
		 * przyklad1.odejmowanie(5,4); int wynikMnozenia =
		 * przyklad1.mnozenie(5,6); int wynikDzielenia =
		 * przyklad1.dzielenie(6,6);
		 * 
		 * System.out.println("Wynik dodawania dla przyklad1: " +
		 * wynikDodawania);
		 * System.out.println("Wynik odejmowania dla przyklad1: " +
		 * wynikOdejmowania);
		 * System.out.println("Wynik mno�enia dla przyklad1: " + wynikMnozenia);
		 * System.out.println("Wynik dzielenia dla przyklad1: " +
		 * wynikDzielenia);
		 */
		System.out.print("Podaj swoje imi�: ");
		String imie = wczytajZklawiatury();
		System.out.println("Witaj " + imie);

		int akcjaUzytkownika = 1;
		while (akcjaUzytkownika >= 1 && akcjaUzytkownika <= 4) {

			int a;
			System.out.print("Podaj pierwsz� liczb�: ");
			a = Integer.parseInt(wczytajZklawiatury());
			int b;
			System.out.print("Podaj drug� liczb�: ");
			b = Integer.parseInt(wczytajZklawiatury());
			/*
			 * System.out.println("Wynik dodawania: " + przyklad1.dodawanie(a,
			 * b)); System.out.println("Wynik odejmowania: " +
			 * przyklad1.odejmowanie(a, b));
			 */

			System.out.print("wybierz dzia�ane:\n" + "1 - dodawanie,\n" + "2 - odejmowanie\n" + "3 - mno�enie\n"
					+ "4 - dzielenie\n" + "Ka�da inna cyfra - koniec\n" + ">>");

			akcjaUzytkownika = Integer.parseInt(wczytajZklawiatury());

			if (akcjaUzytkownika == 1) {
				System.out.println("Wybra�e� dodawanie (1), wynik: " + przyklad1.dodawanie(a, b));
			} else if (akcjaUzytkownika == 2) {
				System.out.println("Wybra�e� odejmowanie (2), wynik: " + przyklad1.odejmowanie(a, b));
			} else if (akcjaUzytkownika == 3) {
				System.out.println("Wybra�e� mno�enie (3), wynik: " + przyklad1.mnozenie(a, b));
			} else if (akcjaUzytkownika == 4) {
				if (b == 0) {
					System.out.println("Pr�ba dzielenia przez zero jest niedozwolona");
				} else {
					System.out.println("Wybra�e� dzielenie (4), wynik: " + przyklad1.dzielenie(a, b));
				}
			}

			else { 
				// sekcja opcjonalna, ka�da inna warto�� ni� 1-4 powoduje koniec programu
				// nie ma potrzeby sprawdzania czy rozpoznano komend�
				//je�li nie rozpoznano (mniej ni� 1 i wi�cej ni�4 - koniec programu
				// w zasadzie mogliby�my ten fragment kodu usun��
				
				System.out.println("Nie rozpoznano komendy");
			}
			System.out.println("koniec programu");
		}
	}

	public static String wczytajZklawiatury() {
		return wczytywanieZklawiatury.nextLine().trim();
	}
}
