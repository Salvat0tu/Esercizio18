import java.util.UUID;

public class Badge {
    private static int totalNumberOfEmployees;

    private String badgeIdCode;
    public Employee employee;

    public static void keepTrackOfEmployeesNumber() {
        totalNumberOfEmployees++;
    }

    private String generateBadgeIdCode() {
        /*String randomString = UUID.randomUUID().toString().replace("-","").substring(0,3).toUpperCase();*/
        String rndm1 = UUID.randomUUID().toString().replace("-", "").substring(0, 3).toUpperCase();
        String rndm2 = UUID.randomUUID().toString().replace("-", "").substring(0, 3).toUpperCase();
        return rndm1 + employee.getName() + " " + employee.getSurname() + rndm2;
    }

    public void showBadgeDetails() {
        String empleyeeDetails = "The total number of employees is %d \n" +
                "Employee details: %s\n" +
                "Badge ID code: %s\n";
        System.out.println(String.format(empleyeeDetails, totalNumberOfEmployees, employee.getEmployeeDetails(), badgeIdCode));


    }

    public Badge(Employee employeeThatNeedsBadge) {
        keepTrackOfEmployeesNumber();
        this.employee = employeeThatNeedsBadge;
        this.badgeIdCode = generateBadgeIdCode();
    }


}
