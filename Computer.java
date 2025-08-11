public class Computer extends Device{
    int ram;
    int Storage;
    public Computer(String model,String brand,int ram,int Storage){
        super(brand,model);
        this.ram = ram;
        this.Storage = Storage;
    }
    public void display(){
        super.display();
        System.out.println("Ram: " + ram);
        System.out.println("Storage: " + Storage);
    }
}
