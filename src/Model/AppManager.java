/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.LinkedList;

/**
 *
 * @author Carlos Gomez
 */
public enum AppManager {
    INSTANCE;
    private LinkedList<Player> players;
     
    AppManager() {
        players = new LinkedList<>();
    }
    
    public LinkedList<Player> getPlayers() {
        return players;
    }

    public Player getPlayers(int position) {
        return players.get(position);
    }
    
     public void addPlayer(Player player){
        players.add(player);
    }

}
