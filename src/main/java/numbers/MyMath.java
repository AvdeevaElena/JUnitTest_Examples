package numbers;

public class MyMath {

    int add (int a, int b) {return a+b;}
    int div (int a, int b) {return a/b;}

    public static void main(String[] args) {


        int res = new MyMath().div(100,2);
        System.out.println(res);
    }
}
