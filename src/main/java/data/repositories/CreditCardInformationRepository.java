package data.repositories;

import data.models.CreditCardInformation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreditCardInformationRepository extends JpaRepository<CreditCardInformation,Long> {
}
