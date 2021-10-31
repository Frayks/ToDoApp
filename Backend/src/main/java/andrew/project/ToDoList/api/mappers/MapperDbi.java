package andrew.project.ToDoList.api.mappers;

import andrew.project.ToDoList.api.dataObjects.ToDo;
import andrew.project.ToDoList.api.entities.ToDoDbi;

import java.util.ArrayList;
import java.util.List;

public class MapperDbi {

    public static ToDo mapFromDbi(ToDoDbi toDoDbi) {
        ToDo toDo = new ToDo();
        toDo.setId(toDoDbi.getId());
        toDo.setText(toDoDbi.getText());
        toDo.setDone(toDoDbi.isDone());
        return toDo;
    }

    public static ToDoDbi mapToDbi(ToDo toDo) {
        ToDoDbi toDoDbi = new ToDoDbi();
        toDoDbi.setId(toDo.getId());
        toDoDbi.setText(toDo.getText());
        toDoDbi.setDone(toDo.isDone());
        return toDoDbi;
    }

    public static List<ToDo> mapFromDbiList(List<ToDoDbi> toDoDbiList) {
        List<ToDo> toDoList = new ArrayList<>();
        for (ToDoDbi toDoDbi : toDoDbiList) {
            toDoList.add(mapFromDbi(toDoDbi));
        }
        return toDoList;
    }

    public static List<ToDoDbi> mapToDbiList(List<ToDo> toDoList) {
        List<ToDoDbi> toDoDbiList = new ArrayList<>();
        for (ToDo toDo : toDoList) {
            toDoDbiList.add(mapToDbi(toDo));
        }
        return toDoDbiList;
    }
}
