package org.java_design_patterns.visitor_pattern.units;

import org.java_design_patterns.visitor_pattern.visitor.UnitVisitor;
import org.java_design_patterns.visitor_pattern.VisitorType;

public abstract class Unit {
    private final Unit[] children;

    public Unit(Unit... children) {
        this.children = children;
    }

    abstract VisitorType getAcceptableVisitorType();

    public boolean accept(UnitVisitor visitor) {
        return getAcceptableVisitorType().equals(visitor.getType());
    }
}

