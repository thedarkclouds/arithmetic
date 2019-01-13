package Linked.DoubleWayLinked;

import Linked.OneWayLinked.LinkedApi;
import Linked.OneWayLinked.ListNode;

public class DLLNodeApi {

    public static int ListLength(DLLNode headNode) {
        int length = 0;
        DLLNode currentNode = headNode;
        while (currentNode != null) {
            length++;
            currentNode = currentNode.getNext();
        }
        return length;
    }

    /*
     * time O(n)
     *
     *space O(1)
     * */
    public DLLNode insert(DLLNode headNode, DLLNode nodeToInsert, int position) {
        if (headNode == null) {

            return nodeToInsert;
        }
        int size = ListLength(headNode);
        if (position > size + 1 || position < 1) {
            System.out.println("Position of node to insert invail The vaild inputs are 1 to" + (size + 1));
            return headNode;
        }
        if (position == 1) {
            nodeToInsert.setNext(headNode);
            headNode.setPrevious(nodeToInsert);
            return nodeToInsert;
        } else {
            DLLNode previousNode = headNode;
            int count = 1;
            //确定插入的位置
            while (count < position - 1) {
                previousNode = previousNode.getNext();
                count++;
            }
            DLLNode currentNode = previousNode.getNext();
            nodeToInsert.setNext(currentNode);
            if (currentNode != null) {
                currentNode.setPrevious(nodeToInsert);
                previousNode.setNext(nodeToInsert);
                nodeToInsert.setPrevious(previousNode);
            }
        }
        return headNode;
    }


    public DLLNode delete(DLLNode headNode, int position) {
        int size = ListLength(headNode);
        //如果删除位置不在链表长度范围内，报错并返回
        if (position > size || position < 1) {
            System.out.println("Beyond the length");
        }

        if (position == 1) {
            DLLNode currentNode = headNode.getNext();
            headNode = null;
            currentNode.setPrevious(null);
            return currentNode;
        } else {
            DLLNode previousNode = headNode;
            int count = 1;
            while (count < position - 1) {
                previousNode = previousNode.getNext();
                count++;
            }
            DLLNode currentNode = previousNode.getNext();
            DLLNode laterNode = currentNode.getNext();
            previousNode.setNext(laterNode);
            if (laterNode != null) {
                laterNode.setPrevious(previousNode);
                currentNode = null;
            }
        }
        return headNode;
    }

}
