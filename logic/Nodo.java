package logic;

import java.util.TreeSet;

/**
 * Representa un nodo dentro de un {@link Grafo}
 * @author Jos� Rafael Carrero Le�n <a href="mailto:josercl@gmail.com">&lt;josercl@gmail.com&gt;</a>
 * @since 1.6
 *
 */
public class Nodo implements Comparable<Nodo>{

	private Nodo padre;
	private int numero;
	private TreeSet<Nodo> vecinos;
	
	/**
	 * Crea un nodo representado por el n�mero n. El nodo es creado con un listado vac�o de nodos vecinos
	 * @param n El n�mero que representa a este nodo dentro del grafo
	 */
	public Nodo(int n){
		this.numero=n;
		this.vecinos=new TreeSet<Nodo>();
	}

	/**
	 * Devuelve el nodo "padre" de este objeto. Es usado en la creaci�n de caminos
	 * @return El nodo padre
	 */
	public Nodo getPadre() {
		return padre;
	}

	/**
	 * Establece el nodo "padre" de este objeto. Es usado en la craci�n de caminos
	 * @param padre El nodo padre
	 */
	public void setPadre(Nodo padre) {
		this.padre = padre;
	}

	/**
	 * Obtiene el n�mero representativo del nodo dentro del grafo.
	 * @return El n�mero que representa al nodo en el grafo
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * <p>Compara 2 nodos para ver si son iguales.</p>
	 * <p>Un nodo se considera igual a otro nodo si el n�mero que los representa es el mismo</p>
	 * @param nodo2
	 * @return true si los numeros representativos de los nodos son iguales, false en caso contrario
	 */
	public boolean equals(Nodo nodo2){
		return this.numero==nodo2.getNumero();
	}
	
	public String toString(){
		return numero+"";
	}

	/**
	 * Compara 2 nodos para establecer un orden entre los mismos
	 * @param otroNodo El nodo con el que se realiza la comparaci�n
	 * @return <ul><li>&lt;1 si el nodo es menor que otroNodo</li>
	 * <li>0 si son iguales</li>
	 * <li>&gt1 si otroNodo es mayor 
	 */
	public int compareTo(Nodo otroNodo) {
		return numero-otroNodo.getNumero();
	}

	/**
	 * Devuelve un conjunto de los nodos adyacentes en el grafo.
	 * El n�mero m�ximo de vecinos para un nodo dentro de un laberinto siempre ser� 4
	 * @return Un conjunto de los nodos adyacentes en el grafo
	 */
	public TreeSet<Nodo> getVecinos() {
		return vecinos;
	}
}
