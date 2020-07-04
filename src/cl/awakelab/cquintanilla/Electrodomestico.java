package cl.awakelab.cquintanilla;

public class Electrodomestico {
	/**
	 * Constantes
	 */
	public static final int PRECIO_DEF = 100;
	public static final String COLOR_DEF = "blanco";
	public static final char CONSUMO_DEF = 70;
	public static final float PESO_DEF = 5;
	/**
	 * Atributos
	 */
	private int precio;
	private String color;
	private char consumo;
	private float peso;



	/**
	 * Métodos por defecto
	 */

	/**
	 * Constructor con precio y peso, el resto por defecto
	 * 
	 */
	public Electrodomestico() {
		this.precio = PRECIO_DEF;
		this.color = COLOR_DEF;
		this.consumo = CONSUMO_DEF;
		this.peso = PESO_DEF;
		
		

	}

	/**
	 * Constructor 
	 * 
	 * @param precio
	 * @param peso
	 */
	public Electrodomestico(int precio, float peso) {
		this();
		this.precio = precio;
		this.peso = peso;	
	}
	
	
	public Electrodomestico(int precio, String color, char consumo, float peso) {
		this(precio, peso);
		
	if(comprobarConsumo(consumo)) {
		this.consumo = consumo;
	}else {
		this.consumo = CONSUMO_DEF;
	}
	
	if(comprobarColor(color)) {
		this.color = color;
	}else {
		this.color = COLOR_DEF;
	}
}
	
	/**
	 * METODOS GETTERS
	 * 
	 * @return precio
	 */
	protected int getPrecio() {
		return precio;
	}

	protected String getColor() {
		return color;
	}

	protected char getConsumo() {
		return consumo;
	}

	protected float getPeso() {
		return peso;
	}

	/**
	 * Metodo comprobar consumo energetico
	 * Bajo tabla ASCII para realizar estructuras de control
	 * @param consumo
	 * @return
	 */
	public boolean comprobarConsumo(char letra) {
		if((letra >= 65 && letra <= 70) || (letra >= 97 && letra <= 102) ) {
			return true;
		}
		return false;
	}

	/**
	 * Método comprobar color
	 * @param color
	 * @return
	 */
	public boolean comprobarColor(String color) {
		String [] paleta = new String [5];
		paleta[0] = "blanco";
		paleta[1] = "negro";
		paleta[2] = "rojo";
		paleta[3] = "azul";
		paleta[4] = "gris";
		int aux = 0;
		
		for (int i = 0; i < paleta.length; i++) {
			if(paleta[i].equals(color.toLowerCase())) {
			aux = 1;
			}else {
			aux = 0;
			}
		}
		if(aux == 1) {
			return true;
		}else {
			return false;
		}
	}
	
	
	/**
	 *  Tabla ASCII para realizar tabla de valores y su consumo
	 * @return precioProducto
	 */
	public float precioFinal() {
		int precioElectrodomestico = 0;
		int precioConsumo = 0;
		int precioPeso = 0;
		if(this.consumo == 65 || this.consumo == 97) {
			precioConsumo = 100; 
		}else if (this.consumo == 66 || this.consumo == 98) {
			precioConsumo = 80;
		}else if (this.consumo == 67 || this.consumo == 99) {
			precioConsumo = 60;
		}else if (this.consumo == 68 || this.consumo == 100) {
			precioConsumo = 50;
		}else if (this.consumo == 69 || this.consumo == 101) {
			precioConsumo = 30;
		}else if (this.consumo == 70 || this.consumo == 102) {
			precioConsumo = 10;
		}
		
		if(this.peso >= 0 && this.peso <= 19) {
			precioPeso = 10;
		}else if(this.peso >= 20 && this.peso <= 49) {
			precioPeso = 50;
		}else if(this.peso >= 50 && this.peso <= 79) {
			precioPeso = 80;
		}else if (this.peso >=80) {
			precioPeso = 100;
		}
		
		precioElectrodomestico = this.precio + precioConsumo + precioPeso;
		
		
		return precioElectrodomestico;
		
	}	
		
		
		@Override
		public String toString() {
			return "Electrodomestico [precio=" + precio + ", color=" + color + ", consumo="
					+ consumo + ", peso=" + peso + ", precioFinal()=" + precioFinal() + "]";
		}

	

	
}
