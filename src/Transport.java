public class Transport {

    private float speed;
    private int weight;
    private String color;
    private byte[] cordinate;

    public Transport(float _speed, int _weight, String _color, byte[] _cordinate) {
        setValue(_speed, _weight, _color, _cordinate);
        System.out.println(getValues());
    }

    public Transport(int weight, byte[] cordinate) {
        this.weight = weight;
        this.cordinate = cordinate;
        System.out.println(getValues());
    }

    protected void setValue(float speed, int weight, String color, byte[] cordinate){
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        this.cordinate = cordinate;
    }
    protected String getValues(){
        String info =  "Object speed: " + speed + "Weight: " + weight + "Color: " + color + "Cordinate" + cordinate;
        String infoCordinates = "Cordinates: ";
        for(int i = 0; i < cordinate.length; i++)
            infoCordinates += cordinate[i] + "\n";

        return info + cordinate;

    }
}
