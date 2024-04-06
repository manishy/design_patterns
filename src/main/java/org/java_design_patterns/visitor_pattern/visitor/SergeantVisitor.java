package org.java_design_patterns.visitor_pattern.visitor;

import org.java_design_patterns.visitor_pattern.VisitorType;
import org.java_design_patterns.visitor_pattern.units.Unit;

public class SergeantVisitor implements UnitVisitor {
    @Override
    public void visit(Unit sergeant) {
        if (sergeant.accept(this)) {
            System.out.println("Hello " + sergeant);
        }
    }

    @Override
    public VisitorType getType() {
        return VisitorType.Sergeant;
    }
}
