package classProblemByAmolMateSir.Day14PracticeProblem.LinkedList;

public class Node <D>{
    D data;
    Node<D> nextNode;

    public D getData() {
        return data;
    }

    public void setData(D data) {
        this.data = data;
    }

    public Node<D> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<D> nextNode) {
        this.nextNode = nextNode;
    }

    public Node(D data) {
        this.data = data;
    }
}
