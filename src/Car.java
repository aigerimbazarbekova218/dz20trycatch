public class Car implements AutoCloseable {
    public void drive(){
        System.out.println("Mашина журуп жатат");
    }
    public void close(){
        System.out.println("Машина жабылып жатат");
    }
}
