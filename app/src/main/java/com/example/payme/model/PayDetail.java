package com.example.payme.model;

import java.util.List;

public class PayDetail implements PaymentMethod{

    @Override
    public void calculateBalance(List<Pair<Member,Double>> memberAndCostList, Member payer) {
        updateBalance(memberAndCostList, payer);
    }

    private void updateBalance(List<Pair<Member,Double>> memberAndCostList, Member memberToGetPaid){
        for (Pair<Member, Double> memberAndAmount: memberAndCostList) {
            Member memberToPay = memberAndAmount.getFirst();
            Double amountToPay = memberAndAmount.getSecond();
            if(!(memberToPay == memberToGetPaid)){
                memberToPay.updateBalance(amountToPay, memberToGetPaid);
            }
        }
    }
}
