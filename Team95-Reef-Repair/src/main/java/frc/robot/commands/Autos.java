// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.Arm;
import frc.robot.subsystems.Drive;
import frc.robot.subsystems.ExampleSubsystem;
import frc.robot.subsystems.Intake;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;

public final class Autos {
  /** Example static factory for an autonomous command. */
  public static Command exampleAuto(ExampleSubsystem m_exampleSubsystem) {
    return Commands.sequence(m_exampleSubsystem.exampleMethodCommand(), new ExampleCommand(m_exampleSubsystem));

  }

  public static Command dropAuto(Arm arm, Drive drive, Intake intake){
    return Commands.sequence(
      Commands.run(()->arm.armUp()),
      Commands.waitSeconds(2), //Change the time
      Commands.run(()->arm.armStop()),
      Commands.run(()->intake.motorForward()),
      Commands.waitSeconds(1),//change time
      Commands.run(()->intake.stopMotor()), 
      Commands.parallel(Commands.run(()-> arm.armDown()),Commands.run(()->drive.arcadeDrive(0.5,0))),
      Commands.waitSeconds(2),
      Commands.run(()->arm.armStop()),
      Commands.run(()->intake.motorBackward()),
      Commands.waitSeconds(2),
      Commands.parallel(Commands.run(()->arm.armStop()),Commands.run(()->drive.arcadeDrive(0,0)))
      //How are we going to end this, do we have to end? since it will switch to teleop
      
          );
  }





  public static Command deezballs(Arm arm,Drive drive, Intake intake){
   return Commands.sequence(
   Commands.run(()->arm.armDown()),
   Commands.waitSeconds(2),
   Commands.run(() -> arm.armStop()),
   Commands.run(()-> intake.motorForward()),
   Commands.waitSeconds(1),
   Commands.run(() -> intake.stopMotor()));
  }
  public static Command taxiAuto(Drive drive) {
    return Commands.sequence(
      Commands.run(() -> drive.arcadeDrive(0.5, 0)), 
      Commands.waitSeconds(2), 
      Commands.run( () -> drive.arcadeDrive(0,0)));
  }

  public static Command ThomasAuto(Arm arm, Drive drive, Intake intake){
    return Commands.sequence();
  }
  public static Command thomasAuto(Arm arm, Drive drive, Intake intake){
    return Commands.sequence();
  }
  private Autos() {
    throw new UnsupportedOperationException("This is a utility class!");
  }
}
