package controller;

import model.Model;
import view.View;

import java.util.Scanner;

import static controller.RegexContainer.*;
import static view.TextConstant.*;

public class InputNoteNoteBook {
    Scanner sc;
    View view;
    Model model;

    public InputNoteNoteBook(Scanner sc, View view, Model model) {
        this.sc = sc;
        this.view = view;
        this.model = model;
    }

    public void inputNote() {
        UtilityController utilityController =
                new UtilityController(sc, view);
        String str = (String.valueOf(View.bundle.getLocale()).equals("ua"))
                ? FIRSTNAME_REGEX_UA : FIRSTNAME_REGEX_LAT;
        model.setFirstname(utilityController.inputStringValueWithScannerAndCheck(FIRST_NAME, str));
        str = (String.valueOf(View.bundle.getLocale()).equals("ua"))
                ? LASTNAME_REGEX_UA : LASTNAME_REGEX_LAT;
        model.setLastname(utilityController.inputStringValueWithScannerAndCheck(LAST_NAME, str));
        str = (String.valueOf(View.bundle.getLocale()).equals("ua"))
                ? PATRONYMIC_REGEX_UA : PATRONYMIC_REGEX_LAT;
        model.setPatronymic(utilityController.inputStringValueWithScannerAndCheck(PATRONYMIC, str));
        model.setLogin(utilityController.inputStringValueWithScannerAndCheck(LOGIN, LOGIN_REGEX));
        model.setComment(utilityController.inputStringValueWithScannerAndCheck(COMMENT, COMMENT_REGEX));
        model.setHomeNumber(utilityController.inputStringValueWithScannerAndCheck(HOME_PHONE_NUMBER, HOME_PHONE_NUMBER_REGEX));
        model.setMobileNumber(utilityController.inputStringValueWithScannerAndCheck(MOBILE_PHONE_NUMBER, MOBILE_NUMBER_REGEX));
        model.setMobileNumber2(utilityController.inputStringValueWithScannerAndCheck(MOBILE_PHONE_NUMBER2, MOBILE_NUMBER2_REGEX));
        model.seteMail(utilityController.inputStringValueWithScannerAndCheck(EMAIL, E_MAIL_REGEX));
        model.setSkype(utilityController.inputStringValueWithScannerAndCheck(SKYPE, SKYPE_REGEX));
        str = (String.valueOf(View.bundle.getLocale()).equals("ua"))
                ? CITY_REGEX_UA : CITY_REGEX_LAT;
        String str2 = (String.valueOf(View.bundle.getLocale()).equals("ua"))
                ? STREET_REGEX_UA : STREET_REGEX_LAT;
        model.setAddress(utilityController.inputStringValueWithScannerAndCheck(POSTAL_INDEX, INDEX_REGEX)+" "+
                utilityController.inputStringValueWithScannerAndCheck(CITY, str) + " "+
                utilityController.inputStringValueWithScannerAndCheck(STREET, str) +" " +
                utilityController.inputStringValueWithScannerAndCheck(HOUSE_NUMBER, HOUSE_NUMBER_REGEX)+" "+
                utilityController.inputStringValueWithScannerAndCheck(APARTMENT_NUMBER, APARTMENT_NUMBER_REGEX));


    }
}
