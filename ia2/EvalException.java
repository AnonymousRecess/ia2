public class EvalException extends Exception {

    private int pos; // position of scanner
    private String msg; // mesage for error

    public EvalException(int pos, String msg) {
	this.pos=pos; // passed position
	this.msg=msg; // passed message
    }
    /**
     * This function returns the error message constructed from a failed evaluation
     */
    public String toString() {
	return "eval error"
	    +", pos="+pos
	    +", "+msg;
    }

}
