package com.example.payme;

import org.junit.Test;
import static org.junit.Assert.*;
import  com.example.payme.model.*;
import java.util.ArrayList;
import java.util.List;

public class PaymentMethodTest {
    @Test
    public void splitPayment() {
        Member user1 = new Member("User1", "10");
        Member user2 = new Member("User2", "20");
        Member user3 = new Member("User3", "30");

        List<Pair<Member, Double>> memberAndPayment = new ArrayList<>();
        addMemberAndCost(memberAndPayment, user1);
        addMemberAndCost(memberAndPayment, user2);
        addMemberAndCost(memberAndPayment, user3);

        List<Member> member1BalanceList = createMembersList(user2, user3);
        List<Member> member2BalanceList = createMembersList(user1, user3);
        List<Member> member3BalanceList = createMembersList(user1, user2);

        user1.initMemberBalance(member1BalanceList);
        user2.initMemberBalance(member2BalanceList);
        user3.initMemberBalance(member3BalanceList);

        PaymentMethod paymentMethod = new PaySplit();
        paymentMethod.calculateBalance(memberAndPayment, user1);

        assertEquals(100.0, user1.getBalance().getTotalBalance(), 0.1);
        assertEquals(-50.0, user2.getBalance().getTotalBalance(), 0.1);
        assertEquals(-50.0, user3.getBalance().getTotalBalance(), 0.1);
    }

    private List<Member> createMembersList(Member otherUser1, Member otherUser2){
        List<Member> balanceList = new ArrayList<>();
        balanceList.add(otherUser1);
        balanceList.add(otherUser2);
        return balanceList;
    }

    private void addMemberAndCost(List<Pair<Member, Double>> memberAndPaidAmount, Member member){
        //Scanner keyboard = new Scanner(System.in);
        //System.out.println("Enter paid amount for " + member.getName() + ": ");
        //double paidAmount = keyboard.nextDouble();

        double paidAmount = 50;
        memberAndPaidAmount.add(new Pair<Member, Double>(member, paidAmount));
    }


}
