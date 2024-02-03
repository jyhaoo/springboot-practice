package org.jason.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.DELETE;

@RestController
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @RequestMapping(method = RequestMethod.GET, value = "/players")
    public List<Player> getAllPlayers() {
        return playerService.getPlayers();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/players/{id}")
    public Player getPlayer(@PathVariable("id") Integer id) {
        return playerService.getPlayer(id);
    }

    @RequestMapping(method = RequestMethod.POST, value ="/players")
    public void addPlayer(@RequestBody Player player) {
        playerService.addPlayer(player);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/players/{id}")
    public void updatePlayer(@RequestBody Player player, @PathVariable("id") Integer id) {
        playerService.updatePlayer(player, id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/players/{id}")
    public void deletePlayer(@PathVariable("id") Integer id) {
        playerService.deletePlayer(id);
    }
}
