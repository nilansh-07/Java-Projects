import java.util.ArrayList;
import java.util.Scanner;

class Task {
    private String name;
    private boolean completed;

    // Constructor to initialize a task with a name and mark it as not completed
    public Task(String name) {
        this.name = name;
        this.completed = false;
    }
    
    // Getter methods
    public String getName() {
        return name;
    }

    // Method to mark a task as completed
    public void markAsCompleted() {
        completed = true;
    }

    // toString method to represent the task as a string
    public String toString() {
        return (completed ? "" : "") + name;
    }
}

public class ToDoListApp {
    private static ArrayList<Task> tasks = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            displayMenu();
            int choice = sc.nextInt();
            sc.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    addTask();
                    break;

                case 2:
                    markTaskAsCompleted();
                    break;

                case 3:
                    listTasks();
                    break;

                case 4:
                    removeTask();
                    break;

                case 5:
                    System.out.println("Goodbye!");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("___To-Do List Application___");
        System.out.println("1. Add Task");
        System.out.println("2. Mark Task as Completed");
        System.out.println("3. List Tasks");
        System.out.println("4. Remove Task");
        System.out.println("5. Exit");
        System.out.print("Enter your Choice:");
    }

    private static void addTask() {
        System.out.print("Enter the task name: ");
        String taskName = sc.nextLine();
        Task task = new Task(taskName);
        tasks.add(task);
        System.out.println("Task added:" + taskName);
    }

    private static void markTaskAsCompleted() {
        listTasks();
        System.out.println("Enter the index of the task to mark as completed: ");
        int indx = sc.nextInt();
        if (indx >= 0 && indx < tasks.size()) {
            Task task = tasks.get(indx);
            task.markAsCompleted();
            System.out.println("Task marked as completed: " + task.getName());
        } else {
            System.out.println("Invalid index. Please try again");
        }
    }

    private static void listTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks to display.");
        } else {
            System.out.println("Tasks");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println(i + ". " + tasks.get(i));
            }
        }
    }

    private static void removeTask() {
        listTasks();
        System.out.println("Enter the index of task to remove:");
        int indx = sc.nextInt();
        if (indx >= 0 && indx < tasks.size()) {
            Task removedTask = tasks.remove(indx);
            System.out.println("Task removed: " + removedTask.getName());
        } else {
            System.out.println("Invalid index. Please try again.");
        }
    }
}