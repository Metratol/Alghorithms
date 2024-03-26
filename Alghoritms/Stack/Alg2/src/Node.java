public class Node<T> {
    protected T data;
    private Node<T> previousBlock;
    private Node<T> nextBlock;
    public Node(T data) {
        this.data = data;
        this.previousBlock = null;
        this.nextBlock = null;}
    public void setPreviousBlock(Node<T> prev) {
        this.previousBlock = prev;
    }
    public void setNextBlock(Node<T> next) {
        this.nextBlock = next;
    }
    public Node<T> getNextBlock() {
        return nextBlock;
    }
    public Node<T> getPreviousBlock() {
        return previousBlock;
    }
    public T getData() {
        return data;
    }}

