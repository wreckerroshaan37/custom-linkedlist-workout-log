

public class CustomLinkedList{
    Node head;
    int size;
    // this is starting the linked list with size of 0 and the head equals to null
    public CustomLinkedList(){
        head = null;
        size = 0;
    }
    //this is the add where add takes in a exercise object under the variable data
    //then it makes a newNode variable which is a Node puts in exercise object within that data
    //checks if the head equals to null and if it is it links the new node we just created to head
    public void add(Exercises data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            size++;
            return;
        }

    //over here assings a passing variable name current which is a node.
    //this current is assigned to head which is the first node in the list, which was assigned before this.
    //it then goes to the next node through a loop saying current.next and keeps goign until it is null
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        //once the while loop is done running it will keep running until it finds null aka meaning no object
        //once that happens it will assign current.nxt a new object
        current.next = newNode;
        size++; 
    }

    //this displays it so first it checks if the head equals to null and if it is says it is empty
    //but then if it isnt it sets the pointer variabel current to head to start the tracking the list from head
    //and then it traversers down with a while look and if current is not null prints the objects data
    //it then reassigns current to current.next which gets its assigned object from the add fucntion above.
    public void display(){
        if (head == null){
            System.out.print("Workout log is empty");
        }
        Node current = head;
        while (current != null){
            System.out.println(current.data.exerciseName + " - " + 
                            current.data.weight + " lbs x " + 
                            current.data.reps + " reps | Est. 1RM: " + 
                            String.format("%.2f", current.data.oneRepMax()) + " lbs | Total Weight Lifted: " +
                            current.data.totalWeight() + " lbs");
                            
                            
            current = current.next;
        }
    }
    //edit class first find the node that needs to be edited by the name
    public boolean makeEdit(String name, double newWeight, int newReps){
        Node current = head;

        while (current != null){
            if (current.data.exerciseName.equalsIgnoreCase(name)){
                current.data.weight = newWeight;
                current.data.reps = newReps;
                return true;
            }
            current = current.next;
        }
        System.out.println("No such exercise exist in your log");
        return false;
    }

    public boolean delete(String name){

        if(head == null){
            System.out.println("Your workout list is empty");
            return false;
        }
        if(head.data.exerciseName.equalsIgnoreCase(name)){
            head = head.next;
            size--;
            return true;
        }

        Node current = head;

        while (current.next != null){
            if(current.next.data.exerciseName.equalsIgnoreCase(name)){
                current.next = current.next.next;
                return true;

            }
            System.out.println("This exercise does not exist");

        }
        return false;

    }

}
