package Model;

public class Team {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJersey_colour() {
        return jersey_colour;
    }

    public void setJersey_colour(String jersey_colour) {
        this.jersey_colour = jersey_colour;
    }

    public int getFifa_position() {
        return fifa_position;
    }

    public void setFifa_position(int fifa_position) {
        this.fifa_position = fifa_position;
    }

    public Team(String name, String jersey_colour, int fifa_position) {
        this.name = name;
        this.jersey_colour = jersey_colour;
        this.fifa_position = fifa_position;
    }

    public Team(int fifa_position) {
        this.fifa_position = fifa_position;
    }

    String jersey_colour;
    int fifa_position;
}
