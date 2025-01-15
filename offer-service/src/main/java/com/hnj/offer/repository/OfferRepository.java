package com.rania.offer.repository;

import com.rania.offer.model.Offer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OfferRepository extends JpaRepository<Offer, Integer> {
    Optional<Offer> findByProductId(Integer productId);
}
