package net.jagster.financial.repository;

import net.jagster.financial.entity.Currency;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CurrencyRepository extends JpaRepository<Currency, Long> {
    Optional<Currency> findCurrencyByCodeIgnoreCase(String code);
}
