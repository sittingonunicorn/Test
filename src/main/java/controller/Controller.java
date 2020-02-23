/**
 * Package contains methods and fields to control input data and to provide the association of View and Model.
 */

package controller;

import model.DataBase;
import model.LoginDuplicateException;
import model.Logins;
import model.Model;
import view.View;

import java.util.Scanner;

/**
 * Class provides association of Model and View classes.
 */
public class Controller {
    /**
     * Model instance.
     */
    private Model model;
    /**
     * View instance.
     */
    private View view;



    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;

    }


    public void processUser() {
        Scanner sc = new Scanner(System.in);
        InputNoteNoteBook inputNoteNoteBook = new InputNoteNoteBook(sc, view, model);
        inputNoteNoteBook.inputNote();


    }


}