package com.stuypulse.robot.commands;

import com.stuypulse.robot.util.Motor;

public class DriveFunctions {
    
    public static void driveForwards(Motor left, Motor right) {
        left.set(1.0);
        right.set(1.0);
    }

    public static void driveBackwards(Motor left, Motor right) {
        left.set(-1.0);
        right.set(-1.0);
    }

    public static void stop(Motor left, Motor right) {
        left.set(0.0);
        right.set(0.0);
    }

    public static void turnRight(Motor left, Motor right) {
        left.set(1.0);
        right.set(-1.0);
    }

    public static void turnLeft(Motor left, Motor right) {
        left.set(-1.0);
        right.set(1.0);
    }

    public static void arcRight(Motor left, Motor right) {
        left.set(1.0);
        right.set(0.75);
    }

    public static void arcLeft(Motor left, Motor right) {
        left.set(0.75);
        right.set(1.0);
    }

    public static void stopDistance(Motor left, Motor right) {
        double stopPoint = 60.0;
        if (right.getDistance() < stopPoint){
            driveForwards(left, right);
        } else {
            stop(left, right);
        }
    }

    public static void bangBang(Motor left, Motor right) {
        double stopPoint = 60.0;
        if (right.getDistance() < stopPoint){
            driveForwards(left, right);
        }
        if (right.getDistance() > stopPoint){
            driveBackwards(left, right);
        }
    }

    public static void lessBang(Motor left, Motor right) {
        double stopPoint = 60.0;
        if (right.getDistance() < stopPoint){
            left.set(0.5);
            right.set(0.5);
        }
        if (right.getDistance() > stopPoint){
            left.set(-0.5);
            right.set(-0.5);
        }
    }

    public static void betterControl(Motor left, Motor right) {}

    public static void bestestControl(Motor left, Motor right) {}
}
