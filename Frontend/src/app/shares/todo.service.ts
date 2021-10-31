import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Todo} from "./todo.module";

@Injectable({
  providedIn: 'root'
})
export class TodoService {

  private http: HttpClient
  private serverUrl: string

  constructor(http: HttpClient) {
    this.http = http
    this.serverUrl = 'http://localhost:8080/'
  }

  getAllTodos() {
     return this.http.get<Todo[]>(this.serverUrl + 'getAllTodos')
  }

  addTodo(todo: Todo) {
    return this.http.post<Todo>(this.serverUrl + 'addTodo' ,todo)
  }

  updateTodo(updatedTodo: Todo) {
    return this.http.post(this.serverUrl + 'updateTodo', updatedTodo).subscribe()
  }

  deleteTodo(id: string) {
    this.http.post(this.serverUrl + 'deleteTodo', id).subscribe()
  }

}
