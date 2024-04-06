package org.java_design_patterns.visitor_pattern.units;

import org.java_design_patterns.visitor_pattern.visitor.UnitVisitor;
import org.java_design_patterns.visitor_pattern.VisitorType;

public class Commander extends Unit {
    public Commander(Unit... children) {
        super(children);
    }

    @Override
    VisitorType getAcceptableVisitorType() {
        return VisitorType.Commander;
    }

    @Override
    public String toString() {
        return "Commander";
    }
}
