public class RobotContainer {
    //subsystems
    private final Drivetrain m_drivetrain = new Drivetrain();
    private final Shooter m_shooter = new Shooter();
    
    //controller
    Joystick m_controller = new Joystick(0);

    public RobotContainer() {
        configureBindings();
    }
    
    //define trigger command mappings
    private void configureBindings() {

    }
}