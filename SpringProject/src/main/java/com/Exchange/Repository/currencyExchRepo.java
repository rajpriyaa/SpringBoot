package com.Exchange.Repository;

import com.Exchange.Models.currencyExchangeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface currencyExchRepo extends JpaRepository<currencyExchangeEntity,Long> {
}
