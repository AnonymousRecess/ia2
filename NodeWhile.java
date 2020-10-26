public class NodeWhile extends NodeStmt {
    private NodeBoolExpr bool;
    private NodeStmt stmt;

    public NodeWhile(NodeBoolExpr bool, NodeStmt stmt) {
        this.bool = bool;
        this.stmt = stmt;
    }

    public double eval(Environment env) throws EvalException {
        double evaluation = 0;
        while (bool.eval(env) == 1) {
            evaluation += stmt.eval(env);
        }
        return evaluation;
    }

}