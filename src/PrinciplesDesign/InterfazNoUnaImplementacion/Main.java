package PrinciplesDesign.InterfazNoUnaImplementacion;

public class Main {
    public static void main(String[] args) {
        Company company = new Company(new Developer());
        company.manageEmployee(); // Output: Developing Software...

        company = new Company(new Tester());
        company.manageEmployee(); // Output: Testing Software...
    }
}
