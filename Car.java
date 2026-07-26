public class Car {
   public static void main(String[] args) {
    
   }
    // Attributes
    private String paintColor;
    private int currentSpeed;
    private boolean isEngineRunning;
    private boolean leftSignal;
    private boolean rightSignal;

    // Constructor
    public Car() {
        paintColor = "White";
        currentSpeed = 0;
        isEngineRunning = false;
        leftSignal = false;
        rightSignal = false;
    }

    // Set paint color
    public void setPaintColor(String paintColor) {
        this.paintColor = paintColor;
    }

    // Start engine
    public void start() {
        isEngineRunning = true;
        System.out.println("Car engine is now ON.");
    }

    // Stop engine
    public void stop() {
        isEngineRunning = false;
        currentSpeed = 0;
        System.out.println("Car engine is now OFF.");
    }

    // Increase speed
    public void increaseSpeed() {
        if (isEngineRunning) {
            currentSpeed += 10;
            System.out.println("Speed increased.");
        } else {
            System.out.println("Please start the engine first.");
        }
    }

    // Apply brake
    public void applyBrake() {
        if (currentSpeed >= 10) {
            currentSpeed -= 10;
        } else {
            currentSpeed = 0;
        }

        System.out.println("Brake applied.");
    }

    // Left signal
    public void leftSignalOn() {
        leftSignal = true;
        rightSignal = false;
        System.out.println("Left signal is ON.");
    }

    // Right signal
    public void rightSignalOn() {
        rightSignal = true;
        leftSignal = false;
        System.out.println("Right signal is ON.");
    }

    // Turn off signals
    public void signalsOff() {
        leftSignal = false;
        rightSignal = false;
        System.out.println("All signals are OFF.");
    }

    // Display details
    public void displayStatus() {
        System.out.println("\n===== Vehicle Status =====");
        System.out.println("Paint Color     : " + paintColor);
        System.out.println("Current Speed   : " + currentSpeed + " km/h");
        System.out.println("Engine Status   : " + (isEngineRunning ? "ON" : "OFF"));
        System.out.println("Left Signal     : " + (leftSignal ? "ON" : "OFF"));
        System.out.println("Right Signal    : " + (rightSignal ? "ON" : "OFF"));
    }
}