public class Auth {

    public static Employee Login(String idString) {

        //Did we input anything?
        if (idString == null) {
            System.err.println("Invalid input");
            return null;
        }

        //remove spaces
        idString = idString.trim();

        // check if every character is a digit... I will teach loops later : )
        for (int i = 0; i < idString.length(); i++) {
            if (!Character.isDigit(idString.charAt(i))) {
                System.err.println("Invalid input: not a number");
                return null;
            }
        }

        int employeeId = Integer.parseInt(idString);

        return EmployeeDB.GetEmployee(employeeId);
    }
}
