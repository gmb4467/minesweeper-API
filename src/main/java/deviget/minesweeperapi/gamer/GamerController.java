package deviget.minesweeperapi.gamer;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/gamers")
@RequiredArgsConstructor
public class GamerController {

    private final GamerService  gamerService;

    @PostMapping
    public Gamer createGamer(@RequestBody GamerRequest gamerRequest) {
        return gamerService.createGamer(gamerRequest);
    }
}
