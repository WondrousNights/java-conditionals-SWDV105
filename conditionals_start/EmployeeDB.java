public class EmployeeDB {

    public static Employee GetEmployee(int id) {

        switch (id) {
            case 1:
                return new Employee(
                        1,
                        "Alice",
                        "CEO",
                        true);

            case 2:
                return new Employee(
                        2,
                        "Bob",
                        "Manager",
                        true);

            case 3:
                return new Employee(
                        3,
                        "Charlie",
                        "Employee",
                        true);

            case 4:
                return new Employee(
                        4,
                        "David",
                        "Employee",
                        false);

            default:
                return new Employee(
                        0,
                        "Unknown",
                        "Guest",
                        false);
        }
    }

}