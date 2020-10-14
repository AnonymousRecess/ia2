public class NodeStmtId extends NodeStmt { //todo used by write to get stored node? This is the way to 'remember' a stored value? Or do I need it retrieved by factID IF SO MIGHT NOT NEED THIS?

    private String id;

    public NodeStmtId(int pos, String id) {
	this.pos=pos;
	this.id=id;
    }

    public double eval(Environment env) throws EvalException {
	return env.get(pos,id); // returns node identifier and position
    }

}
