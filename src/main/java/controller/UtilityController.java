package controller;

import view.View;

import java.util.Scanner;

public class UtilityController {
    Scanner sc;
    View view;

    public UtilityController(Scanner sc, View view) {
        this.sc = sc;
        this.view = view;
    }

    public String inputStringValueWithScannerAndCheck(String userQuery, String regex) {
        String str;
        view.printStringInput(userQuery);
        while( !(sc.hasNext() && (str = sc.next()).matches(regex))) {
            view.printWrongStringInput(userQuery);
        }
        return str;
    }
}
