package task3;

import task3.abstactmethod.*;
import task3.interfaceandanonuimclasses.*;
import task3.interfaceandclases.*;
import task3.lambda.*;
import task3.reference.*;


import java.awt.*;
import java.lang.invoke.LambdaConversionException;


public class Main {
    public static void main(String[] args) {

        // Abstract Class (1st method)
        System.out.println("Using abstract class (1st method)");
        Firstfunction ff = new Firstfunction();
        System.out.println(ff.getMin(12, 30, 1));
        SecondFunction sf = new SecondFunction();
        System.out.println(sf.getMin(-30, 50, 1));


        // Interface and classes (2nd method)
        System.out.println("Interface and clases (2nd method)");
        Solver solver = new Solver();
        System.out.println(solver.getMin(12, 30, 1, new Firstfunc()));
        System.out.println(solver.getMin(-30, 50, 1, new Secondfunc()));


        // Interface and anonium clases
        System.out.println("Interface and anonuim classes (3rd method");
        System.out.println(AnoniumClassesMin.getMin(12, 30, 1, new AnoniumClassesMin() {
            @Override
            public double f(double x) {
                return Math.sin(x);
            }
        }));
        System.out.println(AnoniumClassesMin.getMin(-30, 50, 1, new AnoniumClassesMin() {
            @Override
            public double f(double x) {
                return Math.pow(x, 2);
            }
        }));


        // Labmda Method
        System.out.println("Lambda Method (4th Method)");
        System.out.println(LamdaMin.getMin(12, 30, 1, (a) -> { return Math.sin(a); } ));
        System.out.println(LamdaMin.getMin(-30, 50, 1, (a) -> { return Math.pow(a, 2);} ));

        // References
        System.out.println("References Method (5th Method)");
        ReferenceClass referenceClass = new ReferenceClass();
        System.out.println(ReferenceInterface.getMin(12, 30, 1, referenceClass::sin));
        System.out.println(ReferenceInterface.getMin(-30, 50, 1, referenceClass::powToTwo));

    }
}


