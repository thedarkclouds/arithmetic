package recursion;

public class demo {

    public static void main(String[] args) {
        Long sum=fact(20);
        System.out.println(sum);
    }

    public static  Long  fact(int n){

        if(n == 0 || n ==1){
            return  1L;
        }else {
            return  n*fact(n-1);
        }

    }

}
