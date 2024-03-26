import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList<Minion> it = new DoublyLinkedList<>();
        Minion minion1 = new Minion("sd", 1,2);
        Minion minion2 = new Minion("sd", 2,2);
        Minion minion3 = new Minion("sd", 3,2);
        Minion minion4 = new Minion("sd", 4,2);
        Minion minion5 = new Minion("sd", 5,2);
        Minion minion6 = new Minion("sd", 6,2);
        Minion minion7 = new Minion("sd", 7,2);
        AgeComp comp = new AgeComp();
        ArrayList<Minion> check = new ArrayList<>();
        check.add(minion1);
        check.add(minion7);
        check.add(minion3);
        check.sort(comp);

        System.out.println(check.get(2));



        it.addFirst(minion7);
        it.addLast(minion1);
        for (Object i:it
             ) {
            System.out.println(i);

        }


        Stack<Minion> stack = new Stack<>(5);
        stack.push(minion1);
        stack.push(minion2);
        stack.push(minion3);
        stack.push(minion4);
        stack.push(minion5);
        stack.extend(stack,8);
        stack.push(minion6);
        stack.push(minion7);
        stack.show();
        int count = 0;
        for (Minion minion : stack) {
            count++;
        }
//summ age eyes - to +

}
}

