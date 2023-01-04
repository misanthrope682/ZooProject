import java.util.ArrayList;

public class Employee implements IEmployee {

    private String name;

    public Employee(String name){this.name = name;
    }

    public String getName(){
        return name;
    }





    @Override
    public void feed(Animal animal,int foodAmount) {
        System.out.println(name + "is going to feed " + animal.getName() + foodAmount + "amount of food ");
        animal.Eat(foodAmount);

    }
    @Override
     public void transfer(Aviary transferFrom,Aviary transferTo,Animal animal){
         System.out.println(name + " is going to transfer " + animal.getName());
         System.out.println("transferring " + animal.getName() + " from " + transferFrom.GetAddress() + " to " + transferTo.GetAddress());
         transferFrom.RemoveAnimal(animal);
         transferFrom.AddAnimal(animal);
         System.out.println("animal successfully transferred");
    }

    public void moveAnimalToAviary(Animal animal,Aviary aviary){
        System.out.println(name + " is going to add " + animal.getName() + " in " + aviary.GetAddress() );
        aviary.AddAnimal(animal);
    }


}
