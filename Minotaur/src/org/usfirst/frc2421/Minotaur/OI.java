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

import org.usfirst.frc2421.Minotaur.commands.ballIn;
import org.usfirst.frc2421.Minotaur.commands.ballOut;
import org.usfirst.frc2421.Minotaur.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc2421.Minotaur.subsystems.*;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.

    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:

    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());

    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());

    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());


    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public Joystick stick;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    JoystickButton outBtn;
    JoystickButton inBtn;
    JoystickButton solReverse;
    JoystickButton solOff;
    JoystickButton solForward;

    public OI() {
    	/**Ball Intake
    	 * Launch Ball - Joystick 0 button 1
    	 * Bring in - Joystick 0 button 2
    	 * 
    	 * Pneumatics
    	 * Solenoid Push Out - Joystick 0 button 5
    	 * Solenoid Pull in - Joystick 0 button 3
    	 * Solenoid stop - Joystick 0 button 4
    	 */
    	
    	
    	
    	
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    	
        stick = new Joystick(0);
        
        //ball intake
        outBtn = new JoystickButton(stick, 1);
        outBtn.whileHeld(new ballOut());
        inBtn = new JoystickButton(stick, 2);
        inBtn.whileHeld(new ballIn());
        
        //pneumatics
        solReverse = new JoystickButton(stick, 4);
        solReverse.whenPressed(new SolenoidIn());
        solOff = new JoystickButton(stick, 3);
        solOff.whenPressed(new SolenoidOut());
        solForward = new JoystickButton(stick, 5);
        solForward.whenPressed(new SolenoidOut());
        
        // SmartDashboard Buttons
        SmartDashboard.putData("Autonomous Command", new AutonomousCommand());
        SmartDashboard.putData("Drive", new Drive());

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getstick() {
        return stick;
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}

