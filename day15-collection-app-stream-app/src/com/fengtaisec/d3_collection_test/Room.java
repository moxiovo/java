package com.fengtaisec.d3_collection_test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Room {
    // 必须有一副牌
    private List<Card> allCards = new ArrayList<>();

    public Room(){
        // 做出54张牌，存到集合allCards
        // 点数：个数确定了 类型确定
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        // 花色: 个数确定了 类型确定
        String[] colors = {"♠", "♥", "♣", "♦"};
        int size = 0; // 表示每张牌的大小
        // 遍历点数再遍历花色
        for (String number : numbers) { // 增强for
            // number = 3
            size++; // 1 2 ....
            for (String color : colors) {
                Card c = new Card(number, color, size);
                allCards.add(c);
            }
        }
        // 单独存入大小王
        Card c1 = new Card("", "joker", ++size);
        Card c2 = new Card("", "JOKER", ++size);
        Collections.addAll(allCards, c1, c2);
        System.out.println("新牌：" + allCards);


    }

    public void start() {
        // 洗牌
        Collections.shuffle(allCards);
        System.out.println("洗牌后：" + allCards);

        // 发牌 首先定义三个玩家 List(ArrayList) Set(TreeSet)
        List<Card> player1 = new ArrayList<>();
        List<Card> player2 = new ArrayList<>();
        List<Card> player3 = new ArrayList<>();

        // 正式发牌，依次发出51张牌，剩余3张作为底牌
        // allCards [JOKER, ♠7, ♠9, ♠10, ♥K, ♦4, ....
        // % 3
        for (int i = 0; i < allCards.size() - 3; i++) {
            Card c = allCards.get(i);
            // 判断发给谁
            if (i % 3 == 0){
                player1.add(c);
            }else if (i % 3 == 1){
                player2.add(c);
            }else if (i % 3 == 2){
                player3.add(c);
            }
        }
        // 对3个玩家的牌进行排序
        sortCards(player1);
        sortCards(player2);
        sortCards(player3);
        // 看牌
        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);
        List<Card> lastThreeCards = allCards.subList(allCards.size() - 3, allCards.size()); // 截取一个元素成为集合 51 52 53
        System.out.println(lastThreeCards);
        player1.addAll(lastThreeCards);
        System.out.println(player1);
        sortCards(player1);
        System.out.println(player1);


    }
    // 集中进行排序
    private void sortCards(List<Card> cards) {
        Collections.sort(cards, new Comparator<Card>() {
            @Override
            public int compare(Card o1, Card o2) {
                // return o1.getSize() - o2.getSize(); // 升序
                return o2.getSize() - o1.getSize(); // 降序
            }
        });
    }
}
