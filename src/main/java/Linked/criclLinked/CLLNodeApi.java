package Linked.criclLinked;

public class CLLNodeApi {

    public int length(CLLNode headNode){
        int length=0;
        CLLNode currentNode=headNode;
        while (currentNode!=null){
            length++;
            currentNode=currentNode.getNext();
            if (currentNode==headNode){
                break;
            }
        }
        return  length;
    }
}
