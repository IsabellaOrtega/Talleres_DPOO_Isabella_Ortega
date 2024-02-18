package uniandes.dpoo.estructuras.logica;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Esta clase tiene un conjunto de métodos para practicar operaciones sobre arreglos de enteros y de cadenas.
 *
 * Todos los métodos deben operar sobre los atributos arregloEnteros y arregloCadenas.
 * 
 * No pueden agregarse nuevos atributos.
 * 
 * Implemente los métodos usando operaciones sobre arreglos (ie., no haga cosas como construir listas para evitar la manipulación de arreglos).
 */
public class SandboxArreglos
{
    /**
     * Un arreglo de enteros para realizar varias de las siguientes operaciones.
     * 
     * Ninguna posición del arreglo puede estar vacía en ningún momento.
     */
    private int[] arregloEnteros;

    /**
     * Un arreglo de cadenas para realizar varias de las siguientes operaciones
     * 
     * Ninguna posición del arreglo puede estar vacía en ningún momento.
     */
    private String[] arregloCadenas;

    /**
     * Crea una nueva instancia de la clase con los dos arreglos inicializados pero vacíos (tamaño 0)
     */
    public SandboxArreglos( )
    {
        arregloEnteros = new int[]{};
        arregloCadenas = new String[]{};
    }

    /**
     * Retorna una copia del arreglo de enteros, es decir un nuevo arreglo del mismo tamaño que contiene copias de los valores del arreglo original
     * @return Una copia del arreglo de enteros
     */
    public int[] getCopiaEnteros( )
    {
    	int[] CopiaDeEnteros= arregloEnteros.clone();
        return CopiaDeEnteros;
    }

    /**
     * Retorna una copia del arreglo de cadenas, es decir un nuevo arreglo del mismo tamaño que contiene copias de los valores del arreglo original
     * @return Una copia del arreglo de cadenas
     */
    public String[] getCopiaCadenas( )
    {
    	String[] CopiaDeCadena = arregloCadenas.clone();
        return CopiaDeCadena;
    }

    /**
     * Retorna la cantidad de valores en el arreglo de enteros
     * @return
     */
    public int getCantidadEnteros( )
    {
    	int respuesta = arregloEnteros.length;
        return respuesta;
    }

    /**
     * Retorna la cantidad de valores en el arreglo de cadenas
     * @return
     */
    public int getCantidadCadenas( )
    {
    	int respuestas = arregloCadenas.length;
        return respuestas;
    }

    /**
     * Agrega un nuevo valor al final del arreglo. Es decir que este método siempre debería aumentar en 1 la capacidad del arreglo.
     * 
     * @param entero El valor que se va a agregar.
     */
    public void agregarEntero( int entero )
    {
    	int tamaño= arregloEnteros.length +1;
    	int[] respuesta = new int[tamaño];
    	
    	for (int i = 0; i<arregloEnteros.length; i++)
    	{respuesta[i]= arregloEnteros[i];}
    	
    	respuesta[arregloEnteros.length]= entero;
    	arregloEnteros = respuesta;
    	

    }

    /**
     * Agrega un nuevo valor al final del arreglo. Es decir que este método siempre debería aumentar en 1 la capacidad del arreglo.
     * 
     * @param cadena La cadena que se va a agregar.
     */
    public void agregarCadena( String cadena )
    {
    	
    	int tamaño= arregloCadenas.length +1;
    	String[] respuestas = new String[tamaño];
    	
    	for (int i = 0; i<arregloCadenas.length; i++)
    	{respuestas[i]= arregloCadenas[i];}
    	
    	respuestas[arregloCadenas.length]= cadena;
    	arregloCadenas = respuestas;
    	
    }

    /**
     * Elimina todas las apariciones de un determinado valor dentro del arreglo de enteros
     * @param valor El valor que se va eliminar
     */
    public void eliminarEntero( int valor )
    {
    	ArrayList<Integer> filtrado = new ArrayList<>();	
    	for (int element : arregloEnteros)
    	{if (element !=  valor)
    	{filtrado.add(element);
    	}
    	
    	arregloEnteros = new int[filtrado.size()];
    	for (int i = 0; i < filtrado.size(); i++)
    	{arregloEnteros[i] = filtrado.get(i);}

    }
    }

    /**
     * Elimina todas las apariciones de un determinado valor dentro del arreglo de cadenas
     * @param cadena La cadena que se va eliminar
     */
    public void eliminarCadena( String cadena )
    {
    	ArrayList<String> filtrado = new ArrayList<>();	
    	for (String element : arregloCadenas)
    	{if (!element.equals(cadena))
    	{filtrado.add(element);
    	}
    	
    	arregloCadenas = filtrado.toArray(new String[0]);

    }}

