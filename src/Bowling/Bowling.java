package Bowling;

import java.util.HashMap;

public class Bowling {
    HashMap<String, Integer> players;
    Bowling(){
      players = new HashMap<String, Integer>();
    }
    public void addPlayer(String name, int p){
      players.put(name,p);
    }
    public void getWinner(){
        for(int i=0; i<3; i++){

        }
    }
}
