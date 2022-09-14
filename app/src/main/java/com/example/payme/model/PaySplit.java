package com.example.payme.model;

import java.util.List;

public class PaySplit implements PaymentMethod{

    @Override
    public void calculateBalance(List<Pair<Member,Float>> memberAndCostList, Member payer) {
        float totalGroupCost = calcTotalCost(memberAndCostList);
        float splitCost = calcDividedCost(totalGroupCost, memberAndCostList.size());
        updateBalance(memberAndCostList, payer, splitCost);
    }

    private float calcTotalCost(List<Pair<Member,Float>> memberAndCostList){
        float total = 0;
        for (Pair<Member,Float> memberAndAmount : memberAndCostList) {
            Float memberPaidAmount = memberAndAmount.getSecond();
            total += memberPaidAmount;
        }
        return total;
    }

    private float calcDividedCost(float totalGroupCost, int members){
        float dividedCost = 0;
        try{dividedCost = totalGroupCost / members;}
        catch (ArithmeticException e){System.out.println("Division by zero");}
        return dividedCost;
    }

    private void updateBalance(List<Pair<Member,Float>> memberAndCostList, Member memberWhoPaid, float amountToPay){
        for (Pair<Member,Float> memberAndAmount: memberAndCostList){
            Member personThatPays = memberAndAmount.getFirst();
            if (!(personThatPays == memberWhoPaid)){

                // Tell member how much to pay the person who paid for the event
            }
        }
    }
}
