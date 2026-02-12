	class MyHashSet {
	    private final int size = 1000;

	    private LinkedList<Integer>[] buckets;
	    public MyHashSet() {

	        buckets = new LinkedList[size];

	        for (int i = 0; i < size; i++)

	            buckets[i] = new LinkedList<>();

	    }
	    private int hash(int key) {

	        return key % size;

	    }
	    public void add(int key) {

	        int h = hash(key);

	        if (!buckets[h].contains(key))

	            buckets[h].add(key);

	    }
	    public void remove(int key) {

	        int h = hash(key);

	        buckets[h].remove((Integer) key);

	    }
	    public boolean contains(int key) {

	        int h = hash(key);

	        return buckets[h].contains(key);

	    }

	}
/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */