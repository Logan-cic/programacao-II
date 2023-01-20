class Fusca extends Car{
    
    public Fusca(float MaxSpeed) {
        super(MaxSpeed);
    
    }

    @Override
    public void acelerate() {
        if(speed >= MaxSpeed){
            System.out.println("You reached the maximum speed of "+MaxSpeed);
            return;
        }
        speed += 2;
        System.out.println("current speed "+speed+"Km/h");  
    }

    public static void main(String[] args) {
        Fusca carro = new Fusca(10);
        carro.acelerate();
        carro.acelerate();
        carro.acelerate();
        carro.acelerate();
        carro.acelerate();
        carro.acelerate();
    }
    
}
