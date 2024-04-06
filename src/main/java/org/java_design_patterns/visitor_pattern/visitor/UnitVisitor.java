package org.java_design_patterns.visitor_pattern.visitor;

import org.java_design_patterns.visitor_pattern.VisitorType;
import org.java_design_patterns.visitor_pattern.units.Unit;

public interface UnitVisitor {
    public void visit (Unit commander);

    public VisitorType getType ();
}
