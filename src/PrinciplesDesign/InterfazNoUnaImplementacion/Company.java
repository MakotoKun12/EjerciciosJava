package PrinciplesDesign.InterfazNoUnaImplementacion;

public class Company {
    private Employee employee;

    public Company(Employee employee){
        this.employee = employee;
    }

    public void manageEmployee(){
        employee.work();
    }
}
