public class NodeBeginEnd extends NodeStmt {
    private NodeBlock block;

    public NodeBeginEnd(NodeBlock block)
    {
        this.block = block;
    }
    public double eval(Environment env) throws EvalException {
        return block.eval(env);
    }
}
