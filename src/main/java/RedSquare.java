
public class RedSquare extends Square {

    public RedSquare(float height) {
        super(height, "RED");
    }

    public void draw() {
        System.out.println("Dentro de Triangulo " + getColor()
                + " de altura " + getHeight() + " no método draw()");
    }

}
