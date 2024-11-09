package Services;

import Entities.TodoList;
import Repositories.TodoListRepository;
import Repositories.TodoListRepository;

public class TodoListServiceImpl implements TodoListService{
    private final repositories.TodoListRepositoryImpl todoListRepository;

    public TodoListServiceImpl(final TodoListRepository todoListRepository ) {
    }

    @Override
    public TodoList[] getTodoList() {
        return todoListRepository.getAll();
    }

    @Override
    public void addTodoList(final String todo) {
        if (todo.isEmpty() || todo.isBlank()) {
            System.out.println("Masukan todo dengan benar");
            return;
        }
        TodoList todoList = new TodoList();
        todoList.setTodo(todo);
    }

    @Override
    public Boolean removeTodoList(final Integer number) {
        return removeTodoList(number);
    }

    @Override
    public Boolean editTodoList(Integer number, String todo) {
        TodoList todoList = new TodoList();
        todoList.setId(number);
        todoList.setTodo(todo);
        return todoListRepository.edit(todoList);
    }
}
