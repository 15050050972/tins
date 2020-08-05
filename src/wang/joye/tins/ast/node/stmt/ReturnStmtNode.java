package wang.joye.tins.ast.node.stmt;

import wang.joye.tins.ast.node.ExprNode;
import wang.joye.tins.ast.node.StmtNode;
import wang.joye.tins.util.DumpUtil;

/**
 * 顶层结点
 */
public class ReturnStmtNode extends StmtNode {

    public ExprNode expr;

    public ReturnStmtNode() {

    }

    @Override
    public void dump(int level) {
        DumpUtil.dump(level, "return");
        if (expr != null) {
            expr.dump(level + 1);
        }
    }
}