package com.example.payme.model;

import java.util.List;

public class PaySplit implements PaymentMethod{

    @Override
    public void calculateBalance(List<Pair<Member,Double>> memberAndCostList, Member payer) {
        Double totalGroupCost = calcTotalCost(memberAndCostList);
        Double splitCost = calcDividedCost(totalGroupCost, memberAndCostList.size());
        updateBalance(memberAndCostList, payer, splitCost);
    }

    private Double calcTotalCost(List<Pair<Member,Double>> memberAndCostList){
        double total = 0;
        for (Pair<Member,Double> memberAndAmount : memberAndCostList) {
            Double memberPaidAmount = memberAndAmount.getSecond();
            total += memberPaidAmount;
        }
        return total;
    }

    private double calcDividedCost(Double totalGroupCost, int members){
        double dividedCost = 0;
        try{dividedCost = totalGroupCost / members;}
        catch (ArithmeticException e){System.out.println("Division by zero");}
        return dividedCost;
    }

    private void updateBalance(List<Pair<Member,Double>> memberAndCostList, Member memberToGetPaid, double amountToPay){
        for (Pair<Member,Double> memberAndAmount: memberAndCostList){
            Member memberToPay = memberAndAmount.getFirst();
            if (!(memberToPay == memberToGetPaid)){
                memberToPay.updateBalance(memberToPay, amountToPay, memberToGetPaid);
            }
        }
    }
}
