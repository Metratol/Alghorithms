public interface AbstractHeap<E extends Comparable<E>> {

    int size();
    void add(E element);
    E peek();

}