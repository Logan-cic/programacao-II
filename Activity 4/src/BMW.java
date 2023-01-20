import java.util.Scanner;

class BMW extends Car {
    Scanner enter = new Scanner(System.in);

    public BMW(float maxSpeed) {
        super(maxSpeed);
    }

    @Override
    public void acelerate() {
        if(speed >= MaxSpeed){
            System.out.println("You reached the maximum speed of"+MaxSpeed);
            return;
        }
        speed += 5;
        System.out.println("current speed "+speed+"Km/h");  
    }

    public static void main(String[] args) {
        BMW carro = new BMW(20);
        carro.acelerate();
        carro.acelerate();
        carro.acelerate();
        carro.acelerate();
        carro.acelerate();
    }

}
