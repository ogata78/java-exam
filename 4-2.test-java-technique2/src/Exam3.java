import java.util.ArrayList;

public class Exam3 {

    public static void main(String[] args) {

        
        ArrayList<Employee> employeeList = new ArrayList<>();


        employeeList.add(new Employee("後藤", 31));
        employeeList.add(new Employee("山田", 28));
        employeeList.add(new Employee("佐藤", 25));
        employeeList.add(new Employee("田中", 19));

    
        for (Employee emp : employeeList) {
            System.out.println(emp.getName() + "(" + emp.getAge() + "歳)");
        }
    }
}

        
