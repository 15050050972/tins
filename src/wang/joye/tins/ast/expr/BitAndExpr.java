package wang.joye.tins.ast.expr;

import wang.joye.tins.ast.node.ExprNode;
import wang.joye.tins.type.ExprType;
import wang.joye.tins.util.DumpUtil;
import wang.joye.tins.visitor.ASTVisitor;
import wang.joye.tins.visitor.ExprLineVisitor;
import wang.joye.tins.visitor.ExprTypeVisitor;

public class BitAndExpr extends ExprNode {
    public ExprNode leftExpr, rightExpr;

    public BitAndExpr(ExprNode leftExpr, ExprNode rightExpr) {
        this.leftExpr = leftExpr;
        this.rightExpr = rightExpr;
    }

    @Override
    public void dump(int level) {
        DumpUtil.dump(level, "Bit And Expr");
        DumpUtil.dump(level + 1, "left Expr");
        leftExpr.dump(level + 2);
        DumpUtil.dump(level + 1, "right Expr");
        rightExpr.dump(level + 2);
    }

    @Override
    public void check(ASTVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public ExprType type() {
        return ExprTypeVisitor.getType(this);
    }

    @Override
    public int getLine() {
        return ExprLineVisitor.getLine(this);
    }
}
