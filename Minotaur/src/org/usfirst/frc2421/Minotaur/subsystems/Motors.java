// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc2421.Minotaur.subsystems;

import org.usfirst.frc2421.Minotaur.RobotMap;
import org.usfirst.frc2421.Minotaur.commands.*;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;

import edu.wpi.first.wpilibj.command.Subsystem;


/**Drive subsystem
 * Includes commands for changing the speeds of the left and right side motors together
 */
public class Motors extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final SpeedController leftMotor1 = RobotMap.leftMotor1;
    private final SpeedController leftMotor2 = RobotMap.leftMotor2;
    private final SpeedController rightMotor1 = RobotMap.rightMotor1;
    private final SpeedController rightMotor2 = RobotMap.rightMotor2;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS


    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND


        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }
    public void setLeftMotors(double speed){
    	leftMotor1.set(speed);
    	leftMotor2.set(speed);
    }
    public void setRightMotors(double speed){
    	rightMotor1.set(speed);
    	rightMotor2.set(speed);
    }
}

