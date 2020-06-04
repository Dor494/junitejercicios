package ual.hmis.ejercicio3;

/**
 * @author Danielor
 */

public class Ejercicio3 {

	/**
	 * Metodo que devuelve el dia de la semana.
	 * @param x
	 * @return dia semana
	 */
	public String diaSemana(final int x) {
		String cadena = "Error!";
		switch(x) {
			case 1: cadena = "lunes";break;
			case 2: cadena = "martes";break;
			case 3: cadena = "miercoles";break;
			case 4: cadena = "jueves";break;
			case 5: cadena = "viernes";break;
			case 6: cadena = "sabado";break;
			case 7: cadena = "domingo";break;
		}
		return cadena;
	}
}
