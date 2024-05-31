package todo;

public class ToDoList {
    Node head;
    public void addToDo(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    public void markToDoAsCompleted(String title) {
        Node current = head;
        while (current != null) {
            if ((current.task.getTitle().equals(title))) {
                current.task.markCompleted();
            }
            current = current.next;
        }
    }
    public void viewToDoList() {
        Node current = head;
        while (current != null) {
            System.out.println("Title of the task is " + current.task.getTitle()
            +" and it's Description is " + current.task.getDescription());
            System.out.println("is the task completed " +  current.task.isCompleted());
            current = current.next;
        }
    }
}

