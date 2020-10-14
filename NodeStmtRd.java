import java.util.Scanner;
public class NodeStmtRd extends NodeStmt {
    private String id;
    private Scanner scan;
    public NodeStmtRd(String id) {
    this.id = id;
    }

    public double eval(Environment env)
    {
        scan = new Scanner(System.in);
        return env.put(id,scan.nextDouble()); // maybe?

    }
}
