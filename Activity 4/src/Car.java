public abstract class Car {
    protected float MaxSpeed;
    protected int speed;

    public Car( float MaxSpeed ) {
        setMaxSpeed( MaxSpeed );
    }

    public void setMaxSpeed( float MaxSpeed ) {
        this.MaxSpeed = MaxSpeed;
    }

    public float getMaxSpeed() {
        return MaxSpeed;
    }

    public abstract void acelerate( );

}