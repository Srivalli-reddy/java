package test;

class Airplane {
    String flightNum, destination, departureTime;
    boolean isDelayed;

    public Airplane(String flightNum, String destination, String departureTime) {
        this.flightNum = flightNum;
        this.destination = destination;
        this.departureTime = departureTime;
    }

    public void checkFlight() {
        System.out.println("The plane " + flightNum + " to " + destination + (isDelayed ? " is delayed." : " is on time."));
    }

    public void setDelay(String newTime) {
        departureTime = newTime;
        isDelayed = true;
        System.out.println("Delayed. New time: " + newTime);
    }

    public void displayDetails() {
        System.out.println("Flight: " + flightNum + ", Destination: " + destination + ", Time: " + departureTime + ", Delayed: " + isDelayed);
    }

    public static void main(String[] args) {
        Airplane flight1 = new Airplane("PR34E", "VIZAG", "10:20 PM");
        flight1.checkFlight();
        flight1.setDelay("7:00 AM");
        flight1.checkFlight();
        flight1.displayDetails();
    }
}
