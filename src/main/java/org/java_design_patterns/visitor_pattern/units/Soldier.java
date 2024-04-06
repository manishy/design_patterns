package org.java_design_patterns.visitor_pattern.units;

import org.java_design_patterns.visitor_pattern.VisitorType;

public class Soldier extends Unit {
    @Override
    VisitorType getAcceptableVisitorType() {
        return VisitorType.Soldier;
    }

    @Override
    public String toString() {
        return "Soldier";
    }
}
