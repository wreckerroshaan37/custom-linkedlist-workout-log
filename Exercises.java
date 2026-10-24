public class Exercises{
    String exerciseName;
    String targetMuscle;
    boolean isCompoundLift;
    double weight;
    int reps;
    


    // this is the constructor of what each object will contain
    // will contain exercise name, target location, and if its a compount lift
    public Exercises(String exerciseName, String targetMuscle, boolean isCompoundLift, double weight, int reps){
        this.exerciseName = exerciseName;
        this.targetMuscle = targetMuscle;
        this.isCompoundLift = isCompoundLift;
        this.weight = weight;
        this.reps = reps;
    }

    public double oneRepMax(){
        return weight * (1 + reps/30.0);
    }

    public double totalWeight(){
        return weight*reps;
    }


}







// want to create a program that logs all the exercises I do.
//counts reps
//counts sets
//option if its a compound lift or not
//estimaites 1 rep max
