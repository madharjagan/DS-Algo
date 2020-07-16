package me.learning.ds.hashing;

import me.learning.ds.linkedlist.generics.LinkedList;

public class Hash<K, V> implements IHash<K, V> {
	
	class HashElement<K,V> implements Comparable<HashElement<K,V>>{
		K key;
		V value;
		 
		public HashElement(K key, V value) {
			this.key= key;
			this.value = value;			
		}

		@Override
		public int compareTo(HashElement<K, V> o) {
			return ((Comparable<K>)this.key).compareTo(o.key);
		}
		
	}
	
	LinkedList<HashElement<K,V>>[] hashingTable;
	int tableSize; 
	int numOfElements;
	double maxLoadFactor;
	
	public Hash(int tableSize) {
		this.tableSize = tableSize;
		this.maxLoadFactor = 0.75;
		this.numOfElements = 0;
		hashingTable = (LinkedList<HashElement<K,V>>[]) new LinkedList[tableSize];
		for(int i = 0; i< tableSize;i++) {
			hashingTable[i] = new LinkedList<HashElement<K,V>>();
		}
	}
	
	private int getPreHash(K key) {
		int hashVal = key.hashCode();
		hashVal = hashVal & 0x7FFFFFFF;
		hashVal = hashVal % tableSize;
		return hashVal;		
	}
	
	public boolean add(K key, V value) {
		HashElement<K, V> newElement = new HashElement(key, value);
		int hashVal = getPreHash(key);
		hashingTable[hashVal].addNodeAtBegin(newElement); 
		numOfElements++;
		return true;
		
	}
	
	public HashElement<K, V> remove(K key){
		V value = getValue(key);
		int hashVal = getPreHash(key);
		HashElement<K, V> removedHashElement = hashingTable[hashVal].remove(new HashElement<K,V>(key, value));
		numOfElements++;
		return removedHashElement;
	}
	
	public V getValue(K key) {		
		int hashVal = getPreHash(key);
		for(HashElement<K, V> element:hashingTable[hashVal]) {
			if(((Comparable<K>)key).compareTo(element.key)==0) {
				return element.value;
			}
		}
		return null;
	}
	
	

}
