public class DoubleLinkedList<T> {

    private Node<T> head;
    private Node<T> tail;

    public DoubleLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void addFirst(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.setNext(head);
            head.setPrev(newNode);
            head = newNode;
        }
    }
    public void addLast(T data) {
        Node<T> newNode = new Node<>(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            newNode.setPrev(tail);
            tail = newNode;
        }
    }

    public void outputAll() {
        if (head == null) {
            System.out.println("Double linked list is empty.");
            return;
        }

        Node<T> current = head;
        System.out.print("Double linked list: ");

        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }

        System.out.println();
    }
    public void deleteByName(String name) {
        Node<T> currentNode = head;

        while (currentNode != null) {
            if (currentNode.getData() instanceof Minion) {
                Minion minion = (Minion) currentNode.getData();
                if (minion.getName().equals(name)) {
                    if (currentNode == head && currentNode == tail) {
                        head = null;
                        tail = null;
                    } else if (currentNode == head) {
                        head = currentNode.getNext();
                        head.setPrev(null);
                    } else if (currentNode == tail) {
                        tail = currentNode.getPrev();
                        tail.setNext(null);
                    } else {
                        currentNode.getPrev().setNext(currentNode.getNext());
                        currentNode.getNext().setPrev(currentNode.getPrev());
                    }
                    break;
                }
            }
            currentNode = currentNode.getNext();
        }
    }
    public void changeAgeByName(String name,int age) {
        Node<T> currentNode = head;

        while (currentNode != null) {
            if (currentNode.getData() instanceof Minion) {
                Minion minion = (Minion) currentNode.getData();
                if (minion.getName().equals(name)) {
                    if (currentNode == head && currentNode == tail) {
                        minion.setAge(age);
                    } else if (currentNode == head) {
                        minion.setAge(age);
                    } else if (currentNode == tail) {
                        minion.setAge(age);
                    } else {
                        minion.setAge(age);
                    }
                    break;
                }
            }
            currentNode = currentNode.getNext();
        }
    }
    public void deleteFirst() {
        Node<T> currentNode = head;

        while (currentNode != null) {
            if (currentNode.getData() instanceof Minion) {
                Minion minion = (Minion) currentNode.getData();
                    if (currentNode == head && currentNode == tail) {
                        head = null;
                        tail = null;
                    } else if (currentNode == head) {
                        head = currentNode.getNext();
                        head.setPrev(null);
                    break;
                }
            }
            currentNode = currentNode.getNext();
        }
    }
    public void deleteLast() {
        Node<T> currentNode = tail;

        while (currentNode != null) {
            if (currentNode.getData() instanceof Minion) {
                Minion minion = (Minion) currentNode.getData();
                    if (currentNode == head && currentNode == tail) {
                        head = null;
                        tail = null;
                    } else if (currentNode == tail) {
                        tail = tail.getPrev();
                        tail.setNext(null);
                    }
                    break;

            }
            currentNode = currentNode.getNext();
        }
    }



    public void clear() {
        head = null;
        tail = null;
    }
}