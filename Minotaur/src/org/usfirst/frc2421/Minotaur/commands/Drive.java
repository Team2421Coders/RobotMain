// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc2421.Minotaur.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.CANTalon;

import org.usfirst.frc2421.Minotaur.subsystems.Motors;
import org.usfirst.frc2421.Minotaur.OI;
import org.usfirst.frc2421.Minotaur.Robot;
import org.usfirst.frc2421.Minotaur.subsystems.Motors;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**Controls drive by executing continuously
 * Loops here instead of in teleop periodic
 * 
 * Kinda sorta-
 * X axis of joystick controls power - forward or reverse
 * Y axis of joystick controls turn angle - modifies power of the left and right sides
 */
public class Drive extends Command {
	Joystick stick = Robot.oi.stickDrive;
	double deadzone = .2;
	double x = 0;
	double y = 0;
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS
 
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
    public Drive() {
    	requires(Robot.motors);
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	deadzone = .2;
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if(stick.getX() < -deadzone || stick.getX() > deadzone){
    		x = stick.getX();
    	}else{
    		x = 0;
    	}
    	if(stick.getY() < -deadzone || stick.getY() > deadzone){
    		y = -(stick.getY());
    	}else{
    		y = 0;
    	}
    	
		SmartDashboard.putNumber("X Value:", x);
    	SmartDashboard.putNumber("Y Value:", y);
    	
    	Motors.setLeft(y+x);
    	Motors.setRight(y-x); 
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
