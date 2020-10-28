import java.util.Scanner;
public class NodeStmtRd extends NodeStmt {
    private String id;
    private static Scanner scan = new Scanner(System.in);;
    public NodeStmtRd(String id) {
        this.id = id;
    }

    public double eval(Environment env) {
        
        return env.put(id, scan.nextDouble()); 

    }
}