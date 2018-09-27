package pl.michalmarciniec.loyalty.db;

import pl.michalmarciniec.loyalty.db.type.JpaRepositoryWithOptionals;
import pl.michalmarciniec.loyalty.domain.Bonus;

public interface BonusesRepository extends JpaRepositoryWithOptionals<Bonus, Long> {
}