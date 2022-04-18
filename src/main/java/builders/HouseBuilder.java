package builders;

import house.House;
import parts_house.Door;
import parts_house.Roof;
import parts_house.Walls;
import parts_house.Windows;

public class HouseBuilder implements Builder{
    private Walls walls;
    private Roof roof;
    private Windows windows;
    private Door door;
    private boolean garage;
    private boolean pool;
    private int countFlor;

    @Override
    public void setWalls(Walls walls) {
        this.walls = walls;
    }

    @Override
    public void setRoof(Roof roof) {
        this.roof = roof;
    }

    @Override
    public void setWindows(Windows windows) {
        this.windows = windows;
    }

    @Override
    public void setDoor(Door door) {
        this.door = door;
    }

    @Override
    public void setGarage(boolean garage) {
        this.garage = garage;
    }

    @Override
    public void setPoll(boolean pool) {
        this.pool = pool;
    }

    @Override
    public void setCountFlor(int countFlor) {
        this.countFlor = countFlor;
    }

    public House getResult() {
        return new House(walls, roof, windows, door, garage, pool, countFlor);
    }

}
