package parts_house;

public class Roof {
    private int height;
    private int width;
    private int length;
    private Material material;

    public Roof (int height, int width, int length, Material material){
        this.height = height;
        this.width = width;
        this.length = length;
        this.material = material;
    }

    public String getInfo(){
        String info = "Roof - height: " + height + " width: " + width + " length: " + length + " material: " + material + "\n";
        return info;
    }
}
