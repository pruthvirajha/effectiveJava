package singleton;

/*
Create a static factory method to return an instance

Advantages are
You can change the underlying api implementation anytime you want without worrying about contract change
Can be used as method reference, Elvis::instance in supplier
*/

public class Employee {
    private static final Employee employee = new Employee();

    public static final Employee getInstance() {
        return employee;
    }
}
