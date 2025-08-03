package O_Multi_Threading.C_Thread_and_Tasks;

class Task1 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Task 1 - Count: " + i);
        }
    }
}

class Task2 extends Thread {
    public void run() {
        for (char c = 'A'; c <= 'E'; c++) {
            System.out.println("Task 2 - Letter: " + c);
        }
    }
}

class Task3 extends Thread {
    public void run() {
        System.out.println("Task 3 - Starting");
        System.out.println("Task 3 - Finished");
    }
}

public class d_multiple_tasks_from_multiple_threads {
    public static void main(String [] args){
        Task1 t1 = new Task1();
        Task2 t2 = new Task2();
        Task3 t3 = new Task3();

        t1.start();
        t2.start();
        t3.start();
    }
}
