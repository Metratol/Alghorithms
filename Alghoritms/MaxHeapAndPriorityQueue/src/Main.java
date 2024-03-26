public class Main {
    public static void main(String[] args) {
        testBinarySearchTreePriorityQueue();
        System.out.println("\n");
        testLinkedListMaxHeap();
        System.out.println("\n");
        testArrayListPriorityQueue();
    }

    public static void testBinarySearchTreePriorityQueue() {
        BinarySearchTreePriorityQueue<Integer> binarySearchTreePriorityQueue = new BinarySearchTreePriorityQueue<>();

        binarySearchTreePriorityQueue.add(5);
        binarySearchTreePriorityQueue.add(9);
        binarySearchTreePriorityQueue.add(3);
        binarySearchTreePriorityQueue.add(1);
        binarySearchTreePriorityQueue.add(7);
        binarySearchTreePriorityQueue.add(-10);
        binarySearchTreePriorityQueue.add(-1);

        System.out.println("Размер очереди: " + binarySearchTreePriorityQueue.size());

        System.out.println("Наивысший приоритет: " + binarySearchTreePriorityQueue.peek());

        while (binarySearchTreePriorityQueue.size() > 0) {
            System.out.println("Удаление элемента с наивысшим приоритетом: " + binarySearchTreePriorityQueue.poll());
            System.out.println("Размер очереди: " + binarySearchTreePriorityQueue.size());
        }
    }


    private static void testLinkedListMaxHeap() {
        LinkedListMaxHeap<Integer> linkedListMaxHeap = new LinkedListMaxHeap<>();

        linkedListMaxHeap.add(5);
        linkedListMaxHeap.add(9);
        linkedListMaxHeap.add(3);
        linkedListMaxHeap.add(1);
        linkedListMaxHeap.add(7);
        linkedListMaxHeap.add(-10);
        linkedListMaxHeap.add(-1);

        System.out.println("Размер кучи: " + linkedListMaxHeap.size());

        System.out.println("максимальный элемент : " + linkedListMaxHeap.peek());

        linkedListMaxHeap.add(30);

        System.out.println("Размер кучи: " + linkedListMaxHeap.size());

        System.out.println("максимальный элемент : " + linkedListMaxHeap.peek());
    }

    public static void testArrayListPriorityQueue() {
        ArrayListPriorityQueue<Integer> arrayListPriorityQueue = new ArrayListPriorityQueue<>();

        arrayListPriorityQueue.add(5);
        arrayListPriorityQueue.add(9);
        arrayListPriorityQueue.add(3);
        arrayListPriorityQueue.add(1);
        arrayListPriorityQueue.add(7);
        arrayListPriorityQueue.add(-10);
        arrayListPriorityQueue.add(-1);

        System.out.println("Размер очереди: " + arrayListPriorityQueue.size());

        System.out.println("Наивысший приоритет: " + arrayListPriorityQueue.peek());

        System.out.println(arrayListPriorityQueue.getKthLargestElement(6));

        System.out.println("Наивысший приоритет: " + arrayListPriorityQueue.peek());


        while (arrayListPriorityQueue.size() > 0) {
            System.out.println("Удаление элемента с наивысшим приоритетом: " + arrayListPriorityQueue.poll());
            System.out.println("Размер очереди: " + arrayListPriorityQueue.size());
        }
    }
}