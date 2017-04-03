package pl.lait.kalkulator;

public class Dzialania {

	/**
	 * Dodawanie liczb - zwraca wynik a + b
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static int dodawanie(int a, int b) {
		return a + b;
	}

	public static int odejmowanie(int a, int b) {
		return a - b;
	}

	public static int mnozenie(int a, int b) {
		return a * b;
	}

	public static int dzielenie(int a, int b) {
		if (b==0){
			System.out.println("Próba dzielenia przez 0 jest niedozwolona");
			return 0;
		}
		return a / b;
	}
}
