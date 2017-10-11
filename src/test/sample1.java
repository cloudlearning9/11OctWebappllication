package test;

public class sample1 {
    int a=10;
    int b=20;

    public int mul(int a, int b)
    {
        int sum= a+b;
        return sum;
    }
 public static void main(String args[])
 {
     sample1 s1= new sample1();

    int s= s1.mul(10, 20);

    System.out.println("sus is " + s);
 }


}
