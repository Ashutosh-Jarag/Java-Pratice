// Base class Employee
class Employee {
 private String name;
 private int id;
 // Constructor
 public Employee(String name, int id) {
 this.name = name;
 this.id = id;
 }
 // Method to display employee information
 public void displayInfo() {
 System.out.println("Name: " + name);
 System.out.println("ID: " + id);
 }
}
// Manager class inheriting from Employee (single inheritance)
class Manager extends Employee {
 private String department;
 // Constructor
 public Manager(String name, int id, String department) {
 super(name, id); // Calling superclass constructor
 this.department = department;
 }
 // Method to display manager information
 public void displayManagerInfo() {
 System.out.println("Department: " + department);
 }
}
// Worker class at the same level of hierarchy as Manager (hierarchical inheritance)
class Worker extends Employee {
 private String role;
 // Constructor
 public Worker(String name, int id, String role) {
 super(name, id); // Calling superclass constructor
 this.role = role;
 }
 // Method to display worker information
 public void displayWorkerInfo() {
 System.out.println("Role: " + role);
 }
}
public class EmployeeExample {
 public static void main(String[] args) {
 // Creating instances of Manager and Worker
 Manager manager = new Manager("John", 101, "Sales");
 Worker worker = new Worker("Alice", 201, "Developer");
 // Displaying information about Manager
 System.out.println("Manager information:");
 manager.displayInfo();
 manager.displayManagerInfo();
 // Displaying information about Worker
 System.out.println("\nWorker information:");
 worker.displayInfo();
 worker.displayWorkerInfo();
 }
}