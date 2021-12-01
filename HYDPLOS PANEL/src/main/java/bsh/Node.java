package bsh;

import java.io.Serializable;

/* access modifiers changed from: package-private */
public interface Node extends Serializable {
    void jjtAddChild(Node node, int i);

    void jjtClose();

    Node jjtGetChild(int i);

    int jjtGetNumChildren();

    Node jjtGetParent();

    void jjtOpen();

    void jjtSetParent(Node node);
}
