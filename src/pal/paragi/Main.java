package pal.paragi;

public class Main {

    public static void main(String[] args) {

        Floor floor = new Floor(5,4);
        Carpet carpet = new Carpet(400);
        Calculator calculator = new Calculator(floor,carpet);

        System.out.println("area = " + floor.getArea());
        System.out.println("cost = " + carpet.getCost());
        System.out.println("calculator = " + calculator.getTotalCost());
    }

}
