import com.simplon.demo.model.UserChallengeRelation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserChallengeRepository extends JpaRepository<UserChallengeRelation, Long> {
}
