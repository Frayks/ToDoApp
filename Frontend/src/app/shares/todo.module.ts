export class Todo {
  id!: string
  text: string | undefined
  done: boolean = false

  constructor(text: string) {
    this.text = text
  }
}
