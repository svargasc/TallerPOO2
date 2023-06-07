import javax.swing.JOptionPane;

public class Flecha {
		int longitud;
		String color;
		
		public Flecha() {
			do {
				if (longitud < 0) {
					longitud = lonFlecha("ingrese una longitud valida para la flecha");
				}else {
					longitud = lonFlecha("ingrese la longitud de la flecha");
				}
			}while(longitud < 0);
			
			color = "negro";
		}
		
		private int lonFlecha(String string) {
			int lon = Integer.parseInt(JOptionPane.showInputDialog(string));
			return lon;
		}

		public Flecha(int longitud,String color) {
			this.longitud=longitud;
			this.color=color;
		}
		public void imprimirEspacio() {
			System.out.println();
		}
		public void construirFlecha() {
			for (int i = 0; i < longitud; i++) {
				imprime("-");
			}
			imprime(">");
		}

		public void imprime(String simbolo) {
			if (color.equals("negro")) {
				System.out.print(simbolo);
			}else {
				System.out.print(simbolo);
			}
			
		}

		
		
}
