public class Main{
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("Welcome to your personalized gym tracker");
        System.out.println("========================================");

        CustomLinkedList myLog = new CustomLinkedList();
        Exercises bench = new Exercises("Bench","Chest", true ,175,4);
        Exercises legpress = new Exercises("Legpress","Legs",true, 300, 6);
        Exercises bicepcurls = new Exercises("bicepcurls", "Biceps",false, 45, 6);

        myLog.add(bench);
        myLog.add(legpress);
        myLog.add(bicepcurls);

        

        myLog.makeEdit("bench", 185, 4);

        myLog.delete("legpress");

        myLog.display();
        
    }
}