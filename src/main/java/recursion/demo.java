package recursion;

public class demo {

    public static void main(String[] args) {
        Long sum=fact(20);
        System.out.println(sum);
    }




    /*
    *
    * 阶乘
    * */
    public static  Long  fact(int n){
        /*调用：
        Long sum=fact(20);
        System.out.println(sum);
        */
        if(n == 0 || n ==1){
            return  1L;
        }else {
            return  n*fact(n-1);
        }
    }
    /*
    * 给定一个数组，请用递归的方法判定数组中的元素是否是有序
    * 时间复杂度O(n),空间复杂度O(n)
    * */
    public int isArraySortedOrder(int[]A,int index){
        if (A.length==1){
            return 1;
        }
        return (A[index-1]<=A[index-2])?0:isArraySortedOrder(A,index-1);
    }



}
