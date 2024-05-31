package todo;

public class Main {
    public static void main(String[] args) {
            ToDoList toDoList = new ToDoList();
            Task task1 = new Task("Class Work", "Doing the class work");
            Task task2 = new Task("Home Work", "Doing the home work");
            Task task3 = new Task("Assignments", "Doing the assingments");
            Task task4 = new Task("Presentation", "Doing the Presentation");
            toDoList.addToDo(task1);
            toDoList.addToDo(task2);
            toDoList.addToDo(task3);
            toDoList.addToDo(task4);
            
            toDoList.viewToDoList();
            toDoList.markToDoAsCompleted("Assignment");
            toDoList.markToDoAsCompleted("Class Work");
            toDoList.markToDoAsCompleted("Home Work");
            toDoList.viewToDoList();
        }
    }
    
