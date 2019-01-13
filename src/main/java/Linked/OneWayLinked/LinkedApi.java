package Linked.OneWayLinked;

public class LinkedApi {

    /*
     * 链表长度
     * O(n)
     * */
    public  static int ListLength(ListNode headNode) {
        int length = 0;
        ListNode currentNode = headNode;
        while (currentNode != null) {
            length++;
            currentNode = currentNode.getNext();
        }
        return length;
    }

    /*
    * 链表的插入  3种情况
    * O(n)
    * */
    public ListNode insertLinkedList(ListNode headNode, ListNode nodeInsert, int position) {
        if (headNode == null) { //若链表为空，插入
            return nodeInsert;
        }
        int size = ListLength(headNode);
        if (position > size + 1 || position < 1) { //跳跃插入 违反手拉手规则
            System.out.println("Position of node to insert invail The vaild inputs are 1 to" + (size + 1));
            return headNode;
        }
        if (position == 1) {  //在链表开头插入
            nodeInsert.setNext(headNode);
            return nodeInsert;
        } else {
            ListNode previousNode = headNode;  //在链表中间或末尾插入
            int count = 1;
            //  3  4       position=5
            while (count < position - 1) {
                previousNode = previousNode.getNext();//4
                count++;
            }
            ListNode currentNode = previousNode.getNext();//5
            nodeInsert.setNext(currentNode);
            previousNode.setNext(nodeInsert);
        }
        return headNode;
    }

   /*
   * 链表删除节点 按索引位置
   * time O(n)
   *space  O(1)
   *
   * */
    public ListNode DeleteFromList(ListNode headNode,int position){
        int size=ListLength(headNode);
        if (position>size||position<1){
            System.out.println("Position of node is invalid. The vaild inouts are 1 to size"+size);
            return  headNode;
        }
        if (position==1){
            ListNode currrentNode=headNode.getNext();
            headNode=null;
            return  currrentNode;
        }else{
            ListNode previousNode=headNode;
            int count=1;
            while(count<position){
                previousNode=previousNode.getNext();
                count++;
            }
            ListNode currentNode=previousNode.getNext();
            previousNode.setNext(currentNode.getNext());
            currentNode=null;
        }
        return  headNode;
    }

    /*
    * 删除链表
    * time 0(n)
    * space  O(1)
    *
    * */
   public void DeleteLinkedList(ListNode head){
        ListNode auxilaryNode,iterator =head;
        while(iterator !=null){
            auxilaryNode=iterator.getNext();
            iterator=null;             //在java中 gucc会自动处理
            iterator=auxilaryNode;    //实际应用不需要实现此功能
        }

   }


}
