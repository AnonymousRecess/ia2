/**
 * This function implements a Scanner to find valid tokens,
 * a parser to ensure the PL's grammar is followed
 * and an Environment that stores the elements of grammar
 * in nodes with evaluation methods
 * 
 * 
 * @author Boise State University - CS354
 * @author Jeff Kahn
 * @version 1.0
 */
public class Interpreter {

    public static void main(String[] args) {
	Parser parser=new Parser(); // instantiate parser
	Environment env=new Environment(); // instantiate environment
	for (String stmt: args)
	    try {
			parser.parse(stmt).eval(env); // print parser evaluation for each statement
	    } catch (SyntaxException e) {
			System.err.println(e);
	    } catch (EvalException e) {
			System.err.println(e);
	    }
    }

}