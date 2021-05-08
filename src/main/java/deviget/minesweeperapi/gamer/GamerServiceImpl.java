package deviget.minesweeperapi.gamer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GamerServiceImpl implements GamerService {

    @Autowired
    GamerRepository gamerRepository;

    @Override
    public Gamer createGamer(GamerRequest gamerRequest) {
        Gamer gamer = Gamer.builder().name(gamerRequest.getName()).build();
        return gamerRepository.save(gamer);
    }
}
