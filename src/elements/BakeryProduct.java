package elements;

import visitors.Visitor;

public interface BakeryProduct {
    void accept(Visitor visitor);
}
