public class Fruit extends Food implements IFruit{

    private String name;
    private int onePieceWeight;


    public Fruit(String name, int onePieceWeight) {
        this.name = name;
        this.onePieceWeight = onePieceWeight;
    }

    @Override
    public boolean equals(Object obj){
        Fruit other = (Fruit) obj;
        return this.name.equals(other.name) && this.onePieceWeight == other.onePieceWeight;
    }


    @Override
    public void makingJuice(String name) {
        System.out.println("the juice of " + this.name + " has been made");
    }

    @Override
    public void makingSalad(String name) {
        System.out.println("the salad of " + this.name + " has been made");
    }
}
