package andrew.project.ToDoList.services;

import andrew.project.ToDoList.api.entities.ToDoDbi;
import andrew.project.ToDoList.api.repositories.IToDoRepository;
import andrew.project.ToDoList.api.services.IToDoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ToDoServices implements IToDoService {

    @Override
    public ToDoDbi insert(ToDoDbi toDoDbi) {
        return toDoRepository.insert(toDoDbi);
    }

    @Override
    public List<ToDoDbi> findAll() {
        return toDoRepository.findAll();
    }

    @Override
    public void updateById(ToDoDbi toDoDbi) {
        toDoRepository.save(toDoDbi);
    }

    @Override
    public void deleteById(String id) {
        toDoRepository.deleteById(id);
    }

    // -------------------------------------WIRING-------------------------------------

    private IToDoRepository toDoRepository;

    @Autowired
    public void setToDoRepository(IToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }
}
