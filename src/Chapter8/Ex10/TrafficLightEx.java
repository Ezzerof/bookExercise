/*
8.10. Write an enum type TrafficLight, whose constants (RED, GREEN, YELLOW) take one parameter—
the duration of the light. Write a program to test the TrafficLight enum so that it displays the
enum constants and their durations.
 */
package Chapter8.Ex10;

public enum TrafficLightEx {
    RED(3),
    GREEN(3),
    YELLOW(1);
    

    private int duration;

    TrafficLightEx(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }
}


