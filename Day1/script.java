package Day1; // Declaring where the JAVA code is entered

class Bicycle { // Declaring and creating a class for Bicycle where the information will be placed

     int cadence = 0; // Placing 3 attributes with each having its value which is an integer
     int speed = 0;
     int gear = 1;

     void changeCadence(int newValue) { // Working with methods where each method has its own function that can be called by an object of type "Bicycle"
          cadence = newValue; // changeCadence takes a new cadence value as a parameter and updates the "cadence" attribute as a "Bicycle" object
     }

     void changeGear(int newValue) {
          gear = newValue;
     }

     void speedUp(int increment) {
          speed = speed + increment;
     }

     void applyBrakes(int decrement) {
          speed = speed - decrement;
     }

     void printStates() { // Prints the current state of the "Bycycle" object
          System.out.println("cadence:" + // displays information about cadence defined above as well as speed and gait of the object
              cadence + " speed:" +
              speed + " gear:" + gear);
     }
     public static void main(String[] args) {
         Bicycle bike = new Bicycle(); // Methods called to change the attribute and show what was converted as defined above

         bike.changeCadence(50);
         bike.speedUp(10);
         bike.changeGear(2);
         bike.printStates(); //Calls objects and displays updated information
     }
}

/*
  * In summary, the Java code will define the "Bycycle" class with attributes and methods that
  * to allow manipulation and display of information about the bike
  * The "main" method can be used to test the class and see how it works
  */