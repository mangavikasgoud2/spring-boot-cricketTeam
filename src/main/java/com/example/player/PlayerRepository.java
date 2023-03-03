// Write your code here

package com.example.player;
import java.util.*;
import com.example.player.Player;

public interface PlayerRepository{
    ArrayList<Player> GetAllPlayer();
    Player GetPlayer(int playerId);
    Player PostPlayer(Player player);
    Player PutPlayer(int playerId,Player player);
    void DeletePlayer(int playerId);
}