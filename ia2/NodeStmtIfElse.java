public class NodeStmtIfElse extends NodeStmt {
    private NodeBoolExpr boolExpr;
    private NodeStmt stmt;
    private NodeStmt stmt2;
    public NodeStmtIfElse(NodeBoolExpr boolExpr, NodeStmt stmt, NodeStmt stmt2) {
        this.boolExpr = boolExpr;
        this.stmt = stmt;
        this.stmt2 = stmt2;
    }
    public double eval(Environment env) throws EvalException {

        if (boolExpr.eval(env) == 1)
            return stmt.eval(env);
        else if (stmt2 != null)
            return stmt2.eval(env);
        return 0;

    }
}