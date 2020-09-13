
public class Main {

    public static void main(String[] args) {
        // you can write code here to try out your program
        Apartment manhattanStudioApt = new Apartment(1, 16, 5500);
        Apartment atlantaTwoBedroomApt = new Apartment(2, 38, 4200);
        Apartment bangorThreeBedroomApt = new Apartment(3, 78, 2500);
  
        System.out.println("Manhattan bigger than Atlanta? " + manhattanStudioApt.largerThan(atlantaTwoBedroomApt));
        System.out.println("Bangor bigger than Atlanta? " + bangorThreeBedroomApt.largerThan(atlantaTwoBedroomApt));
        System.out.println("");
        System.out.println("Cost difference between Manhattan and Atlanta: $" + manhattanStudioApt.priceDifference(atlantaTwoBedroomApt));
        System.out.println("Cost difference between Bangor and Atlanta: $" + bangorThreeBedroomApt.priceDifference(atlantaTwoBedroomApt));
        System.out.println("");
        System.out.println("Manhattan more expensive than Atlanta? " + manhattanStudioApt.moreExpensiveThan(atlantaTwoBedroomApt));
        System.out.println("Bangor more expensive than Atlanta? " + bangorThreeBedroomApt.moreExpensiveThan(atlantaTwoBedroomApt));
    }
}
