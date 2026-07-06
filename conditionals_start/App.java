public class App {

    public static void main(String[] args) {

        System.out.println("=== Employee Portal ===");

        System.out.print("Employee ID: ");

        // Recieve line from console input
        String employeeString = System.console().readLine();

        // Login... (don't worry about this)
        Employee employee = Auth.Login(employeeString);
        if  (employee == null) {
            return;
        }

        // ESSON: Conditionals
        int employeeId = employee.id; // ID of employee
        String employeeName = employee.name; //Name of employee
        String employeeTitle = employee.title; //CEO, Manager, Employee, Guest
        boolean isEmployeeActive = employee.active; // Is employee active?

        System.out.println("Congrats CEO! Your  pay is $1,000,000.");
 

    }
}
    