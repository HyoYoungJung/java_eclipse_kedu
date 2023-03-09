package sec03_1;

public class Entry<K, V> { // 엔트리 제네릭 클래스 생성
	private K key;
	private V value;

	public Entry(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}
}
