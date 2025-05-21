public class ThreadsExample {
    public static void main(String[] args) {

        Thread thread1=new Thread(new Runner1());
        Thread thread2 = new Thread(new Runner2());

        thread1.start();
        thread2.start();
    }
}