    /**
     * Inserta un nuevo entero en el arreglo de enteros.
     * 
     * @param entero El nuevo valor que debe agregarse
     * @param posicion La posición donde debe quedar el nuevo valor en el arreglo aumentado. Si la posición es menor a 0, se inserta el valor en la primera posición. Si la
     *        posición es mayor que el tamaño del arreglo, se inserta el valor en la última posición.
     */
    public void insertarEntero( int entero, int posicion )
    {

    }

    /**
     * Elimina un valor del arreglo de enteros dada su posición.
     * @param posicion La posición donde está el elemento que debe ser eliminado. Si el parámetro posicion no corresponde a ninguna posición del arreglo de enteros, el método
     *        no debe hacer nada.
     */
    public void eliminarEnteroPorPosicion( int posicion )
    {
    	if (posicion < 0 || posicion >= arregloEnteros.length)
    	{ return ; }
    	
    	int listacorta = arregloEnteros.length -1;
    	
    	int[] nueva = new int[listacorta];
    	System.arraycopy(arregloEnteros, 0, nueva, 0, posicion);
    	System.arraycopy(arregloEnteros, posicion + 1, nueva, posicion, arregloEnteros.length - posicion -1);
    	
    	arregloEnteros = nueva;

    }

    /**
     * Reinicia el arreglo de enteros con los valores contenidos en el arreglo del parámetro 'valores' truncados.
     * 
     * Es decir que si el valor fuera 3.67, en el nuevo arreglo de enteros debería quedar el entero 3.
     * @param valores Un arreglo de valores decimales.
     */
    public void reiniciarArregloEnteros( double[] valores )
    {
    	int[] nuevo = new int[valores.length];
    	
    	for(int i = 0; i < valores.length; i++)
    	{int numeronuevo = (int)Math.round(valores[i]);
    	nuevo[i] = numeronuevo;
    	}
    	arregloEnteros = nuevo;

    }

    /**
     * Reinicia el arreglo de cadenas con las representaciones como Strings de los objetos contenidos en el arreglo del parámetro 'objetos'.
     * 
     * Use el método toString para convertir los objetos a cadenas.
     * @param valores Un arreglo de objetos
     */
    public void reiniciarArregloCadenas( Object[] objetos )
    {
        int size = objetos.length;
        String[] nuevo = new String[size];
    	
    	for(int i = 0; i < objetos.length; i++)
    	{
    	nuevo[i] = objetos[i].toString();
    	}
    	arregloCadenas = nuevo;
    	

    }

    /**
     * Modifica el arreglo de enteros para que todos los valores sean positivos.
     * 
     * Es decir que si en una posición había un valor negativo, después de ejecutar el método debe quedar el mismo valor muliplicado por -1.
     */
    public void volverPositivos( )
    {
    	int tamaño = arregloEnteros.length;
    	int[] lista = new int[tamaño];
    	
    	for (int i = 0; i < tamaño; i++)
    	{if (arregloEnteros[i] < 0)
    		{lista[i] = arregloEnteros[i]*(-1);}
    	else {lista[i] = arregloEnteros[i];}
    	}
    	
    	arregloEnteros = lista;
    }

    /**
     * Modifica el arreglo de enteros para que todos los valores queden organizados de menor a mayor.
     */
    public void organizarEnteros( )
    {
    	Arrays.sort(arregloEnteros);
    	
    }

    /**
     * Modifica el arreglo de cadenas para que todos los valores queden organizados lexicográficamente.
     */
    public void organizarCadenas( )
    {
    	Arrays.sort(arregloCadenas);

    }

    /**
     * Cuenta cuántas veces aparece el valor recibido por parámetro en el arreglo de enteros
     * @param valor El valor buscado
     * @return La cantidad de veces que aparece el valor
     */
    public int contarApariciones( int valor )
    {
        int respuesta = 0;
        int tamaño = arregloEnteros.length;
        for (int i = 0; i < tamaño; i++)
        {if (arregloEnteros[i] == valor)
        	{respuesta += 1;}}
        
        return respuesta;
    }
    

    /**
     * Cuenta cuántas veces aparece la cadena recibida por parámetro en el arreglo de cadenas.
     * 
     * La búsqueda no debe diferenciar entre mayúsculas y minúsculas.
     * @param cadena La cadena buscada
     * @return La cantidad de veces que aparece la cadena
     */
    public int contarApariciones( String cadena )
    {
    	int respuesta = 0;
        int tamaño = arregloCadenas.length;
        for (int i = 0; i < tamaño; i++)
        {if (arregloCadenas[i].equalsIgnoreCase(cadena) )
        	{respuesta += 1;}}
        
        return respuesta;
    }

