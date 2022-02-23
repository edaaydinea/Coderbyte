import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(BlackjackHighest(s.nextLine()));
    }

    public static String BlackjackHighest(String[] strArr) {
        // code goes here
        Card[] cards = new Card[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            cards[i] = new Card(strArr[i]);
        }

        Arrays.sort(cards, new Comparator<Card>() {
            public int compare(Card card, Card card2) {
                if (card.rating > card2.rating) return 1;
                else if (card.rating < card2.rating) return -1;
                return 0;
            }
        });

        int total = 0;
        boolean hasAce = false, aceUsed = false;
        for (Card card : cards) {
            if (card.rating == 14) {
                hasAce = true;
            }
            if (total + card.topVal > 21) {
                total += card.lowVal;
            } else {
                if (card.rating == 14) {
                    aceUsed = true;
                }
                total += card.topVal;
            }
        }

        Card highest = cards[cards.length - 1];
        if (hasAce && !aceUsed) {
            highest = cards[cards.length - 2];
        }
        if (total < 21) {
            return "below " + highest.repr;
        } else if (total == 21) {
            return "blackjack " + highest.repr;
        }
        return "above " + highest.repr;
    }

    static class Card {
        int lowVal = 0, topVal = 0, rating = 0;
        String repr;

        Card(String card) {
            card = card.toLowerCase();
            repr = card;

            if (card.equals("two")) {
                lowVal = 2;
                topVal = 2;
                rating = 2;
            } else if (card.equals("three")) {
                lowVal = 3;
                topVal = 3;
                rating = 3;
            } else if (card.equals("four")) {
                lowVal = 4;
                topVal = 4;
                rating = 4;
            } else if (card.equals("five")) {
                lowVal = 5;
                topVal = 5;
                rating = 5;
            } else if (card.equals("six")) {
                lowVal = 6;
                topVal = 6;
                rating = 6;
            } else if (card.equals("seven")) {
                lowVal = 7;
                topVal = 7;
                rating = 7;
            } else if (card.equals("eight")) {
                lowVal = 8;
                topVal = 8;
                rating = 8;
            } else if (card.equals("nine")) {
                lowVal = 9;
                topVal = 9;
                rating = 9;
            } else if (card.equals("ten")) {
                lowVal = 10;
                topVal = 10;
                rating = 10;
            } else if (card.equals("jack")) {
                lowVal = 10;
                topVal = 10;
                rating = 11;
            } else if (card.equals("queen")) {
                lowVal = 10;
                topVal = 10;
                rating = 12;
            } else if (card.equals("king")) {
                lowVal = 10;
                topVal = 10;
                rating = 13;
            } else if (card.equals("ace")) {
                lowVal = 1;
                topVal = 11;
                rating = 14;
            }
        }
    }

}
