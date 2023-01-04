public class Citrus extends Food {

    private String name;
    private int onePieceWeight;


    public Citrus(String name, int onePieceWeight) {
        this.name = name;
        this.onePieceWeight = onePieceWeight;
    }

    @Override
    public String toString(){
        return this.name + "," + this.onePieceWeight;
    }
}
