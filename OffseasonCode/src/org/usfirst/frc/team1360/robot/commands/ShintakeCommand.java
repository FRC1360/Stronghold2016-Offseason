package org.usfirst.frc.team1360.robot.commands;

import org.usfirst.frc.team1360.robot.OI;
import org.usfirst.frc.team1360.robot.util.Subsystems;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ShintakeCommand extends Command {

    public ShintakeCommand() {
        requires(Subsystems.SHINTAKE_SUBSYSTEM);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Subsystems.SHINTAKE_SUBSYSTEM.intakeOutake(OI.getOperatorIntake());
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
