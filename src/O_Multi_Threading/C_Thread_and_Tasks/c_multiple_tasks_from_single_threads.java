package O_Multi_Threading.C_Thread_and_Tasks;
// it is not possible
class c_multiple_tasks_from_single_threads extends Thread {
    @Override
    public void run() {
        task1();
        task2();
        task3();
    }

    // Task 1: Print numbers from 1 to 3
    void task1() {
        System.out.println("Task 1: Printing numbers 1 to 3");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Task 1 - Number: " + i);
        }
    }

    // Task 2: Print characters from A to C
    void task2() {
        System.out.println("Task 2: Printing letters A to C");
        for (char c = 'A'; c <= 'C'; c++) {
            System.out.println("Task 2 - Letter: " + c);
        }
    }

    // Task 3: Display a simple message
    void task3() {
        System.out.println("Task 3: Showing a message");
        System.out.println("Task 3 - Hello from the single thread!");
    }


    public static void main(String [] args){
        Task1 t1 = new Task1();
        Task2 t2 = new Task2();
        Task3 t3 = new Task3();

        t1.start();
        t2.start();
        t3.start();
    }
}
