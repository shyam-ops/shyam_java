class Counter {
    private int count = 0;

    public synchronized void increment() {
        count += 5;
        System.out.print(count+" ");
    }
}

public class Practical9 {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Thread thread1 = new Thread(counter::increment);
        Thread thread2 = new Thread(counter::increment);
        Thread thread3 = new Thread(counter::increment);
        Thread thread4 = new Thread(counter::increment);
        Thread thread5 = new Thread(counter::increment);
        Thread thread6 = new Thread(counter::increment);
        Thread thread7 = new Thread(counter::increment);
        Thread thread8 = new Thread(counter::increment);
        Thread thread9 = new Thread(counter::increment);
        Thread thread10 = new Thread(counter::increment);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();
        thread8.start();
        thread9.start();
        thread10.start();
    }
}
