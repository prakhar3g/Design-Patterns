package hashmap;

public class Main {
    public static void main(String[] args) {
        MyHashMap<Integer,String> map = new MyHashMap<>(17);
        map.put(1, "hi");
        map.put(2, "my");
        map.put(3, "name");
        map.put(4, "is");
        map.put(5, "Shrayansh");
        map.put(6, "how");
        map.put(7, "are");
        map.put(8, "you");
        map.put(9, "friends");
        map.put(10, "?");
        String value = map.get(9);
        System.out.println(value);
        System.out.println("SIZE:" + map.size());
        System.out.println("IS_EMPTY:" + map.isEmpty());
        map.resize();

    }
}
