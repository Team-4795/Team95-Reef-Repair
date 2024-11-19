package frc.robot.subsystems;


import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.PWMTalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drive extends SubsystemBase {
    private PWMTalonSRX leftDriveMotor = new PWMTalonSRX(0); //change the number
    private PWMTalonSRX rightDriveMotor = new PWMTalonSRX(1); //change the number
    private DifferentialDrive drive = new DifferentialDrive(leftDriveMotor,rightDriveMotor);
    public Drive() {

    }
    public void arcadeDrive(double speed, double rotation){
        drive.arcadeDrive(speed, rotation);
        
    }
}
