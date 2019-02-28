/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.robot.commands.elevator.MoveElevator;
import frc.robot.commands.lifter.LiftRobot;

public class AutoLiftRobot extends CommandGroup {
  /**
   * Add your docs here.
   */
  public AutoLiftRobot(double elevatorDownPower)
  {
    addParallel(new LiftRobot());
    //addSequential(new MoveElevator(elevatorDownPower));
  }
}
