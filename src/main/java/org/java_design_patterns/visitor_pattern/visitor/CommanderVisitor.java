package org.java_design_patterns.visitor_pattern.visitor;

import org.java_design_patterns.visitor_pattern.VisitorType;
import org.java_design_patterns.visitor_pattern.units.Unit;

public class CommanderVisitor implements UnitVisitor {
    @Override
    public void visit(Unit commander) {
        if (commander.accept(this)) {
            System.out.println("Hello " + commander);
        }
    }

    @Override
    public VisitorType getType() {
        return VisitorType.Commander;
    }
}
