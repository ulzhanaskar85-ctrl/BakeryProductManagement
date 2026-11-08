package visitors;

import elements.Bread;
import elements.Cake;
import elements.Cookie;

public interface Visitor {
    void visitBread(Bread bread);
    void visitCake(Cake cake);
    void visitCookie(Cookie cookie);
}
