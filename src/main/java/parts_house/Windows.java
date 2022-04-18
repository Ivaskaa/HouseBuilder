package parts_house;

public class Windows {
    private int height;
    private int width;
    private Material material;

    public Windows (int height, int width, Material material){
        this.height = height;
        this.width = width;
        this.material = material;
    }

    public String getInfo(){
        String info = "Windows - height: " + height + " width: " + width + " material: " + material + "\n";
        return info;
    }
}
