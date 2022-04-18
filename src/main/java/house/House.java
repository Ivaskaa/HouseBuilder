package house;

import parts_house.Door;
import parts_house.Roof;
import parts_house.Walls;
import parts_house.Windows;

public class House {
    private Walls walls;
    private Roof roof;
    private Windows windows;
    private Door door;
    private boolean garage;
    private boolean pool;
    private int countFlor;

    public House(Walls walls, Roof roof, Windows windows, Door door, boolean garage, boolean pool, int countFlor){
        this.walls = walls;
        this.roof = roof;
        this.windows = windows;
        this.door = door;
        this.garage = garage;
        this.pool = pool;
        this.countFlor = countFlor;
    }

    public Walls getWalls(){
        return walls;
    }

    public Roof getRoof(){
        return roof;
    }

    public Windows getWindows(){
        return windows;
    }

    public Door getDoor(){
        return door;
    }

    public boolean getGarage(){
        return garage;
    }

    public boolean getPool(){
        return pool;
    }

    public int getCountFlor(){
        return countFlor;
    }

    public String getInfo(){
        String info = "";
        info += "\nHouse: this house have " + countFlor + " flor\n";
        info += walls.getInfo() + roof.getInfo() + windows.getInfo() + door.getInfo();
        if(garage){
            info += "This house have a garage \n";
        } else {
            info += "This house do`nt have a garage \n";
        }
        if(pool){
            info += "This house have a pool \n";
        }else {
            info += "This house do`nt have a pool \n";
        }
        return info;
    }

}
