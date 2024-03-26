import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListPriorityQueue<E extends Comparable<E>> implements AbstractQueue<E> {
    private List<E> list;

    public ArrayListPriorityQueue() {
        this.list = new ArrayList<>();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public void add(E element) {
        list.add(element);
        swim(list.size() - 1);
    }

    @Override
    public E peek() {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public E poll() {
        if (list.isEmpty()) {
            return null;
        }
        E max = list.get(0);
        int lastIdx = list.size() - 1;
        list.set(0, list.get(lastIdx));
        list.remove(lastIdx);
        sink(0);
        return max;
    }

    private void swim(int k) {
        while (k > 0 && less(parent(k), k)) {
            swap(k, parent(k));
            k = parent(k);
        }
    }

    private void sink(int k) {
        int N = list.size();
        while (leftChild(k) < N) {
            int j = leftChild(k);
            if (j < N - 1 && less(j, j + 1)) {
                j++;
            }
            if (!less(k, j)) {
                break;
            }
            swap(k, j);
            k = j;
        }
    }

    private boolean less(int i, int j) {
        return list.get(i).compareTo(list.get(j)) < 0;
    }

    private void swap(int i, int j) {
        E temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    private int parent(int k) {
        return (k - 1) / 2;
    }

    private int leftChild(int k) {
        return 2 * k + 1;
    }

    public E getKthLargestElement(int k) {
        if (k <= 0 || k > list.size()) {
            throw new IllegalArgumentException("Invalid value of k");
        }

        int lo = 0;
        int hi = list.size() - 1;
        int targetIndex = list.size() - k;

        while (lo < hi) {
            int pivotIndex = partition(lo, hi);
            if (pivotIndex < targetIndex) {
                lo = pivotIndex + 1;
            } else if (pivotIndex > targetIndex) {
                hi = pivotIndex - 1;
            } else {
                return list.get(pivotIndex);
            }
        }

        return list.get(targetIndex);
    }
    private int partition(int lo, int hi) {
        E pivot = list.get(hi);
        int i = lo;

        for (int j = lo; j < hi; j++) {
            if (list.get(j).compareTo(pivot) <= 0) {
                swap(i, j);
                i++;
            }
        }

        swap(i, hi);
        return i;
    }


    @Override
    public String toString() {
        return list.toString();
    }
}