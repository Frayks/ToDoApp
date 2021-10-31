import {Component, OnInit} from '@angular/core';
import {Todo} from "../shares/todo.module";
import {NgForm} from "@angular/forms";
import {MatDialog} from "@angular/material/dialog";
import {EditTodoDialogComponent} from "../edit-todo-dialog/edit-todo-dialog.component";
import {TodoService} from "../shares/todo.service";

@Component({
  selector: 'app-todos',
  templateUrl: './todos.component.html',
  styleUrls: ['./todos.component.scss']
})
export class TodosComponent implements OnInit {

  private todoService: TodoService
  private dialog: MatDialog
  todos: Todo[] = []

  constructor(todoService: TodoService, dialog: MatDialog) {
    this.todoService = todoService
    this.dialog = dialog
    this.todoService.getAllTodos().subscribe(result => {
      this.todos = result
    })
  }

  ngOnInit(): void {
  }

  onFormSubmit(form: NgForm) {
    if (form.valid) {
      this.todoService.addTodo(new Todo(form.value.text)).subscribe(result => {
        this.todos.push(result)
      })
      form.reset()
    }
  }

  onRemoveClicked(index: number) {
    let id = this.todos[index].id
    this.todos.splice(index, 1)
    this.todoService.deleteTodo(id)
  }

  onEditClicked(i: number, updatedTodo: Todo) {
    let dialogRef = this.dialog.open(EditTodoDialogComponent, {
      panelClass: 'custom-dialog-container',
      width: '50%',
      data: updatedTodo
    });
    dialogRef.afterClosed().subscribe((result) => {
      if (result) {
        this.todos[i] = result
        this.todoService.updateTodo(result)
      }
    })
  }

  onToggleClicked(todo: Todo) {
    this.todoService.updateTodo(todo)
  }
}
