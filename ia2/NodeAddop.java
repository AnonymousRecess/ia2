public class NodeAddop extends Node {

    private String addop;

    public NodeAddop(int pos, String addop) {
	this.pos=pos; // position of node
	this.addop=addop; // token of node
    }

    public double op(double o1, double o2) throws EvalException {
	if (addop.equals("+"))
	    return o1+o2;
	if (addop.equals("-"))
	    return o1-o2;
	throw new EvalException(pos,"bogus addop: "+addop);
    }

}