public class NodeBlock extends Node {

    private NodeStmt stmt;
    private NodeBlock block;

    public NodeBlock(NodeStmt stmt, NodeBlock block)
    {
        this.stmt = stmt;
        this.block = block;
    }
    
    public double eval(Environment env) throws EvalException {
        double evaluation = stmt.eval(env);
        if(block.block!= null) // evaluate block if there is another block
        return block.eval(env) ;
        return evaluation; // evaluate stmt if no block
    }
}
