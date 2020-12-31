package assignment3;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;

public class MyTreeSet<E> implements NavigableSet<E> {

	private MyNode<E> root;
	private int size = 0;
	private Comparator<? super E> comparator;
	
	private int canCompare(E element1, E element2) { //comparator를 이용한 객체간 비교 
        return comparator != null ? comparator.compare(element1, element2) : ((Comparable<? super E>)element1).compareTo(element2);
    }
	
	@Override
	public boolean add(E e) {
		if (root == null) { //만약 root 노드가 비어 있으면 새로운 노드 추가 
			root = new MyNode<E>(e, null, null, null);
            size++;
            return true;
        }

        MyNode<E> curr = root; 

        while (curr != null) { // 만약 root 노드가 비어있지않으면 
            int compare = canCompare(e, curr.getData()); // 들어온 데이터와 현재 노드의 데이터 값을 비교 
            if (compare < 0) { // 현재 노드의 데이터보다 작으면 왼쪽 노드가 비어있는지 확인하고 비어있다면 왼쪽에 추가   
            	
                if (curr.getLeft() == null) {
                    curr.setLeft(new MyNode<E>(e, curr, null, null));
                    size++;
                    return true;
                }

                curr = curr.getLeft(); // 비어있지 않다면 왼쪽으로 내려가면서 다시 비교 
            } 
            else if (compare > 0) { // 현재 노드의 데이터보다 크면 오른쪽 노드가 비어 있는지 확인하고 비어있다면 오른쪽에 추가  

                if (curr.getRight() == null) {
                    curr.setRight(new MyNode<E>(e, curr, null, null));
                    size++;
                    return true;
                }

                curr = curr.getRight(); //비어있지 않다면 오른쪽으로 내려가면서 다시 비교  
            } 
            else {
                return false; //같으면 추가하지 않고 false 반환   
            }
        }
        return false;
	}

	@Override
	public E first() {
		MyNode<E> curr = root;
		E data = root.getData();
		//왼쪽 노드가 비어있을 때까지 왼쪽으로 계속 내려간 후 비어있다면 현재 노드의 데이터를 반환 
        while (curr.getLeft() != null) { 
        	curr = curr.getLeft(); 
        	data = curr.getData();
        }
		return data;
	}

	@Override
	public E last() {
		MyNode<E> curr = root;
		E data = root.getData();
		//오른쪽 노드가 비어있을 때까지 오른쪽으로 계속 내려간 후 비어있다면 현재 노드의 데이터를 반환 
        while (curr.getRight() != null) {
        	curr = curr.getRight();
        	data = curr.getData();
        }
		return data;
	}

	//e 값을 가진 노드가 있는지 확인하는 함수 
	private MyNode<E> findNode(MyNode<E> curr, E e) {

        if (curr == null) {
            return null;
        }

        int compare = canCompare(e, curr.getData()); // 인자로 들어온 데이터와 현재 노드의 데이터 비교 

        if (compare < 0) { // e가 현재 노드의 데이터보다 작으면 
            return findNode(curr.getLeft(), e); // 왼쪽으로 이동하면서 탐색 
        } 
        else if (compare > 0) { // e 가 현재 노드의 데이터보다 크면 
            return findNode(curr.getRight(), e); //오른쪽으로 이동하면서 탐색 
        }

        return curr; // 현재 노드의 데이터와 e 가 같으면 현재 노드 반
    }
	
	@Override
	public boolean contains(Object o) {
		
		return findNode(root, (E) o) != null; // o 를 가진 노드가 있다면 true 반환
	}

	@Override
	public Comparator<? super E> comparator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}

	@Override
	public E lower(E e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E floor(E e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E ceiling(E e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E higher(E e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E pollFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E pollLast() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NavigableSet<E> descendingSet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator<E> descendingIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NavigableSet<E> subSet(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NavigableSet<E> headSet(E toElement, boolean inclusive) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NavigableSet<E> tailSet(E fromElement, boolean inclusive) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SortedSet<E> subSet(E fromElement, E toElement) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SortedSet<E> headSet(E toElement) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SortedSet<E> tailSet(E fromElement) {
		// TODO Auto-generated method stub
		return null;
	}

}