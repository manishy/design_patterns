package org.java_design_patterns.visitor_pattern.units;

import org.java_design_patterns.visitor_pattern.VisitorType;

public class Sergeant extends Unit {
    @Override
    VisitorType getAcceptableVisitorType() {
        return VisitorType.Sergeant;
    }

    @Override
    public String toString() {
        return "Sergeant";
    }
}
