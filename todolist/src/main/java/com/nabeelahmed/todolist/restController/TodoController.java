package com.nabeelahmed.todolist.restController;

import com.nabeelahmed.todolist.dataModel.TodoData;
import com.nabeelahmed.todolist.jpaRepo.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


/**
 * TodoController will utilise RestController Annotation to make use of all CRUD actions
 * http://localhost:8080 will be the port on which this server will run on
 *
 * Create = POST    => http://localhost:8080/todo   //Body
 * Read   = GET     => http://localhost:8080/todo
 * Update = PUT     => http://localhost:8080/todo/{id}  //Body
 * Delete = DELETE  => http://localhost:8080/todo/{id}
 */

@RestController
@RequestMapping(value = "/todo")
@CrossOrigin(origins = "http://localhost:3000/")
public class TodoController {

    @Autowired
    private TodoRepo todoRepo;

    /**
     * Fetches all todolist data from database
     * @return
     */
    @GetMapping
    public ResponseEntity<?> findAll(){
        return ResponseEntity.ok(todoRepo.findAll());
    }

    /**
     * POST operation where todoData is inserted in to database
     * @return
     */
    @PostMapping
    public TodoData save(@RequestBody TodoData todoData){
        return todoRepo.save(todoData);
    }

    /**
     * PUT operation takes place based on the {id} passed
     * @return
     */
    @PutMapping(value = "/{id}")
    public TodoData update(@PathVariable Long id, @RequestBody TodoData todoData){
        return todoRepo.save(todoData);
    }

    /**
     * DELETE operation takes place based on the {id} passed
     * @return
     */
    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id){
        todoRepo.deleteById(id);
    }
}
