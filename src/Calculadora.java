/** 
 * Classe Calculadora
 * 
 * @javadoc
 * @author Thiago Milton Ferreira
 * @since 2021
 * 
 */ 
public class Calculadora {
	public static double Soma(double n1, double n2) {
		return n1+n2;
	}
	public static double SomaAbs(double n1, double n2) {
		return Math.abs(n1+n2);
	}
	public static double Potencia(double n1, double n2) {
		return Math.pow(n1, n2);
	}

}
