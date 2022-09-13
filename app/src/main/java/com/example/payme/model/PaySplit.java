package com.example.payme.model;

import java.util.List;

public class PaySplit implements PaymentMethod{

    @Override
    public void calculateBalance(List<MemberCost> memberAndCost, Member payer) {
        float totalGroupCost = calcTotalCost(memberAndCost);
        float splitCost = totalGroupCost / memberAndCost.size();
        updateBalance(memberAndCost, payer, splitCost);
    }

    private float calcTotalCost(List<MemberCost> memberAndCost){
        float total = 0;
        for (MemberCost memberPaid : memberAndCost) {
            total += memberPaid.payedAmount;
        }
        return total;
    }

    private void updateBalance(List<MemberCost> memberAndCost, Member memberWhoPaid, float amountToPay){
        for (MemberCost membersAndCosts: memberAndCost){
            if (!(membersAndCosts.member == memberWhoPaid)){
                // Tell member how much to pay the person who paid for the event
            }

        }
    }

}
