import {NgModule} from '@angular/core';
import {BrowserModule} from '@angular/platform-browser';

import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {TodosComponent} from './todos/todos.component';
import {FormsModule} from "@angular/forms";
import {TodoItemComponent} from './todo-item/todo-item.component';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {EditTodoDialogComponent} from './edit-todo-dialog/edit-todo-dialog.component';
import {MatDialogModule} from "@angular/material/dialog";
import {HttpClient, HttpClientModule} from "@angular/common/http";

@NgModule({
  declarations: [
    AppComponent,
    TodosComponent,
    TodoItemComponent,
    EditTodoDialogComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    BrowserAnimationsModule,
    MatDialogModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}
