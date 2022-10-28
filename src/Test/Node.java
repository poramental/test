package Test;


public class Node <T>{
    private Node prev = null;
    private Node next = null;
    T value;

    public Node(T value){

        this.value = value;
    }
    public void setPrev(Node prev){
        this.prev = prev;
    }
    public Node getPrev(){
        return prev;
    }
    public void setNext(Node next){
        this.next = next;
    }
    public Node getNext(){
        return this.next;
    }
    public T getValue(){
        return this.value;
    }

}