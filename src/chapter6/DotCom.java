package chapter6;

import java.util.ArrayList;

public class DotCom {

    private ArrayList<String> locationCells;
    private String name;

    public void setLocationCells(ArrayList<String> locations) {
        locationCells = locations;
    }

    public void setName(String n) {
        name = n;
    }

    public String checkYourself(String stringGuess) {
        int index = locationCells.indexOf(stringGuess);
        String result = "miss";

        if (index >= 0) {
            locationCells.remove(index);

            if (locationCells.isEmpty()) {
                result = "kill";
                System.out.println("Ouch! You sunk " + name + "   : (");
            } else {
                result = "hit";
            }
        }

        return result;
    }
}

