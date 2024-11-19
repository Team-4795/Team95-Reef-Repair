package frc.robot.subsystems;
import edu.wpi.first.wpilibj.motorcontrol.PWMTalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Intake extends SubsystemBase {
    private PWMTalonSRX intakeMotor = new PWMTalonSRX(3); //change the number
    
    public Intake(){
    
    }
    public void motorForward(){
        intakeMotor.set(0.5); //change number to actual speed
    }
    public void motorBackward() {
        intakeMotor.set(-0.5); //change number to acutal speed
    }
    public void stopMotor() {
        intakeMotor.set(0);
    }
}