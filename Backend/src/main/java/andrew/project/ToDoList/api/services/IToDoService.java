package andrew.project.ToDoList.api.services;

import andrew.project.ToDoList.api.entities.ToDoDbi;

import java.util.List;

public interface IToDoService {

    ToDoDbi insert(ToDoDbi toDoDbi);

    List<ToDoDbi> findAll();

    void updateById(ToDoDbi toDoDbi);

    void deleteById(String id);
}
