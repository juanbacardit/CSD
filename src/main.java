package org.agilar.csd.ci.src;

import org.agilar.csd.ci.src.model.*;

public class Main {

    public static void Main() throws Exception{

        System.out.println("hello world");
        Billing bill = new Billing();
        Line line  = new Line();
        line.setPrice(12.0);
        line.setQuantity(29);
        bill.addLine(line);
        System.out.println(bill.SumTotal());
    }
}
