public class Vegetable extends Food implements IVegetable{

    private String name;
    private String color;

    private boolean peelable;

    private int onePieceWeight;


    public Vegetable(String name,String color, boolean peelable, int onePieceWeight){
        this.name = name;
        this.color = color;
        this.peelable = peelable;
        this.onePieceWeight = onePieceWeight;
    }

    @Override
    public int hashCode(){
        return this.onePieceWeight;
    }

    @Override
    public void roast(String name, String color, boolean peelable) {

    }
}
