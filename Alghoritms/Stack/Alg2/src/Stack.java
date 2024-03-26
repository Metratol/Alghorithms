import java.util.Iterator;
import java.util.NoSuchElementException;

public class Stack<T> implements Iterable<T> {
    private T[] arrayForStack;
    private int top;

    public Stack(int size) {
        arrayForStack = (T[]) new Object[size];
        top = -1;
    }

    public void push(T data) {
        if (isFull()) {
            System.out.println("Стэк полон");
            return;
        }
        arrayForStack[++top] = data;
    }
    public void extend(Stack stack, int size){
        T[] newArray;
        int len = top;
        top = 0;
        newArray = (T[]) new Object[size];
        for (int i = 0; i < len; i++) {
            Object new_item = (T) stack.pop();
            if (new_item != null)
                newArray[i] = (T) new_item;
        }
        arrayForStack = newArray;



    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("Стэк пуст");
            return null;
        }
        return arrayForStack[top++];
    }

    public T peek() {
        if (isEmpty()) {
            System.out.println("Стэк пуст");
            return null;
        }
        return arrayForStack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == arrayForStack.length - 1;
    }



    public void show() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }
        else{
        System.out.println("Stack elements:");
        for (int i = top; i >= 0; i--) {
            if( arrayForStack[i] != null){
            System.out.println(arrayForStack[i]);
        }}}
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int index = top;

            @Override
            public boolean hasNext() {
                return index >= 0;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                return (T) arrayForStack[index--];
            }
        };
    }}
