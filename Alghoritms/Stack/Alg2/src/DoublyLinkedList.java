import java.util.Iterator;

public class DoublyLinkedList<T> implements Iterable<T> {
    private Integer size = 0;
    private Node<T> head;
    private Node<T> tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void printSize() {
        System.out.println("Размер двусвязного списка: " + size);
    }

    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    public void addFirst(T data) {
        Node<T> node = new Node<>(data);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            node.setNextBlock(head);
            head.setPreviousBlock(node);
            head = node;
        }
        size++;
    }

    public void addLast(T data) {
        Node<T> node = new Node<>(data);
        if (head == null) {
            head = node;
        } else {
            tail.setNextBlock(node);
            node.setPreviousBlock(tail);
        }
        tail = node;
        size++;
    }


    public void removeByName(String name) {
        int count = 1;
        Node<T> node = head;
        while (node != null) {
            count++;
            if (node.getData() instanceof Minion minion) {
                if (minion.getName().equals(name)) {
                    if (node == head && node == tail) {
                        head = null;
                        tail = null;
                    } else if (node == head) {
                        head = node.getNextBlock();
                        head.setPreviousBlock(null);
                    } else if (node == tail) {
                        tail = node.getPreviousBlock();
                        tail.setNextBlock(null);
                    } else {
                        node.getPreviousBlock().setNextBlock(node.getNextBlock());
                        node.getNextBlock().setPreviousBlock(node.getPreviousBlock());
                    }


                    break;
                }
            }
            if (count == size) {
                System.out.println("Миньона с именем " + name + " не существует ");
                break;
            }
            node = node.getNextBlock();

        }


    }

    public void changeAgeByName(String name, Integer age) {
        int count = 1;
        Node<T> node = head;
        while (node != null) {
            count++;
            Minion minion = (Minion) node.getData();
            if (minion.getName().equals(name)) {
                minion.setAge(age);
                break;
            } else if (count == size) {
                System.out.println("Миньона с именем " + name + " не существует ");
            }
            node = node.getNextBlock();
        }
    }

    public void removeFirst() {
        if (tail == null) {
            System.out.println("Двусвязный список пуст");
        } else {
            if (head == tail) {
                head = null;
                tail = null;

            } else {
                head = head.getNextBlock();
                head.setNextBlock(null);
            }
            size--;
        }
    }

    public void removeLast() {
        if (tail == null) {
            System.out.println("Двусвязный список пуст");
        } else {
            if (head == tail) {
                head = null;
                tail = null;

            } else {
                tail = tail.getPreviousBlock();
                tail.setNextBlock(null);
            }
            size--;
        }

    }

    public void show() {
        if (head == null) {
            System.out.println("Двусвязный список пуст");
            return;
        }
        Node<T> node = head;
        while (node != null) {
            System.out.print(node.getData() + ";");
            node = node.getNextBlock();
        }
        System.out.println();
    }


    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Node<T> currentNode = head;

            @Override
            public boolean hasNext() {
                return currentNode != null;
            }

            @Override
            public T next() {
                T data = currentNode.getData();
                currentNode = currentNode.getNextBlock();
                return data;
            }
        };
    }

    public T getByIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNextBlock();
        }

        return current.getData();
    }
}