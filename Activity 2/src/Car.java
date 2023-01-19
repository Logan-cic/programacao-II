import java.util.Scanner;

/**
 * Exercicio do dia: 17/01
 * Forneça a implementação de dois novos métodos na classe carro: abastecer() e
 * tocarMusica(). Para cada novo método, criem as variáveis necessarias.
 * Crie novos objetos com base na mesma classe Carro. Estude onde esses objetos
 * estão sendo armazenados.
 */
public class Car {
    private int enginePower;
    private int speed;
    private String music;
    private boolean soundBox = false;
    private float fuelLiters;
    Scanner enter = new Scanner(System.in);

    public Car(int enginePower) {
        this.enginePower = enginePower;
        this.speed = 10;
    }

    public void accelerate() {
        if(fuelLiters > 0){
            speed += enginePower;
            fuelLiters -= 0.5;
        }
    }

    public void slowDown() {
        speed *= 0.5;
    }

    public int speed() {
        return speed;
    }

    public void toFuel() {
        if (fuelLiters == 0) {
           fuelLiters += 1;
            
        }
    }

    public void playMusic() {
        if (soundBox == false) {
            System.out.println("Turning on sound box...");
            this.soundBox = true;
            playMusic();
            return;
        }
        System.out.println("What song do you want to listen now");
        music = enter.nextLine();
        System.out.println("You are listening now " + music);
    }

    public static void main(String[] args) {
        // como eu faço para instanciar a classe?
        // muito facil: use o new
       
        Car onix = new Car(60); 
        onix.toFuel();
        System.out.println("Your fuel level "+onix.fuelLiters);
        onix.accelerate();
        System.out.println("Your speed now "+onix.speed);
        onix.slowDown();
        System.out.println(onix.speed);
        System.out.println("Your fuel level "+onix.fuelLiters);
        onix.playMusic();   
    }
}
