package iterator;

public class ArrayIterator<T> implements Iterator<T> {
    private final T[] items;
    private int position = 0;

    public ArrayIterator(T[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.length;
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException("больше нет элементов");
        }
        return items[position++];
    }
}