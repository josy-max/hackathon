package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "HackAThonTeleOp", group = "TeleOp")
public class HackAThonTeleOp extends LinearOpMode{

    double rightPower;
    double leftPower;
    double forward;
    double rotate;

    @Override
    public void runOpMode() throws InterruptedException {
        HackAThonDriveTrain paintDrivetrain = new HackAThonDriveTrain(hardwareMap);
        waitForStart();
        while (opModeIsActive() && !isStopRequested()) {
            forward = -gamepad1.left_stick_y;
            rotate = gamepad1.right_stick_x;
            leftPower = forward - rotate;
            rightPower = forward + rotate;
            paintDrivetrain.setWheelPower(rightPower, leftPower);




        }

    }
}
