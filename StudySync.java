
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

class Task implements Serializable {
    String subject;
    String name;
    String deadline;
    String priority;
    boolean done;

    Task(String subject, String name, String deadline, String priority) {
        this.subject = subject;
        this.name = name;
        this.deadline = deadline;
        this.priority = priority;
        this.done = false;
    }
}

public class StudySync {

    static Scanner input = new Scanner(System.in);
    static ArrayList<Task> taskList = new ArrayList<>();

    public static void main(String[] args) {

        loadData();

        int choice;

        do {
            System.out.println("\n===== STUDYSYNC =====");
            System.out.println("1. Add Task");
            System.out.println("2. Show Tasks");
            System.out.println("3. Complete Task");
            System.out.println("4. Delete Task");
            System.out.println("5. Show Progress");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");

            try {
                choice = Integer.parseInt(input.nextLine());
            } catch (Exception e) {
                System.out.println("Please enter a number.");
                choice = 0;
            }

            switch (choice) {

                case 1:
                    addTask();
                    break;

                case 2:
                    showTasks();
                    break;

                case 3:
                    completeTask();
                    break;

                case 4:
                    deleteTask();
                    break;

                case 5:
                    showProgress();
                    break;

                case 6:
                    saveData();
                    System.out.println("Thank you for using StudySync!");
                    break;

                default:
                    if (choice != 0) {
                        System.out.println("Invalid choice.");
                    }
            }

        } while (choice != 6);
    }

    static void addTask() {

        System.out.println("\n--- Add Task ---");

        System.out.print("Subject: ");
        String subject = input.nextLine();

        System.out.print("Task name: ");
        String name = input.nextLine();

        System.out.print("Deadline: ");
        String deadline = input.nextLine();

        System.out.print("Priority (High/Medium/Low): ");
        String priority = input.nextLine();

        Task task = new Task(subject, name, deadline, priority);

        taskList.add(task);

        saveData();

        System.out.println("Task added successfully.");
    }

    static void showTasks() {

        System.out.println("\n--- Your Tasks ---");

        if (taskList.size() == 0) {
            System.out.println("No tasks added yet.");
            return;
        }

        for (int i = 0; i < taskList.size(); i++) {

            Task t = taskList.get(i);

            System.out.println("\nTask " + (i + 1));
            System.out.println("Subject: " + t.subject);
            System.out.println("Name: " + t.name);
            System.out.println("Deadline: " + t.deadline);
            System.out.println("Priority: " + t.priority);
            System.out.println("Status: " + (t.done ? "Completed" : "Pending"));
        }
    }

    static void completeTask() {

        showTasks();

        if (taskList.size() == 0) {
            return;
        }

        System.out.print("\nEnter task number to complete: ");

        try {

            int number = Integer.parseInt(input.nextLine());

            if (number >= 1 && number <= taskList.size()) {

                taskList.get(number - 1).done = true;

                saveData();

                System.out.println("Task completed!");

            } else {
                System.out.println("Wrong task number.");
            }

        } catch (Exception e) {
            System.out.println("Please enter a valid number.");
        }
    }

    static void deleteTask() {

        showTasks();

        if (taskList.size() == 0) {
            return;
        }

        System.out.print("\nEnter task number to delete: ");

        try {

            int number = Integer.parseInt(input.nextLine());

            if (number >= 1 && number <= taskList.size()) {

                taskList.remove(number - 1);

                saveData();

                System.out.println("Task deleted.");

            } else {
                System.out.println("Wrong task number.");
            }

        } catch (Exception e) {
            System.out.println("Please enter a valid number.");
        }
    }

    static void showProgress() {

        int total = taskList.size();
        int completed = 0;

        for (Task t : taskList) {

            if (t.done) {
                completed++;
            }
        }

        System.out.println("\n--- Study Progress ---");
        System.out.println("Total tasks: " + total);
        System.out.println("Completed: " + completed);
        System.out.println("Pending: " + (total - completed));

        if (total > 0) {

            double progress = ((double) completed / total) * 100;

            System.out.println("Progress: " + progress + "%");

        } else {
            System.out.println("Progress: 0%");
        }
    }

    static void saveData() {

        try {

            FileOutputStream file = new FileOutputStream("tasks.dat");
            ObjectOutputStream output = new ObjectOutputStream(file);

            output.writeObject(taskList);

            output.close();
            file.close();

        } catch (Exception e) {
            System.out.println("Could not save data.");
        }
    }

    static void loadData() {

        try {

            FileInputStream file = new FileInputStream("tasks.dat");
            ObjectInputStream inputFile = new ObjectInputStream(file);

            taskList = (ArrayList<Task>) inputFile.readObject();

            inputFile.close();
            file.close();

        } catch (Exception e) {
            taskList = new ArrayList<>();
        }
    }
}
