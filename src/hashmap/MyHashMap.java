package hashmap;

public class MyHashMap<K,V> {
    private static final int INITIAL_SIZE = 1<<4;
    private static final int MAXIMUM_CAPACITY = 1<<30;
    private int size;
    Entry hashTable[];

    MyHashMap(){
        hashTable = new Entry[INITIAL_SIZE];
    }

    MyHashMap(int capacity) {
        int tableSize = tableSize(capacity);
        hashTable = new Entry[tableSize];
    }

    final int tableSize(int capacity) {
        int n=capacity-1;
        n |= n>>>1;
        n |= n>>>2;
        n |= n>>>4;
        n |= n>>>8;
        n |= n>>>16;

        return n<0?1:(n>=MAXIMUM_CAPACITY)?MAXIMUM_CAPACITY:n+1;
    }

    class Entry<K,V> {
        K key;
        V value;
        Entry next;

        Entry(K k,V v) {
            key = k;
            value = v;
            next = null;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }

    public V get(K key) {
        int hashCode = key.hashCode() % hashTable.length;
        Entry entry = hashTable[hashCode];

        while (entry!=null) {
            if (entry.key == key){
                return (V) entry.value;
            }
            entry = entry.next;
        }
        return null;
    }

    public void put(K key,V value) {
        int hashCode = key.hashCode() % hashTable.length;
        Entry entry = hashTable[hashCode];

        if (entry == null) {
            Entry newEntry = new Entry(key,value);
            hashTable[hashCode] = newEntry;
        }
        else {
            while (entry.next != null) {
                if (entry.key == key){
                    entry.value = value;
                    return;
                }
                entry = entry.next;
            }
            Entry newEntry = new Entry(key,value);
            entry.next = newEntry;
        }
        checkReSizing();
        size++;
    }

    public double loadFactor(){
        return (double) size/hashTable.length;
    }

    public void checkReSizing(){
        double loadFactory = loadFactor();
        if (loadFactory>=0.75) {
            resize();
        }
    }

    public void resize(){
        int currentSize = hashTable.length;
        int newCapacity = tableSize(currentSize+1);
        Entry[] oldTable = hashTable;
        hashTable = new Entry[newCapacity];
        System.arraycopy(oldTable,0,hashTable,0,currentSize);
        oldTable=null;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size==0;
    }

}
