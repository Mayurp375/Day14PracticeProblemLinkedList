package classProblemByAmolMateSir.Day14PracticeProblem.LinkedList;

public class MyLinkedList<D> {
    Node<D> head;
    Node<D> tail;
    Node<D> curruntNode;

    void add(Node<D> data) {
        if (head == null) {
            System.out.println("we have not any value");
            head = data;
        }
    }

}