    /**
     * Busca en qué posiciones del arreglo de enteros se encuentra el valor que se recibe en el parámetro
     * @param valor El valor que se debe buscar
     * @return Un arreglo con los números de las posiciones del arreglo de enteros en las que se encuentra el valor buscado. Si el valor no se encuentra, el arreglo retornado
     *         es de tamaño 0.
     */
    public int[] buscarEntero( int valor )
    {
    	int repetidos = 0;
    	for (int i = 0; i < arregloEnteros.length; i++) 
        {if (arregloEnteros[i] == valor) 
            {repetidos++;}}

        int[] respuesta = new int[repetidos];
        int pos = 0;
        for (int i = 0; i < arregloEnteros.length; i++) 
        {if (arregloEnteros[i] == valor) 
            {respuesta[pos] = i;
                pos++;}}

        return respuesta;
    }

    /**
     * Calcula cuál es el rango de los enteros (el valor mínimo y el máximo).
     * @return Un arreglo con dos posiciones: en la primera posición, debe estar el valor mínimo en el arreglo de enteros; en la segunda posición, debe estar el valor máximo
     *         en el arreglo de enteros. Si el arreglo está vacío, debe retornar un arreglo vacío.
     */
    public int[] calcularRangoEnteros( )
    {
        return null;
    }

    /**
     * Calcula un histograma de los valores del arreglo de enteros y lo devuelve como un mapa donde las llaves son los valores del arreglo y los valores son la cantidad de
     * veces que aparece cada uno en el arreglo de enteros.
     * @return Un mapa con el histograma de valores.
     */
    public HashMap<Integer, Integer> calcularHistograma( )
    {
     return null;
    }

    /**
     * Cuenta cuántos valores dentro del arreglo de enteros están repetidos.
     * @return La cantidad de enteos diferentes que aparecen más de una vez
     */
    public int contarEnterosRepetidos( )
    {
    	HashMap<Integer, Integer> repetidos = new HashMap<>();
    	int respuesta = 0;
        
        for (int num : arregloEnteros) 
        {repetidos.put(num, repetidos.getOrDefault(num, 0) + 1);}
        for (int frec : repetidos.values()) 
        {if (frec > 1) 
            {respuesta+=1;}}

        return respuesta;
    }

    /**
     * Compara el arreglo de enteros con otro arreglo de enteros y verifica si son iguales, es decir que contienen los mismos elementos exactamente en el mismo orden.
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si los arreglos son idénticos y false de lo contrario
     */
    public boolean compararArregloEnteros( int[] otroArreglo )
    {
    	if (arregloEnteros.length != otroArreglo.length) 
    	{return false;}

        for(int i=0; i < arregloEnteros.length; i++) 
        {if (arregloEnteros[i] != otroArreglo[i]) 
        {return false;}}

        return true;
    }

    /**
     * Compara el arreglo de enteros con otro arreglo de enteros y verifica que tengan los mismos elementos, aunque podría ser en otro orden.
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si los elementos en los dos arreglos son los mismos
     */
    public boolean mismosEnteros( int[] otroArreglo )
    {
    	if (arregloEnteros.length != otroArreglo.length) 
    	{return false;}

        int[] copiaEnteros = Arrays.copyOf(arregloEnteros, arregloEnteros.length);
        int[] copiaOtro = Arrays.copyOf(otroArreglo, otroArreglo.length);
        Arrays.sort(copiaEnteros);
        Arrays.sort(copiaOtro);

        for (int i = 0; i < copiaEnteros.length; i++)
        {if (copiaEnteros[i] != copiaOtro[i]) 
        {return false;}}
        return true;
    }

    /**
     * Cambia los elementos del arreglo de enteros por una nueva serie de valores generada de forma aleatoria.
     * 
     * Para generar los valores se debe partir de una distribución uniforme usando Math.random().
     * 
     * Los números en el arreglo deben quedar entre el valor mínimo y el máximo.
     * @param cantidad La cantidad de elementos que debe haber en el arreglo
     * @param minimo El valor mínimo para los números generados
     * @param maximo El valor máximo para los números generados
     */
    public void generarEnteros( int cantidad, int minimo, int maximo )
    {
    	int[] arreglosEnteros = new int[cantidad];
    	
    	for (int i = 0; i < cantidad; i ++)
    	{ int random = (int)(Math.random()*(maximo - minimo +1)) + minimo;
    	arregloEnteros[i] = random;
    	}

    }

}
