public class Main {
    public static void main(String[] args) throws Exception {


        DoubleLinkedList<Minion> doubleLinkedList = new DoubleLinkedList<>();
        Minion vasya = new Minion("Vasya", 212);
        Minion ken = new Minion("Ken", 8);
        Minion vitaliy = new Minion("Vitaliy",9);
        doubleLinkedList.addFirst(vasya);
        doubleLinkedList.addLast(ken);
        doubleLinkedList.addLast(vitaliy);
        doubleLinkedList.changeAgeByName("Ken",10);
        doubleLinkedList.outputAll();
        doubleLinkedList.deleteFirst();
        doubleLinkedList.outputAll();
        doubleLinkedList.deleteLast();
        doubleLinkedList.outputAll();
    }
}
