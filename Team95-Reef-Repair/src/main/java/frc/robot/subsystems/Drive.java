package frc.robot.subsystems;


import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.PWMVictorSPX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drive extends SubsystemBase {
    private PWMVictorSPX leftDriveMotor = new PWMVictorSPX(1); //change the number
    private PWMVictorSPX rightDriveMotor = new PWMVictorSPX(2); //change the number
    private DifferentialDrive drive = new DifferentialDrive(leftDriveMotor,rightDriveMotor);
    public Drive() {

    }
    public void arcadeDrive(double speed, double rotation){
        drive.arcadeDrive(speed, rotation);
        
    }
}
