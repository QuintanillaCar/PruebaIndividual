package cl.awakelab.cquintanilla;
/**
 * Subclase Television hereda de Electrodomestico
 * @author Quintanilla
 *
 */
public class Television extends Electrodomestico {
	/**
	 * Declaración de constantes
	 */
	public static final int RESOLUCION_DEF = 20;
	public static final boolean SINTONIZADOR_DEF = false;
	
	/**
	 * Atributos
	 */
	private int resolucion;
	private boolean sintonizador;

	/**
	 * Constructor por defecto
	 */
	public Television() {
		super();
		this.resolucion = RESOLUCION_DEF;
		this.sintonizador = SINTONIZADOR_DEF;
	}
	/**
	 * Constructos con parametros precio y peso, el resto por defecto
	 * @param precio
	 * @param peso
	 */
	
	
	public Television(int precio, float peso) {
		this();
		this.getPrecio();
		this.getPeso();
	}
	/**
	 * Constructor con parametros
	 * @param precio
	 * @param color
	 * @param consumo
	 * @param peso
	 * @param resolucion
	 * @param sintonizador
	 */
	public Television(int precio, String color, char consumo, float peso, int resolucion, boolean sintonizador) {
		super(precio, color, consumo, peso );
		this.resolucion = resolucion;
		this.sintonizador = sintonizador;
	}
	protected int getResolucion() {
		return resolucion;
	}
	protected boolean isSintonizador() {
		return sintonizador;
	}
	/**
	 * Método precioFinal
	 */
	public float precioFinal() {
		float precioResolucion = 0;
		float precioSintonizador = 0;
		float precioTelevision = 0;
		if(this.resolucion > 40) {
			precioResolucion = (float)((super.getPrecio())*0.3);
		}
		if(this.isSintonizador()) {
			precioSintonizador = 50;
		}
		
		precioTelevision = super.getPrecio()+ precioResolucion + precioSintonizador;
		
		return precioTelevision;
	}

	@Override
	public String toString() {
		return "Television [resolucion=" + resolucion + ", sintonizador=" + sintonizador + ", precioFinal()="
				+ precioFinal() + ", toString()=" + super.toString() + "]";
	}



}
