package com.rania.offer.service;

import com.rania.offer.model.Offer;
import com.rania.offer.model.request.OfferRequest;

import java.util.List;

public interface OfferService {
    void addProductOffer(OfferRequest offerRequest);

    List<Offer> getOffers();
}
