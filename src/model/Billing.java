package org.agilar.csd.ci.src.model;

import java.util.LinkedList;
import java.util.List;

public class Billing {

    List<Line> linesOfBill;

    public Billing() {
        this.linesOfBill = new LinkedList<>();
    }

    public double SumTotal()
    {
        double total = 0.0;
        for (Line line:linesOfBill) {
            total += line.getPrice() * line.getQuantity();
        }
        return total;
    }

    public void addLine(Line line) {
        linesOfBill.add(line);
    }
}
