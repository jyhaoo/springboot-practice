package org.jason.player;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class PlayerService {

    private List<Player> players = new ArrayList<>(Arrays.asList(
            new Player(1, "John Doe", 4.0),
            new Player(2, "Roger Federer", 7.0),
            new Player(3, "Rafael Nadal", 7.0),
            new Player(4, "Andy Murray", 7.0)
    ));

    public List<Player> getPlayers() {
        return players;
    }

    public Player getPlayer(Integer id) {
        return players.stream().filter(p -> p.getId().equals(id)).findFirst().get();
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void updatePlayer(Player player, Integer id) {
        for (int i = 0; i < players.size(); i++) {
            Player p = players.get(i);
            if (p.getId().equals(id)) {
                players.set(i, player);
                return;
            }
        }
    }

    public void deletePlayer(Integer id) {
        players.removeIf(p -> p.getId().equals(id));
    }
}
