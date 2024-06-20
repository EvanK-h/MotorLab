package com.stuypulse.robot.commands;

import com.stuypulse.robot.util.Motor;

public class DriveFunctions {
    
    public static void driveForwards(Motor left, Motor right) {
        double leftSpeed = .49;
        double rightSpeed = .5;
        double epsilon = .01;

        if(left.getSpeed() > right.getSpeed() + epsilon) {
            leftSpeed -= epsilon;
            rightSpeed += epsilon;
        } else if(right.getSpeed() > left.getSpeed() + epsilon) {
            leftSpeed += epsilon;
            rightSpeed -= epsilon;
        }

        left.set(leftSpeed);
        right.set(rightSpeed);
    }

    public static void driveBackwards(Motor left, Motor right) {
        double leftSpeed = -.5;
        double rightSpeed = -.48;
        double epsilon = -.01;

        if(-left.getSpeed() > -(right.getSpeed()+epsilon)) {
            leftSpeed += epsilon;
            rightSpeed -= epsilon;
        } else if(-right.getSpeed() > -(left.getSpeed()+epsilon)) {
            leftSpeed += epsilon;
            rightSpeed -= epsilon;
        }

        left.set(leftSpeed);
        right.set(rightSpeed);
    }

    public static void turnRight(Motor left, Motor right) {
        left.set(1);
        right.set(-1);
    }

    public static void turnLeft(Motor left, Motor right) {
        left.set(-1);
        right.set(1);
    }

    public static void arcRight(Motor left, Motor right) {
        left.set(1);
        right.set(0.5);
    }

    public static void arcLeft(Motor left, Motor right) {
        left.set(0.5);
        right.set(1);
    }

}
