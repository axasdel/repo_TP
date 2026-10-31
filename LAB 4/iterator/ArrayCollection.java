package iterator;

public class ArrayCollection<T> implements IterableCollection<T> {
    private final T[] items;

    public ArrayCollection(T[] items) {
        this.items = items;
    }

    @Override
    public Iterator<T> createIterator() {
        return new ArrayIterator<>(items);
    }
}