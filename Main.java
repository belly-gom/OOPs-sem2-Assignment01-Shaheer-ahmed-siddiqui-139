public class Main {

    public static void main(String[] args) {

        Car carObj = new Car();

        carObj.setPaintColor("Black");

        carObj.displayStatus();

        carObj.start();

        carObj.increaseSpeed();
        carObj.increaseSpeed();

        carObj.leftSignalOn();

        carObj.displayStatus();

        carObj.applyBrake();

        carObj.signalsOff();

        carObj.stop();

        carObj.displayStatus();
    }
}