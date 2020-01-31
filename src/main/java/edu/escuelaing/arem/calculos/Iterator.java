package edu.escuelaing.arem.calculos;

import java.util.Iterator;

class Iterador<T> implements Iterator<T> {
	Node<T> actual;

	public Iterador(Node<T> real) {
		actual = real;
	}
	
	public boolean hasNext() {
		return actual != null;
	}

	public T next() {
		T data = (T) actual.getData();
        actual = actual.getNext();
        return data;
	}

}
