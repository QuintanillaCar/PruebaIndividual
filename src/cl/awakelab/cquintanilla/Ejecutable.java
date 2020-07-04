package cl.awakelab.cquintanilla;


/**
 * Ejecutable Main
 * @author Quintanilla
 *
 */
public class Ejecutable {

	public static void main(String[] args) {
		/**
		 * Se crea arreglo de 10 posiciones, y su correspondiente llenado
		 */
		Electrodomestico [] tecno = new Electrodomestico[10];
		
		tecno[0] = new Electrodomestico(266666,"gris", 'p', 60);
		tecno[1] = new Electrodomestico(400030, 2);
		tecno[2] = new Electrodomestico(33333,5);
		tecno[3] = new Lavadora(255555, "negro", 'a', 5, 8);
		tecno[4] = new Lavadora(211111,56);
		tecno[5] = new Lavadora(10400, 3);
		tecno[6] = new Television(203390, "negro", 'a', 5, 87, true);
		tecno[7] = new Television();
		tecno[8] = new Television(103000, 3);
		tecno[9] = new Television();
		
		/**
		 * For para recorrer el array
		 */
		for (int i = 0; i < tecno.length; i++) {
			System.out.println("El precio final de este " + tecno[i].getClass().getSimpleName()+ " es de $" +tecno[i].precioFinal());
		}
		
		System.out.println("");
		
		/**
		 * Se establecen variables precioElectrodomestico, precioLavadoras y precioTelevisores para trabajar con el precio final para cada una de las clases
		 * (Electrodomestico, Lavadora y Televisor)
		 */
		
		float precioElectrodomesticos = 0;
		float precioLavadoras = 0;
		float precioTelevisores = 0;
		
		/**
		 * recorre el arreglo
		 */
		
		for (int i = 0; i < tecno.length; i++) {
			if (tecno[i] instanceof Electrodomestico) {
				precioElectrodomesticos = precioElectrodomesticos + tecno[i].precioFinal();
			}
			if (tecno[i] instanceof Lavadora) {
				precioLavadoras = precioLavadoras + tecno[i].precioFinal();
			}
			if (tecno[i] instanceof Television) {
				precioTelevisores = precioTelevisores + tecno[i].precioFinal();
			}
			
		}
		
		System.out.println("El precio total de los Electrodomesticos es $" + precioElectrodomesticos);
		System.out.println("");
		System.out.println("El precio total de las Lavadoras es $" + precioLavadoras);
		System.out.println("");
		System.out.println("El precio total de los Televisores es $" + precioTelevisores);
	}

}
