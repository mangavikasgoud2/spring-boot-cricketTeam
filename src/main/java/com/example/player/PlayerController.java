/*
 * You can use the following import statements
 * 
 * import org.springframework.web.bind.annotation.*;
 * import java.util.ArrayList;
 * 
 */

// Write your code here.
package com.example.player;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.Collections;
import com.example.player.PlayerService;

@RestController
public class PlayerController{
    PlayerService pService = new PlayerService();

    @GetMapping("/players")
    public ArrayList<Player> GetAllPlayer(){
        return pService.GetAllPlayer();
    }

    @GetMapping("/players/{playerId}")
    public Player GetPlayer(@PathVariable int playerId){
        return pService.GetPlayer(playerId);
    }

    @PostMapping("/players")
    public Player PostPlayer(@RequestBody Player player){
        return pService.PostPlayer(player);
    }

    @PutMapping("/players/{playerId}")
    public Player PutPlayer(@PathVariable int playerId,@RequestBody Player player){
        return pService.PutPlayer(playerId,player);
    }

    @DeleteMapping("/players/{playerId}")
    public void DeletePlayer(@PathVariable int playerId){
        pService.DeletePlayer(playerId);
    }
}