package strategy;

public class Main {
    public static void main(String[] args) {
        Sorter sorter = new Sorter();
        int[] array = {5, 3, 8, 4, 2};

        sorter.setStrategy(new BubbleSortStrategy());
        sorter.sortArray(array);

        sorter.setStrategy(new QuickSortStrategy());
        sorter.sortArray(array);
    }
}