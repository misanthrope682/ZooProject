import java.util.*;

public class Aviary {
    private String Address;

    private List<Animal> Animals;



    public Aviary(String address){
        Animals =  new ArrayList<Animal>();
        Address = address;
    }

    public String GetAddress(){
        return Address;
    }

    public void AddAnimal(Animal animal){
        Animals.add(animal);
    }

    public void RemoveAnimal(Animal animal){
        Animals.remove(animal);
    }

}
