import {Component, Inject, OnInit} from '@angular/core';
import {NgForm} from "@angular/forms";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {Todo} from "../shares/todo.module";

@Component({
  selector: 'app-edit-todo-dialog',
  templateUrl: './edit-todo-dialog.component.html',
  styleUrls: ['./edit-todo-dialog.component.scss']
})
export class EditTodoDialogComponent implements OnInit {

  dialogRef: MatDialogRef<EditTodoDialogComponent>
  todo: Todo

  constructor(dialogRef: MatDialogRef<EditTodoDialogComponent>, @Inject(MAT_DIALOG_DATA) todo: Todo) {
    this.dialogRef = dialogRef
    this.todo = todo
  }

  ngOnInit(): void {
  }

  onCancelClicked() {
    this.dialogRef.close()
  }

  onFormSubmit(form: NgForm) {
    const updatedTodo = {
      ...this.todo,
      ...form.value
    }
    this.dialogRef.close(updatedTodo)
  }

}
