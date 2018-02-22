/*
 * Implementar un almacén de enteros mediante una tabla de huecos
 * se supone que no puede contener el valor 0 ya que indica posiciones libre.
 */
/**
 * 
 * @author diego
 *
 */
public class Almacen1 {
	static private final int LIBRE = 0;
	// Array con los valores almacenados
	private int tvalores[];
	private int valoresAlmacenados = 0;
	
	// Constructores sin parámetros creo una tabla de 10 elementos
	/**
	 * Es el contructor sin parametros inicializado con un tamaño de 10
	 */
	public Almacen1(){
		this(10);  // Llamo al constructor con parámetros
	}

	// Constructor donde se fija tamaño máximo del Almacén
	/**
	 * constructor del Almacen 1
	 * @param tamaño nos indica en tamaño de nuestra tabla
	 */
	public Almacen1( int tamaño){
		tvalores = new int [tamaño];
		init();
	}
	
	// Pone todas las posiciones a LIBRES
	/**
	 * metodo en el cual pone posiciones LIBRES  a las tablas cuando es 0
	 */
	public void init (){
		for (int i = 0; i < tvalores.length; i++) {
			tvalores[i] = Almacen1.LIBRE;
		}
		valoresAlmacenados = 0;
	}
	
	// Muestra una cadena con los valores de la tabla
	/**
	 * toString imprime los valores de la tabla
	 */
	public String toString (){
		String valores="";
		for(int i=0; i < tvalores.length; i++) {
			int aux = tvalores[i];
			valores += " " + aux;
		}
		return valores;
	}
	
	// Devuelve el números de posiciones libres
	/**
	 * Cuenta la cantidad de espacios en blancos
	 * @return devuelve la cantidad de espacios libres
	 */
	public int numPosicionesLibres(){
		int valoreslibres=0;
		for(int i=0; i < tvalores.length; i++) {
			if(tvalores[i] == Almacen1.LIBRE) {
				valoreslibres++;
			}
		}
		return valoreslibres;
	}
	
	// Devuelve el número de posiones ocupadas
	/**
	 * Cuenta los espacios ocupados
	 * @return devuelve los valores ocupados
	 */
	public int numPosicionesOcupadas(){
		int valoresocupados=0;
		for(int i=0; i < tvalores.length; i++) {
			if(tvalores[i] != Almacen1.LIBRE) {
				valoresocupados++;
			}
		}
		return valoresocupados;
	}
	
	// Devuelve verdadero o falso si está almacenado el valor en la tabla
	/**
	 * comprueba si un numero esta
	 * @param num numero que comprobamos si esta en la tabla o no
	 * @return devolvemos verdadero en caso de que este y falso si no lo esta
	 */
	public boolean estaValor ( int num){
		boolean esta=false;
		for(int i = 0; i <tvalores.length; i++) {
			if(tvalores[i]==num) {
				esta = true;
			}
			else {
				esta = false;
			}
		}
	return esta;
	}
	
	// Almacena el valor en la tabla, devuelve false sin no puede almacenarlo
	/**
	 * introduces un valor a la tabla
	 * @param num numero que introducimos
	 * @return verdadero si podemos ponerlo y falso si no
	 */
	public boolean ponValor (int num){
		boolean pon = false;
		for(int i = 0; i< tvalores.length;i++) {
			if(tvalores[i] == Almacen1.LIBRE) {
				tvalores[i] = num;
				pon = true;
				break;
			}
		}
		
		return pon;
	
	}
	
	// Elimina el elemento de la tabla, si no esta devuelve false
	/**
	 * Eliminas un valor
	 * @param num numero introducido
	 * @return devuelve true si num esta y false si no lo esta
	 */
	public boolean sacarValor (int num){	
		boolean esta = false;
		for(int i = 0; i< tvalores.length;i++) {
			if(tvalores[i]== num) {
				tvalores[i] = Almacen1.LIBRE;
				esta = true;
			}
				
		}
		return esta;
		
	
	}
      // Indica si el almacén esta lleno
	/**
	 * comprueba si la tabla esta lleno
	 * @return devuelve true si estan todas las  posiciones ocupadas y false si hay al menos una posicion esta libre
	 */
	public boolean estaLleno (){	
		boolean lleno = false;
		for(int i = 0; i < tvalores.length;i++) {
			if(tvalores[i] == Almacen1.LIBRE) {
				lleno = false;
				break;
			}
		}
		return lleno;
	}
}
