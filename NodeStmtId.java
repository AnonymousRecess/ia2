public class NodeStmtId extends NodeStmt { 

    private String id;

    public NodeStmtId(int pos, String id) {
	this.pos=pos;
	this.id=id;
    }

    public double eval(Environment env) throws EvalException {
	return env.get(pos,id); // returns node identifier and position
    }

}
