import controller.Controller;
import model.Model;
import view.View;

import java.util.Calendar;
import model.Logins;
public class Main {
    public static void main(String[] args) {
//        String login = "kittycat35";
//        Logins[] values = Logins.values();
//        for (int i = 0; i < values.length; i++) {
//            if (login.equals(values[i].toString())) {
//                System.out.println(true);
//            } else System.out.println(false);}

        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        controller.processUser();
        
    }
}

