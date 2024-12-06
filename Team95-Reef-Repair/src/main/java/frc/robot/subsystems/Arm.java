package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.PWMTalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Arm extends SubsystemBase{
    private PWMTalonSRX armMotor = new PWMTalonSRX(2); //change the number
    public Arm(){

    }
    public void armUp(){
        armMotor.set(0.3); //change the number
    }
    public void armDown(){
        armMotor.set(-0.3); //change the number
    }
    public void armStop(){
        armMotor.set(0);
    }
}