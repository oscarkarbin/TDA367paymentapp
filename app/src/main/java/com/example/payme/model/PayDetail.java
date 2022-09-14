package com.example.payme.model;

import java.util.List;

public class PayDetail implements PaymentMethod{

    @Override
    public void calculateBalance(List<Pair<Member,Float>> memberAndCostList, Member payer) {
        updateBalance(memberAndCostList, payer);
    }

    private void updateBalance(List<Pair<Member,Float>> memberAndCostList, Member payer){
        for (Pair<Member, Float> memberAndAmount: memberAndCostList) {
            Member personThatPays = memberAndAmount.getFirst();
            if(!(personThatPays == payer)){
                //Tell the person that needs to pay, how much to pay the payer
            }
        }
    }
}
