package SOLID.D_PrinciprioInversionDependencias;

public class BudgetReport {
    private Database db;

    public BudgetReport(Database db){
        this.db = db;
    }

    public void open(String date){
        System.out.println("Opening budget report for date: " + date);
    }

    public void save(String data){
        System.out.println("Saving budget report data");
        db.insert(data);
    }
}
