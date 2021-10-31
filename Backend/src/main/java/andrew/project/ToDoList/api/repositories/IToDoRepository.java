package andrew.project.ToDoList.api.repositories;

import andrew.project.ToDoList.api.dataObjects.ToDo;
import andrew.project.ToDoList.api.entities.ToDoDbi;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IToDoRepository extends MongoRepository<ToDoDbi, String> {

}
