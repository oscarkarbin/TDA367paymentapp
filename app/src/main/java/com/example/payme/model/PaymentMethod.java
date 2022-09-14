package com.example.payme.model;

import java.util.List;

public interface PaymentMethod {

    void calculateBalance(List<Pair<Member,Float>> membersOfEvent, Member payer);
}
