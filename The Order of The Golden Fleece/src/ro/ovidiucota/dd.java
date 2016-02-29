package ro.ovidiucota;

/**
 * User:    ovidiu
 * Package: The Order of The Golden Fleece
 * Date:    2/26/16
 * Time:    10:52 AM
 */
class MyThread extends Thread
{
    public static void main(String [] args)
    {
        MyThread t = new MyThread();
        t.start();
        System.out.print("one. ");
        t.start();
        System.out.print("two. ");
    }
    public void run()
    {
        System.out.print("Thread ");
    }
}