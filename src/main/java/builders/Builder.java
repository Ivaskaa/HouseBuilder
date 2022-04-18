package builders;


import parts_house.Door;
import parts_house.Roof;
import parts_house.Walls;
import parts_house.Windows;

public interface Builder {
    void setWalls(Walls walls);
    void setRoof(Roof roof);
    void setWindows(Windows windows);
    void setDoor(Door door);
    void setGarage(boolean garage);
    void setPoll(boolean pool);
    void setCountFlor(int countFlor);
}
