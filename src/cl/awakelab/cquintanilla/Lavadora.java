package cl.awakelab.cquintanilla;
/**
 * Subclase Lavadora hereda de Electrodomestico
 * @author Quintanilla
 *
 */
public class Lavadora extends Electrodomestico {
	/**
	 * Declaración constante por defecto
	 */
	public static final int CARGA_DEF = 5;
	/**
	 * Constructor por defecto
	 */

	private int carga;	
	
	public Lavadora() {
		super();
		this.carga = CARGA_DEF;
		
	}
	
	public Lavadora(int precio, float peso) {
		this();
		this.getPrecio();
		this.getPeso();
	}
	
	
	public Lavadora(int precio, String color, char consumo, float peso, int carga) {
		super(precio, color, consumo, peso);
		this.carga = carga;
	}
	/**
	 * Método GETCarga
	 * @return
	 */
	protected int getCarga() {
		return carga;
	}
	
	public float precioFinal() {
		int precioCarga = 0;
		float precioLavadora = 0;
		if (this.carga > 30) {
			precioCarga = 50;
		}else {
			precioCarga = 0;
		}
			
			precioLavadora = super.precioFinal() + precioCarga;
			
			return precioLavadora;
		}

	
	
	/**
	 * Sobrecarga
	 */
	@Override
	public String toString() {
		return "Lavadora [carga=" + carga + ", precioFinal()=" + precioFinal() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
}
