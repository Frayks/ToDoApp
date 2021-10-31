package andrew.project.ToDoList.controllers;

import andrew.project.ToDoList.api.dataObjects.ToDo;
import andrew.project.ToDoList.api.mappers.MapperDbi;
import andrew.project.ToDoList.api.services.IToDoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ToDoController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ToDoController.class);

    @GetMapping("/getAllTodos")
    public List<ToDo> getAllTodos() {
        LOGGER.info("getAllTodos");
        return MapperDbi.mapFromDbiList(toDoService.findAll());
    }

    @PostMapping("/addTodo")
    public ToDo addTodo(@RequestBody ToDo toDo) {
        LOGGER.info("addTodo");
        return MapperDbi.mapFromDbi(toDoService.insert(MapperDbi.mapToDbi(toDo)));
    }

    @PostMapping("/updateTodo")
    public void updateTodo(@RequestBody ToDo updateTodo) {
        LOGGER.info("updateTodo");
        toDoService.updateById(MapperDbi.mapToDbi(updateTodo));
    }

    @PostMapping("/deleteTodo")
    public void deleteTodo(@RequestBody String id) {
        LOGGER.info("deleteTodo");
        toDoService.deleteById(id);
    }


    // -------------------------------------WIRING-------------------------------------

    private IToDoService toDoService;

    @Autowired
    public void setToDoService(IToDoService toDoService) {
        this.toDoService = toDoService;
    }
}
