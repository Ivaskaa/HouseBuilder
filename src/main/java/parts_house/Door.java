package parts_house;

public class Door {
    private int height;
    private int width;
    private Material material;

    public Door (int height, int width, Material material){
        this.height = height;
        this.width = width;
        this.material = material;
    }

    public String getInfo(){
        String info = "Door - height: " + height + " width: " + width + " material: " + material + "\n";
        return info;
    }
}
