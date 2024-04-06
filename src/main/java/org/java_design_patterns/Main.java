package org.java_design_patterns;

import org.java_design_patterns.visitor_pattern.visitor.SergeantVisitor;
import org.java_design_patterns.visitor_pattern.units.Commander;
import org.java_design_patterns.visitor_pattern.units.Sergeant;
import org.java_design_patterns.visitor_pattern.units.Soldier;
import org.java_design_patterns.visitor_pattern.visitor.CommanderVisitor;
import org.java_design_patterns.visitor_pattern.visitor.SoldierVisitor;

public class Main {
    public static void main(String[] args) {
        new CommanderVisitor().visit(new Soldier());
        new CommanderVisitor().visit(new Sergeant());
        new CommanderVisitor().visit(new Commander());

        new SergeantVisitor().visit(new Soldier());
        new SergeantVisitor().visit(new Sergeant());
        new SergeantVisitor().visit(new Commander());

        new SoldierVisitor().visit(new Soldier());
        new SoldierVisitor().visit(new Sergeant());
        new SoldierVisitor().visit(new Commander());
    }
}