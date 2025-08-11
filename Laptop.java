public class Laptop extends Computer{
    int screenSize;
    int weight;

    public Laptop(String model,String brand,int ram,
                  int Storage,int screenSize,int weight){
        super(model,brand,ram,Storage);
        this.weight = weight;
        this.screenSize = screenSize;
    }
    public void display(){
        super.display();
        System.out.println("Weight: "+weight);
        System.out.println("Screen Size: "+screenSize);
    }
}
