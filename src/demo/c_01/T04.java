/**
 * synchronized关键字
 * 对某个对象加锁
 */

package demo.c_01;

public class T04 {

    private static int count = 10;

    public synchronized static void m() { //这里等同于synchronized(demo.basic.T04.class)
        count--;
        System.out.println(Thread.currentThread().getName() + " count = " + count);
    }

    public static void mm() {
        synchronized (T04.class) { //考虑一下这里写synchronized(this)是否可以？
            count--;
        }
    }

}
