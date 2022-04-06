
public class ClaseMain {

	public static void main(String[] args) {
		metodo(10);
	}

	public static void metodo(int tam) {
		System.out.println("Ejecutando ::");
		int auxTam = tam-1;
		int inicio = 2;
		int stop = 0;
		int[] lista = new int[tam];
		while( stop != tam) {
			int esPrimo = 0;
			for(int i = inicio ; i >= 1; i--) {		
				if(inicio%i == 0) {
					esPrimo++;
				}
			}
			if(esPrimo == 2) {
				lista[auxTam] = inicio;
				auxTam--;
				stop++;
				
			}
			inicio++;
		}
		
		for(int i : lista) {
			System.out.println("Numero ::" + i);
		}
	}
}
