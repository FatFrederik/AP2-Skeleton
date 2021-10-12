package nl.vu.labs.phoenix.ap;

public class Set<T extends Comparable<T>> implements SetInterface<T> {

	private LinkedList list;

	@Override
	public void init() {
		list.init();
	}

	@Override
	public boolean add(T t) {
		if(!list.find(t)){
			list.insert(t);
			return true;
		} return false;
	}

	@Override
	public boolean checkForPresence(T t) { //simplify
		if(list.find(t)){
			return true;
		} return false;

		// is return list.find(t) niet zelfde?
	}

	@Override
	public T get() {
		//return  list.retrieve();
		return null;

	}

	@Override
	public boolean remove(T t) {
		if(list.find(t)){
			list.remove();
			return true;
		}
		return false;
	}

	@Override
	public boolean isEmpty() {
		return list.isEmpty();
	}

	@Override
	public int size() {
		return list.size();
	}

	@Override
	public SetInterface<T> copy() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SetInterface<T> intersection(SetInterface<T> set2) {
		return null;
	}

	@Override
	public SetInterface<T> union(SetInterface<T> set2) {
		return null;
	}

	@Override
	public SetInterface<T> difference(SetInterface<T> set2) {
		return null;
	}

	@Override
	public SetInterface<T> symmetricDifference(SetInterface<T> set2) {
		return null;
	}

}