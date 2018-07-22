/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

/**
 *
 * @author nacht
 */
import java.util.Random;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dungeon {
    
    private int length;
    private int height;
    private int vampires;
    private int moves;
    private boolean vampiresMove;
    private List<Integer> vampiresPosX = new ArrayList<Integer>();
    private List<Integer> vampiresPosY = new ArrayList<Integer>();
    
    
    public Dungeon(int length, int height, int vampires, int moves, boolean vampiresMove) {
        this.length = length;
        this.height = height;
        this.vampires = vampires;
        this.moves = moves;
        this.vampiresMove = vampiresMove;
    }
    
    public void run() {
        Random random = new Random();
        Scanner reader = new Scanner(System.in);
        
        int humanPosX = 0;
        int humanPosY = 0;
        
        for (int i = 0; i < vampires; i ++) { //generate initial vampire positions and add to lists
                int x = 0;
                int y = 0;
                while (true) {
                    x = random.nextInt(length);
                    y = random.nextInt(height);
                    if ((!vampiresPosX.contains(x)) && (!vampiresPosY.contains(y)) && !(x == 0 && y == 0)) {
                        break;
                    }
                }
                vampiresPosX.add(x);
                vampiresPosY.add(y);
       
        }

        while (true) {
            
            if (moves == 0) {
                System.out.println("YOU LOSE");
                break;
            }
            
            System.out.println(moves + "\n");  
            
            System.out.println("@ " + humanPosX + " " + humanPosY);
            for (int j = 0; j < vampiresPosX.size(); j++) {
                System.out.println("v " + vampiresPosX.get(j) + " " + vampiresPosY.get(j));
            }
            
            System.out.print("\n");
            
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < length; j++) {
                    if (vampiresPosX.contains(j) && vampiresPosY.contains(i) && vampiresPosX.indexOf(j) == vampiresPosY.indexOf(i)) {
                        System.out.print("v");
                    } else if (humanPosX == j && humanPosY == i) {
                        System.out.print("@");
                    } else {
                        System.out.print(".");
                    }
                }
                System.out.print("\n");
            }
            
            String commands = reader.nextLine();
            char[] splitCommands = commands.toCharArray();  //human moves
            for (int i = 0; i < splitCommands.length; i ++) {
                if (splitCommands[i] == "w".charAt(0) && humanPosY > 0) {
                    humanPosY -= 1;
                } else if (splitCommands[i] == "s".charAt(0) && humanPosY < height - 1) {
                    humanPosY += 1;
                } else if (splitCommands[i] == "a".charAt(0) && humanPosX > 0) {
                    humanPosX -= 1;
                } else if (splitCommands[i] == "d".charAt(0) && humanPosX < length - 1) {
                    humanPosX += 1;
                }
            }
            
            //determine if any vampires are defeated and remove their positions
            
            for (int i = 0; i < vampiresPosX.size(); i++) {
                if (vampiresPosX.get(i) == humanPosX && vampiresPosY.get(i) == humanPosY) {
                    vampiresPosX.remove(i);
                    vampiresPosY.remove(i);
                }
            }
            
            //break if no remaining vampires
            
            if (vampiresPosX.isEmpty()) {
                System.out.println("YOU WIN");
                break;
            }
            
            //remaining vampires move randomly according to number of human moves
            if (vampiresMove == true) {
                for (int j = 0; j < splitCommands.length; j++) {
                    for (int k = 0; k < vampiresPosX.size(); k++) { //move each vampy
                        int c = random.nextInt(1);
                        if (c == 0) { //move horizontally
                            if (vampiresPosX.get(k) < length && vampiresPosX.get(k) > 0) {
                                int d = vampiresPosX.get(k);
                                int e = -1;
                                vampiresPosX.remove(k);
                                vampiresPosX.add(k, d += e + random.nextInt(2)); //moves to right or left by 1
                            }
                        } else { //move vertically
                            if (vampiresPosY.get(k) < height && vampiresPosY.get(k) > 0) {
                                int d = vampiresPosY.get(k);
                                int e = -1;
                                vampiresPosY.remove(k);
                                vampiresPosY.add(k, d += e + random.nextInt(2));
                            }
                        }
                    }
                }
            }
                        
            moves -= 1;
          }
    }
    
}
