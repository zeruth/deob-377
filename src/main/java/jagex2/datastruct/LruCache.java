package jagex2.datastruct;


public final class LruCache {
	private Hashable selectedNode = new Hashable();

	private Stack history = new Stack();

	private int capacity;

	private int available;

	private HashTable hashtable;

	public LruCache(int size) {
		this.capacity = size;
		this.available = size;
		this.hashtable = new HashTable(1024);
	}

	public Hashable get(long arg0) {
		Hashable node = (Hashable) this.hashtable.get(arg0);
		if (node != null) {
			this.history.method33(node);
		}

		return node;
	}

	public void put(Hashable value, long key) {
		if (this.available == 0) {
			Hashable node = this.history.pop();
			node.unlink();
			node.uncache();
			if (node == this.selectedNode) {
				node = this.history.pop();
				node.unlink();
				node.uncache();
			}
		} else {
			this.available--;
		}
		this.hashtable.method164(value, key);
		this.history.method33(value);
	}

	public void clear() {
		while (true) {
			Hashable node = this.history.pop();
			if (node == null) {
				this.available = this.capacity;
				return;
			}
			node.unlink();
			node.uncache();
		}
	}
}
