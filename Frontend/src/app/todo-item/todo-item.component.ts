import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';
import {Todo} from "../shares/todo.module";

@Component({
  selector: 'app-todo-item',
  templateUrl: './todo-item.component.html',
  styleUrls: ['./todo-item.component.scss']
})
export class TodoItemComponent implements OnInit {

  @Input() todo!: Todo
  @Output() toggleClicked: EventEmitter<void> = new EventEmitter()
  @Output() removeClicked: EventEmitter<void> = new EventEmitter()
  @Output() editClicked: EventEmitter<void> = new EventEmitter()


  constructor() {

  }

  ngOnInit(): void {
  }

  onToggleClicked() {
    this.todo.done = !this.todo.done
    this.toggleClicked.emit()
  }

  onRemoveClicked() {
    this.removeClicked.emit()
  }

  onEditClicked() {
    if (!this.todo.done) {
      this.editClicked.emit()
    }
  }
}
