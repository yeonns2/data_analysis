package assignment1;

import java.util.ListIterator;

public class MyListIterator<E> implements ListIterator<E> {

	private Object[] data;
	private int index;
	
	public MyListIterator(Object[] data) {
		this.data = data;
		index = 0;
	}
	
	public boolean hasNext() {
		if (data[index]!= null)
			return true;
		return false;
	}

	
	public E next() {
		if (hasNext()) {
		      E item = (E) data[index];
		      index++;
		      return item;
		    }
		else{
			throw new java.util.NoSuchElementException();
		}
	}

	
	public boolean hasPrevious() {
		// TODO Auto-generated method stub
		return false;
	}

	
	public E previous() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public int nextIndex() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public int previousIndex() {
		// TODO Auto-generated method stub
		return 0;
	}


	public void remove() {
		// TODO Auto-generated method stub
		
	}


	public void set(E e) {
		// TODO Auto-generated method stub
		
	}


	public void add(E e) {
		// TODO Auto-generated method stub
		
	}

}
