class Bike {
    int speedlimit = 60;

    public void run() {
        System.out.println("Bike speed limit is " + speedlimit + " km/h");
    }
}

class Splendar extends Bike {
    int speedlimit = 80;

    
    public void run() {
        System.out.println("Splendar speed limit is " + speedlimit + " km/h");
    }
}

public class Bikes {
    public static void main(String[] args) {
        Bike bike = new Splendar(); // Upcasting

        
        bike.run();
        
        // Access data members
        System.out.println("speedlimit from Bike class: " + bike.speedlimit);
        System.out.println("speedlimit from Splendar class: " + ((Splendar) bike).speedlimit);
    }
}
