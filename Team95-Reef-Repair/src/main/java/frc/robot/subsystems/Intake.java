package frc.robot.subsystems;
import edu.wpi.first.wpilibj.motorcontrol.PWMTalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Intake extends SubsystemBase {
    private PWMTalonSRX leftmotor = new PWMTalonSRX(1); //change the number
    private PWMTalonSRX rightmotor = new PWMTalonSRX(2);//change the number
    public Intake(){
       leftmotor.addFollower(rightmotor);
    }
    public void motorForward(){
        leftmotor.set(0.5); //change number to actual speed
    }
    public void motorBackward() {
        leftmotor.set(-0.5); //change number to acutal speed
    }
    public void stopMotor() {
        leftmotor.set(0);
    }
}