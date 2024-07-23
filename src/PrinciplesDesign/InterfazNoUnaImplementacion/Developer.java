package PrinciplesDesign.InterfazNoUnaImplementacion;

public class Developer implements Employee {

    @Override
    public void work() {
        System.out.println("Developing Software...");
    }
}
