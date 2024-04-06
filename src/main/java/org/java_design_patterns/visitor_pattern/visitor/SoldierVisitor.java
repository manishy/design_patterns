package org.java_design_patterns.visitor_pattern.visitor;

import org.java_design_patterns.visitor_pattern.VisitorType;
import org.java_design_patterns.visitor_pattern.units.Unit;

public class SoldierVisitor implements UnitVisitor {
    @Override
    public void visit(Unit soldier) {
        if (soldier.accept(this)) {
            System.out.println("Hello " + soldier);
        }
    }

    @Override
    public VisitorType getType() {
        return VisitorType.Soldier;
    }
}
