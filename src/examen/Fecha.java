package examen;
/**
 * 
 * @author daw1xx @version 1.0
 *
 * Este proyecto busca validar una fecha, comprobando si el día, el mes y el año es correcto
 *
 */
public class Fecha {
	/**
	 * Este boolean hace que sean falsos valores que no correspondan
	 */
	public static boolean fechaValida;
/**
 * 
 * @param anio tipo integer que indica que los años tienen que ser mayor que 0
 * @param mes tipo integer que indica que el mes tiene que ser maor que 0 y menor o igual a 12
 * @param dia tipo integer que indica que el día tiene que ser mayor que 0 y menor o igual a 31
 * @return
 * 
 * Este boolean validarFecha contiene dia, mes y año, si todos los valores introducidos son validos , la fecha será valida, si no fechaValida = false
 */
	public static boolean validarFecha(int anio, int mes, int dia) {
		fechaValida = false;
		if ((dia > 0) && (mes > 0) && (anio > 0)) {
			if ((mes <= 12) && (dia <= 31)) {
				if (mes == 2) {
					fechaValida = dia <= 28;
				} else if (mes % 2 == 0) {
					fechaValida = dia <= 30;
				} else {
					fechaValida = dia <= 31;
				}
			}
		}
		return fechaValida;
	}
}