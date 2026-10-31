package iterator;

public class iterator_pattern {
    public static void main(String[] args) {
        ArrayCollection<String> collection = new ArrayCollection<>(new String[]{"а", "б", "в"});

        Iterator<String> it = collection.createIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}