public class Main {
    public static void main(String[] args) {
        Operations o1=new Operations("First");
        Thread t1=new Thread(o1);
        Operations o2=new Operations("Second");
        Thread t2=new Thread(o2);

        t1.start();
        t2.start();
    }
}