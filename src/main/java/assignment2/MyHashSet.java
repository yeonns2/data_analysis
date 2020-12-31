package assignment2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class MyHashSet<E> implements Set<E> {

	private MyBucket<E>[] buckets;
	private int bucketSize;
	
	private int hash(E e) { // bucketSize로 나누어 해시 
        return e.hashCode() % bucketSize;
    }
	
	@SuppressWarnings("unchecked")
	public MyHashSet(int bucketSize) {
		buckets = new MyBucket[bucketSize];
		this.bucketSize= bucketSize;
	}
	
	public int size() {
		int size = 0;
		for (MyBucket<E> b : buckets) { //buckets을 순회하며 값이 있을때마다 size++
			if (b != null)
				size += b.getBucketList().size();
		}
		return size;
	}

	public boolean isEmpty() {
		int size = 0;
		for (MyBucket<E> b : buckets) {
			if (b != null)
				size += b.getBucketList().size();
		}
		
		return size == 0; //size가 0이면 true 반환 
	}
	
	
	public boolean contains(Object o) {
		int idx = hash((E)o); // 객체 o의 해시값 저장 
        if (buckets[idx] == null || !buckets[idx].getBucketList().contains(o)) // null이거나 hash값에 연결된 arraylist에 값이 없으면 false 
            return false;
        return true;
	}
 
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean add(E e) {
		if (contains(e)) // 중복체크 
            return false;
        int idx = hash(e); // 객체 e의 해시 값 저장 
        if (buckets[idx] == null) // 만약 buckets[idx]이 null이면  
            buckets[idx] = new MyBucket<E>(idx, new ArrayList<E>()); // hash값과 새로운 arraylist 객체 생성 
        if (buckets[idx].getBucketList().add(e)) { // hash 값에 연결된 arraylist에 에 값 저장  
            return true;
        }
        return false;
	}

	public boolean remove(Object o) {
		if (!contains(o)) // 지울 값이 있는지 확인  
            return false;
        int idx = hash((E)o); // 객체 o의 해시값 저
        if (buckets[idx].getBucketList().remove(o)) { // hash값에 연결된 arraylist에서 객체 삭제 
            return true;
        }
        return false;
	}

	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean addAll(Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean retainAll(Collection<?> c) {
		
		MyBucket<E>[] a = new MyBucket[this.bucketSize]; // 중복된 객체들을 저장할 새로운 MyBucket[]
		
		for(MyBucket<E> b : buckets) { // MyBucket을 순회하며 Collection c와 중복된 값이 있으면 a에 삽입.  
			if (b != null) {
				for(E e: b.getBucketList()) {
					if(c.contains(e)) {
				
						int idx = hash(e);
				        if (a[idx] == null)
				            a[idx] = new MyBucket<E>(idx, new ArrayList<E>());
				        a[idx].getBucketList().add(e);
				        
				        
					}
				}
			}
		}
		buckets=a; // buckets을 a로 교체 
		
		return false;
	}

	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	public void clear() {
		// TODO Auto-generated method stub
		
	}
	
}
