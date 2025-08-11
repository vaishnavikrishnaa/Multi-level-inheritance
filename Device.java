public class Device {
    String model;
    String brand;

    public Device(String model,String brand){
        this.brand = brand;
        this.model = model;
    }
    public void display(){
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
}
