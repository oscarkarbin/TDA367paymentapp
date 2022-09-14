package com.example.payme.model;

import java.util.List;

public class PaySplit implements PaymentMethod{

    @Override
    public void calculateBalance(List<Pair> memberAndCostList, Member payer) {
        float totalGroupCost = calcTotalCost(memberAndCostList);
        float splitCost = totalGroupCost / memberAndCostList.size();
        updateBalance(memberAndCostList, payer, splitCost);
    }

    private float calcTotalCost(List<Pair> memberAndCostList){
        float total = 0;
        for (Pair memberAndAmount : memberAndCostList) {
            Float paidAmount = memberAndAmount.getSecond();
            total += paidAmount;
        }
        return total;
    }

    private void updateBalance(List<Pair> memberAndCostList, Member memberWhoPaid, float amountToPay){
        for (Pair memberAndAmount: memberAndCostList){
            Member memberToPay = memberAndAmount.getFirst();
            if (!(memberToPay == memberWhoPaid)){
                // Tell member how much to pay the person who paid for the event
            }
        }
    }

}
