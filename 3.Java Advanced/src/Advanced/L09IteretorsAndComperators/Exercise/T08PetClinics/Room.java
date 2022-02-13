package Advanced.L09IteretorsAndComperators.Exercise.T08PetClinics;

public class Room {
    public Pet pet;

    public Room(){
        this.pet = null;
    }

    @Override
    public String toString() {
        if(pet == null){
            return "Room empty";
        }
        else{
            return pet.toString();
        }
    }
}