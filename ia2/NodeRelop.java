public class NodeRelop extends Node {
    private String relop;

    public NodeRelop(int pos, String relop) {
        this.pos = pos;
        this.relop = relop;
    }

    public double op(double o1, double o2) throws EvalException {     
        if(relop.equals("<")) {
            if(o1 < o2)
            return 1;       // true
            return 0;       // false
        }
        if(relop.equals("<=")) {
            if(o1 <= o2)
            return 1;
            return 0;
        }
        if(relop.equals(">")) {
            if(o1 > o2)
            return 1;
            return 0;
        }
        if(relop.equals(">=")) {
            if(o1 >= o2)
            return 1;
            return 0;
        }
        if(relop.equals("<>")) {
            if(o1 != o2)
            return 1;
            return 0;
        }
        if(relop.equals("=="))
        {
            if(o1 == o2)
            return 1;
            return 0;
        }
        throw new EvalException(pos, "bogus relop: " + relop); // not a valid relop
    }

}
