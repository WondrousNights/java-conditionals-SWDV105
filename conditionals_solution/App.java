
public class App {

    public static void main(String[] args) {

        System.out.println("=== Employee Portal ===");

        System.out.print("Employee ID: ");

        //Recieve line from console input
        String employeeString = System.console().readLine();

        //Login... (don't worry about this)
        Employee employee = Auth.Login(employeeString);
        if (employee == null) {
            return;
        }

        // LESSON: Conditionals
        int employeeId = employee.id;
        String employeeName = employee.name;
        String employeeTitle = employee.title;
        boolean isEmployeeActive = employee.active;


        
        System.out.println("Please make a selection:");
        System.out.println("1. Recieve Pay");
        System.out.println("2. Display Info");
        int selection = Integer.parseInt(System.console().readLine());

        //Handle different selections.
        


        if(isEmployeeActive)
        {
            switch(employeeTitle)
            {
            case "CEO":
                System.out.println("Hello CEO");
            break;
            case "Manager":
                System.out.println("Hello Manager");
            break;
            case "Employee":
                System.out.println("Hello Employee");
            break;
            default:
                System.out.println("Hello Guest");
            break;
            } 
        }
        else
        {
            System.out.println("Not Active");
        }
          



    }

}
