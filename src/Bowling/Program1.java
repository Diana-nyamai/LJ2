package Bowling;

import java.util.Scanner;

public class Program1{
    public static void main(String[] args) {
        Bowling game = new Bowling();
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<3; i++){
            String input = sc.nextLine();
            String [] values = input.split(" ");
            String names = values[0];
            int points = Integer.parseInt(values[1]);
            game.addPlayer(names, points);
        }

    }
}
