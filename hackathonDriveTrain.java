package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class HackAThonDriveTrain {

    public CRServo RightWheel;
    public CRServo LeftWheel;
    public HackAThonDriveTrain(HardwareMap hardwareMap) {
        RightWheel = hardwareMap.get(CRServo.class,"RightWheel");
        LeftWheel = hardwareMap.get(CRServo.class,"LeftWheel");

        RightWheel.setDirection(CRServo.Direction.FORWARD);
        LeftWheel.setDirection(CRServo.Direction.REVERSE);


    }

    public void setWheelPower(double right, double left) {
        RightWheel.setPower(right);
        LeftWheel.setPower(left);



    }
}
