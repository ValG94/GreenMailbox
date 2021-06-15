
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersChallengesController {

    private UserChallengeRepository userChallengeRepository;

    public UsersChallengesController(UserChallengeRepository userChallengeRepository) {
        this.userChallengeRepository = userChallengeRepository;
    }

//    //TODO - à revoir = l'id est celui du user et non de la table UserChallenge (?)
//    @GetMapping("/api/user_challenges/{id}")
//    public Optional<UserChallengeRelation> getAllChallengesByUser(@PathVariable Long id) {
//        return userChallengeRepository.findById(id);
//    }



}
