/************************ PROJECT PHIL ************************/
/* Copyright (c) 2022 StuyPulse Robotics. All rights reserved.*/
/* This work is licensed under the terms of the MIT license.  */
/**************************************************************/

package com.stuypulse.robot;

import com.stuypulse.robot.commands.DriveFunctions;
import com.stuypulse.robot.commands.MotorCommand;
import com.stuypulse.robot.subsystems.Robot;
import com.stuypulse.robot.subsystems.Romi;

import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;

public class RobotContainer {

    private Robot robot = new Romi();

    // Autons
    private static SendableChooser<Command> autonChooser = new SendableChooser<>();

    // Robot container

    public RobotContainer() {
        configureDefaultCommands();
        configureButtonBindings();
        configureAutons();
    }

    /****************/
    /*** DEFAULTS ***/
    /****************/

    private void configureDefaultCommands() {}

    /***************/
    /*** BUTTONS ***/
    /***************/

    private void configureButtonBindings() {}

    /**************/
    /*** AUTONS ***/
    /**************/

    public void configureAutons() {
        autonChooser.setDefaultOption("Drive Forwards", new MotorCommand(robot, DriveFunctions::driveForwards));
        autonChooser.addOption("Drive Backwards", new MotorCommand(robot, DriveFunctions::driveBackwards));
        autonChooser.addOption("Turn Right", new MotorCommand(robot, DriveFunctions::turnRight));
        autonChooser.addOption("Turn Left", new MotorCommand(robot, DriveFunctions::turnLeft));
        autonChooser.addOption("Arc Right", new MotorCommand(robot, DriveFunctions::arcRight));
        autonChooser.addOption("Arc Left", new MotorCommand(robot, DriveFunctions::arcLeft));

        SmartDashboard.putData("Autonomous", autonChooser);
    }

    public Command getAutonomousCommand() {
        return autonChooser.getSelected();
    }
}
