package controller;

import model.*;
import model.Groups;
import view.View;

import java.util.Calendar;
import java.util.Scanner;

import static controller.RegexContainer.*;
import static view.TextConstant.*;

public class InputNoteNoteBook {
    Scanner sc;
    View view;
    Model model;
    private DataBase dataBase;

    public InputNoteNoteBook(Scanner sc, View view, Model model) {
        this.sc = sc;
        this.view = view;
        this.model = model;
        dataBase = new DataBase();
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
        String str2 = (String.valueOf(View.bundle.getLocale()).equals("ua"))
                ? PATRONYMIC_REGEX_UA : PATRONYMIC_REGEX_LAT;
        model.setShortName(str2 + " " + str.charAt(0) + ".");
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
        str2 = (String.valueOf(View.bundle.getLocale()).equals("ua"))
                ? STREET_REGEX_UA : STREET_REGEX_LAT;
        model.setAddress(utilityController.inputStringValueWithScannerAndCheck(POSTAL_INDEX, INDEX_REGEX) + " " +
                utilityController.inputStringValueWithScannerAndCheck(CITY, str) + " " +
                utilityController.inputStringValueWithScannerAndCheck(STREET, str2) + " " +
                utilityController.inputStringValueWithScannerAndCheck(HOUSE_NUMBER, HOUSE_NUMBER_REGEX) + " " +
                utilityController.inputStringValueWithScannerAndCheck(APARTMENT_NUMBER, APARTMENT_NUMBER_REGEX));
        model.setDateInput(Calendar.getInstance().getTime().toString());
        model.setDateChanged(Calendar.getInstance().getTime().toString());
        model.setGroup(Groups.DEFAULT);
        this.createNote();
    }

    public boolean loginIsUnique() throws LoginDuplicateException {
        Logins[] values = Logins.values();
        for (int i = 0; i < values.length; i++) {
            if (model.getLogin().equals(values[i].toString())) {
                throw new LoginDuplicateException("This login already exists");
            }
            if (i == (values.length - 1)) {
                return true;
            }
        }
        return false;
    }

    public void createNote() {
        for (; ; ) {
            try {
                loginIsUnique();
            } catch (LoginDuplicateException e) {
                UtilityController utilityController = new UtilityController(sc, view);
                view.printString(LOGIN_EXISTS);
                model.setLogin(utilityController.inputStringValueWithScannerAndCheck(LOGIN, LOGIN_REGEX));
                continue;
            }
            break;
        }

        dataBase.addNote(model);
    }
}
