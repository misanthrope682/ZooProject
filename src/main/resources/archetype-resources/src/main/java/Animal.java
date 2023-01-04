import java.util.ArrayList;

public class Animal implements IAnimal{

    private String name;
    private int hunger;

    public Animal(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void Eat(int amount){
        for(int i = 0; i < amount;i++){
            System.out.println("eating...");
            hunger++;
        }

    }

    private ArrayList<String> Reptiles;
    private ArrayList<String > Amphibians;
    private ArrayList<String> Birds;

    public void AddReptiles(String reptileName){
        Reptiles.add(reptileName);
    }

    public void AddAmphibian(String amphibianName){
        Amphibians.add(amphibianName);
    }
    public void AddBird(String birdName){
        Birds.add(birdName);
    }

    @Override
    public void eat(String name) {
        System.out.println(this.name + "is eating");
    }

    @Override
    public void pee(String name) {
        System.out.println(this.name + "is peeing");
    }

    @Override
    public void workout(String name) {
        System.out.println(this.name + "is working out");

    }
}
