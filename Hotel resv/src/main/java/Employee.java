public class Employee {
    long employeeID;
    String name;
    String department;
    double punchedIn;
    double punchedOut;
    double punchTimeCard;
    double getHoursWorked;
    double getOverTime;













    public Employee(long employeeID, String name, String department, double punchedIn, double punchedOut, double punchTimeCard, double getHoursWorked, double getOverTime) {
        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
        this.punchedIn = punchedIn;
        this.punchedOut = punchedOut;
        this.punchTimeCard = punchTimeCard;
        this.getHoursWorked = getHoursWorked;
        this.getOverTime = getOverTime;
    }


















    public long getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(long employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPunchedIn(double time) {
        return punchedIn;
    }

    public void setPunchedIn(double punchedIn) {
        this.punchedIn = punchedIn;
    }

    public double getPunchedOut() {
        return punchedOut;
    }

    public void setPunchedOut(double punchedOut) {
        this.punchedOut = punchedOut;
    }

    public double getPunchTimeCard() {
        return punchTimeCard;
    }

    public void setPunchTimeCard(double punchTimeCard) {
        this.punchTimeCard = punchTimeCard;
    }

    public double getGetHoursWorked() {









        return punchedOut - punchedIn;



    }

    public void setGetHoursWorked(double getHoursWorked) {

        getHoursWorked = punchedOut - punchedIn;



        this.getHoursWorked = getHoursWorked;
    }

    public double getGetOverTime(double totalHoursWorked, double regularHours) {
        return totalHoursWorked - regularHours;


    }

    public void setGetOverTime(double getOverTime) {
        this.getOverTime = getOverTime;
    }


}


