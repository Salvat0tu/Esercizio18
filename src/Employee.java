public class Employee {
    private String name;
    private String surname;
    private String address;

    public Employee(String NewEmployeeName, String NewEmployeeSurname, String NewEmployeeAddress) {
        this.name = NewEmployeeName;
        this.surname = NewEmployeeSurname;
        this.address = NewEmployeeAddress;
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmployeeDetails() {
        String employeeInfo = name + "\n" + surname + "\n" + address;
        return employeeInfo;


    }


}

