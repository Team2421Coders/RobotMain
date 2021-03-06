// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc2421.Minotaur;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController leftMotor1;
    public static SpeedController leftMotor2;
    public static SpeedController rightMotor1;
    public static SpeedController rightMotor2;
    public static SpeedController intakeCANJaguar1;
    public static DoubleSolenoid doubleSolenoid1;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
    	/**Drive motors:
    	 * Left Motor 1 - talon port 2
    	 * Left Motor 2 - talon port 4
    	 * Right Motor 1 - talon port 1
    	 * Right Motor 2 - talon port 3
    	 * 
    	 * Ball Intake:
    	 * Intake Motor - Spark port 0
    	 * 
    	 * Pneumatics:
    	 * Lift Solenoid - Ports 0 and 1
    	 */
    	
    	
    	
    	
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        
        leftMotor1 = new Talon(2);
        LiveWindow.addActuator("Motors", "leftMotor1", (Spark) leftMotor1);
        
        leftMotor2 = new Talon(4);
        LiveWindow.addActuator("Motors", "leftMotor2", (Spark) leftMotor2);
        
        rightMotor1 = new Talon(1);
        LiveWindow.addActuator("Motors", "rightMotor1", (Spark) rightMotor1);
        
        rightMotor2 = new Talon(3);
        LiveWindow.addActuator("Motors", "rightMotor2", (Spark) rightMotor2);
        
        doubleSolenoid1 = new DoubleSolenoid(0, 1);
        LiveWindow.addActuator("Pneumatics", "Double Solenoid 1", doubleSolenoid1);
        
        intakeCANJaguar1 = new Spark(0);
        

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
