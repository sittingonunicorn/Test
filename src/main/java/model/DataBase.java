package model;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    private List<Model> dataBase;

    public DataBase() {
        dataBase = new ArrayList<>();
    }

    public void addNote(Model model){
        dataBase.add(model);
    }

    public List<Model> getDataBase() {
        return dataBase;
    }

    @Override
    public String toString() {
        return "DataBase{" +
                "dataBase=" + dataBase +
                '}';
    }
}
