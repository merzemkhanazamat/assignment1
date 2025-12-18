public class Class_restangle {

private double width;
private double height;
int id;
static int idGen;

public Class_restangle(){
    this.width = 1.0;
    this.height = 1.0;
    this.id = idGen++;
}

public Class_restangle(double width, double height){
    this();
    setWidth(width);
    setHeight(height);
}

public double getWidth(){
    return width;
}

public void setWidth(double height){
    if(width <= 0) {
        throw new IllegalArgumentException("Height must be greater than zero!");
    }
    this.height=height;
}

public double getHeight(){
    return height;
}

public void setHeight(double height){
    if(height <= 0){
        throw new IllegalArgumentException("Height must be greater than zero!");
    }
    this.height=height;
}

public double area(){
    return height * width;
}

public double perimeter(){
    return 2*(height + width);
}

public String toString(){
    return "Class_restangele{" +
            "id=" +id +
            ", width=" + width +
            ", height=" + height +
            '}';
}

}
