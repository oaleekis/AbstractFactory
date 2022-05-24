
public class Principal {

    public static void main(String[] args) {
        //Cria a fábrica de métodos para shape blue
        AbstractFactory shapeBlueFactory = FactoryProducer.getFactory("BLUE");

        //Pega um objeto círculo
        Shape shape1 = shapeBlueFactory.getCircle(1);

        //Chama o método draw do círculo
        shape1.draw();

        //pega um objeto retángulo
        Shape shape2 = shapeBlueFactory.getRectangle(2);

        //Chama o método draw do retángulo
        shape2.draw();

        //Pega um objeto triângulo
        Shape shape3 = shapeBlueFactory.getSquare(3);

        //Chama o método draw do triângulo
        shape3.draw();

        //Cria a fábrica de métodos para shape red
        AbstractFactory shapeRedFactory = FactoryProducer.getFactory("RED");

        //Pega um objeto círculo
        Shape shape4 = shapeRedFactory.getCircle(4);

        //Chama o método draw do círculo
        shape4.draw();

        //pega um objeto retángulo
        Shape shape5 = shapeRedFactory.getRectangle(5);

        //Chama o método draw do retángulo
        shape5.draw();

        //Pega um objeto triângulo
        Shape shape6 = shapeRedFactory.getSquare(6);

        //Chama o método draw do triângulo
        shape6.draw();
    }

}
