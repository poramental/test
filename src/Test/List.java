package Test;


public class List <T>{
    private Node first = null;
    private int listLength = 0;
    private Node last = null;

    public List(){
        first = last = null;
        listLength = 0;
    }

    public List(T value){
       this.first = new Node(value);
       this.listLength += 1;
       this.last = this.first;
    }
    public List(T[] valueArr){

        this.listLength += valueArr.length ;
        for(int i = 0; i < valueArr.length ; i++){
            pushBack(valueArr[i]);

        }

    }

    public int length(){
        return this.listLength;
    }
    public void add(T value,int index){
        Node curr = this.first;
        for(int i = 0; i < index; i++ ){
            curr = curr.getNext();
        }
        curr = curr.getPrev();
        Node newNode = new Node(value);
        if(curr.getNext() != null){
            curr.getNext().setPrev(newNode);
        }
        newNode.setNext(curr.getNext());
        curr.setNext(newNode);
        newNode.setPrev(curr);


        this.listLength += 1;
    }
    public void pushBack(T value){
        this.listLength += 1;
        if(this.first == null){
           this.first = new Node(value);
           this.last = this.first;
        }
        else{

            Node newNode = new Node(value);
            this.last.setNext(newNode);
            newNode.setPrev(this.last);
            this.last = newNode;
        }
    }
    public void pushBack(T[] valueArr){
        //сделать пушбек массива и инит массивом
    };
    public Object get(int index) throws ListExceptions {
        Node curr = this.first;
        if(this.listLength < index){
            throw new ListExceptions("ListOutOfRange");
        }
        for(int i = 0; i < index;i++){
            curr = curr.getNext();
        }
        return curr.getValue();
    }
    public void show(){
            Node curr = this.first;

            for(int i = 0; i < this.listLength ; i++){
                System.out.println(curr.getValue());
                if (curr.getNext() == null){
                    break;
                }
                curr = curr.getNext();
            }


    }
}