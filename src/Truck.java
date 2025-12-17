public class Truck extends Transport{

    private boolean isLoaded;

    public Truck(int weight, byte[] cordinate) {
        super(weight, cordinate);
    }

    public Truck(int weight, byte[] cordinate, boolean isLoaded) {
        super(weight, cordinate);
    }

    public void setLoaded(boolean loaded) {
        this.isLoaded = loaded;
    }

    public void getLoaded(){
        if(isLoaded)
            System.out.println("Грузовик загружен");
        else
            System.out.println("Грузовик не загружен");
    }

}
