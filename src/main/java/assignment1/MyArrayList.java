package assignment1;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyArrayList<E> implements List<E> {
	
		// Object[]를 기반으로 Array Doubling 전략으로 MyArrayList 를 구현 
	
		private Object[] array;
		private int size;

		public MyArrayList() {
			array =new Object[10];
			size = 0;
		}
		
		
		public int size() {
			return size;
		}

	
		public boolean isEmpty() {
			return size == 0;
		}

	
		public boolean contains(Object o) {
			
			return false;
		}


		public Iterator<E> iterator() {
			return null;
		}


		public Object[] toArray() {
			
			return null;
		}

	
		public <T> T[] toArray(T[] a) {
			
			return null;
		}

	
		public boolean add(E e) {
			if (size >= array.length) {  //  배열의 크기를 초과할 경우 array doubling 
				E[] bigger = (E[]) new Object[array.length*2]; // 두배의 길이 배열을 할당한다.
				System.arraycopy(array, 0, bigger, 0, array.length); // 새로운 배열로 값을 옮긴다
				array = bigger; //array 에 새로운 배열을 넣는다. 
			}
			array[size]=e; // 배열의 끝에 값 삽입  
			size++;
			return true;
		}

	
		public boolean remove(Object o) {
			int index = indexOf(o);
			if (index == -1) {
				return false;
			}
			remove(index);
			return true;
		}

		
		public boolean containsAll(Collection<?> c) {
			return false;
		}

		
		public boolean addAll(Collection<? extends E> c) {
			return false;
		}

		
		public boolean addAll(int index, Collection<? extends E> c) {
			return false;
		}

		
		public boolean removeAll(Collection<?> c) {
			return false;
		}

	
		public boolean retainAll(Collection<?> c) {
			return false;
		}

	
		public void clear() {
			size = 0;
		}

		public E get(int index) {
			if (index < 0 || index >= size) {
				throw new IndexOutOfBoundsException();
			}
			return (E) array[index];
		}


		public E set(int index, E element) {
			E old = get(index);
			array[index] = element;
			return old;
		}


		public void add(int index, E element) {
			if (index <0 || index> size) { // index 가 0보다 작거나 array의 size 보다 클 경우 exception
				throw new IndexOutOfBoundsException();
			}
			
			add(element); // resizing 하기 위해 끝에 삽입 
			
			for (int i=size-1; i>index;i--) { // index 보다 뒤에 있는 element를 한칸씩 옆으로 옮김. (index 에 값을 추가하기 위해)
				array[i] = array[i-1]; 
			}
			array[index] = element; // array의 index에 element 추가 
			
			
		}


		public E remove(int index) {
			E element = get(index);
			for (int i=index; i<size-1; i++) {
				array[i] = array[i+1];
			}
			size--;
			return element;
		}


		public int indexOf(Object o) {

			return 0;
		}


		public int lastIndexOf(Object o) {

			return 0;
		}


		public ListIterator<E> listIterator() {
			//return new MyListIterator(array);
			return new ListIterator<E>() {
				private Object[] data = array;
				private int index =0;

				
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
			};
				
		}

		
		public ListIterator<E> listIterator(int index) {
			
			return null;
		}

		
		public List<E> subList(int fromIndex, int toIndex) {
			
			return null;
		}


}

