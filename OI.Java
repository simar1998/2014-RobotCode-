
package edu.wpi.first.wpilibj.templates;
import edu.wpi.first.wpilibj.Joystick;
public class OI {
    
   public final Joystick JOYSTICK = new Joystick (1);
    public static final int SPEED = 2;
    public static final int ROTATION = 3;
    public static final int SHOOT_BALL = 6;
    public static final int PICKUP_BALL = 5;
    public static final int OVERIDE_BUTTON = 9;
    public static final int PULLBACK_WINCH =7;
    public static final int SHIFT_GEAR = 1;
   
    public double speedAxis () {
        double speed = JOYSTICK.getRawAxis(SPEED);
        return speed;
    }
    
    public double rotationAxis () {
        double rotation = JOYSTICK.getRawAxis(ROTATION);
        return rotation;
    }
    
    public boolean shootTheBall (){
        boolean shootBall = JOYSTICK.getRawButton(SHOOT_BALL);
        return shootBall;
    }
    
    public boolean pickUpBall () {
        boolean pickUp = JOYSTICK.getRawButton(PICKUP_BALL);
        return pickUp;
    }
    public boolean overRideButton (){
        boolean overRide = JOYSTICK.getRawButton(OVERIDE_BUTTON);
        return overRide;
    }
    public boolean winchMechanism (){
        boolean winch = JOYSTICK.getRawButton(PULLBACK_WINCH);
        return winch;
    }
    public boolean pnematicShift (){
        boolean gearShift = JOYSTICK.getRawButton(SHIFT_GEAR);
        return gearShift;
    }
    
    
 
    
    }


