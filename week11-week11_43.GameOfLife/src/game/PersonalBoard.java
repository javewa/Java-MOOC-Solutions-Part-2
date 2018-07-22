/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import gameoflife.GameOfLifeBoard;
import java.util.Random;
import java.lang.Math;

/**
 *
 * @author nacht
 */
public class PersonalBoard extends GameOfLifeBoard{

    public PersonalBoard(int width, int height) {
        super(width, height);
    }
    
    public int test(double d) {
        int c = (int) Math.floor(1.0/d);
        return c;
    }
    
    @Override
    public void initiateRandomCells(double d) {
        int c = (int) Math.floor(1.0/d);
        Random random = new Random();
        for (int i = 0; i < super.getWidth(); i++) {
            for (int j = 0; j < super.getHeight(); j++) {
                if (random.nextInt(c) == 0) {
                    turnToLiving(i,j);
                } else {
                    turnToDead(i,j);
                }  
            }
        }
        for (int i = 0; i < super.getWidth(); i++) {
            if (random.nextInt(c) == 0) {
                    turnToLiving(i,0);
                } else {
                    turnToDead(i,0);
                }  
        }
        for (int i = 0; i < super.getHeight(); i++) {
            if (random.nextInt(c) == 0) {
                    turnToLiving(0,i);
                } else {
                    turnToDead(0,i);
                }  
        }
    }

    @Override
    public boolean isAlive(int x, int y) {
        boolean c = false;
        if (x < super.getWidth() && y < super.getHeight() && x >= 0 && y >= 0){
            if (super.getBoard() [x][y] == true) {
                c = true;
            }
        }
        return c;
    }

    @Override
    public void turnToLiving(int x, int y) {
        if (x <= super.getWidth() && y <= super.getHeight() && x > 0 && y > 0) {
            super.getBoard()[x][y] = true;
        }
    }

    @Override
    public void turnToDead(int x, int y) {
        if (x <= super.getWidth() && y <= super.getHeight() && x > 0 && y > 0) {
            super.getBoard()[x][y] = false;
        }
    }

    @Override
    public int getNumberOfLivingNeighbours(int x, int y) {
        int c = 0;
        if (x > 0 && y > 0) {
        if (x == super.getWidth() - 1) {
            if (y == super.getHeight() - 1) {
                if (super.getBoard() [x-1][y] == true) {
                    c += 1;
                }
                if (super.getBoard() [x][y-1] == true) {
                    c += 1;
                }
                if (super.getBoard() [x-1][y-1] == true) {
                    c += 1;
                }
            } else {
                if (super.getBoard() [x-1] [y] == true) {
                    c += 1;
                }
                if (super.getBoard() [x-1] [y-1] == true) {
                    c += 1;
                }
                if (super.getBoard() [x] [y-1] == true) {
                    c += 1;
                }
                if (super.getBoard() [x-1] [y+1] == true) {
                    c += 1;
                }
                if (super.getBoard() [x] [y+1] == true) {
                    c += 1;
                }
            }
        } else if (y == super.getHeight() - 1) {
            if (super.getBoard() [x][y-1] == true) {
                c += 1;
            } 
            if (super.getBoard() [x-1][y-1] == true) {
                c += 1;
            }
            if (super.getBoard() [x+1][y-1] == true) {
                c += 1;
            }
            if (super.getBoard() [x-1][y] == true) {
                c += 1;
            }
            if (super.getBoard() [x+1][y] == true) {
                c += 1;
            }
        } else if (x == 0) {
            if (y == 0) {
                if (super.getBoard() [x+1][y] == true) {
                    c += 1;
                }
                if (super.getBoard() [x+1][y+1] == true) {
                    c += 1;
                }
                if (super.getBoard() [x][y+1] == true) {
                    c += 1;
                }
            } else if (y == super.getHeight() - 1) {
                if (super.getBoard() [x][y-1] == true) {
                    c += 1;
                }
                if (super.getBoard() [x+1][y-1] == true) {
                    c += 1;
                }
                if (super.getBoard() [x+1][y] == true) {
                    c += 1;
                }
            } else {
                if (super.getBoard() [x][y-1] == true) {
                    c += 1;
                }
                if (super.getBoard() [x+1][y-1] == true) {
                    c += 1;
                }
                if (super.getBoard() [x+1][y] == true) {
                    c += 1;
                }
                if (super.getBoard() [x+1][y+1] == true) {
                    c += 1;
                }
                if (super.getBoard() [x][y+1] == true) {
                    c += 1;
                }
            }
        } else if (y == 0) {
            if (x == super.getWidth() - 1) {
                if (super.getBoard() [x-1][y] == true) {
                    c += 1;
                }
                if (super.getBoard() [x-1][y+1] == true) {
                    c += 1;
                }
                if (super.getBoard() [x][y+1] == true) {
                    c += 1;
                }
            } else {
                if (super.getBoard() [x-1][y] == true) {
                    c += 1;
                }
                if (super.getBoard() [x-1][y+1] == true) {
                    c += 1;
                }
                if (super.getBoard() [x][y+1] == true) {
                    c += 1;
                }
                if (super.getBoard() [x+1][y] == true) {
                    c += 1;
                }
                if (super.getBoard() [x+1][y+1] == true) {
                    c += 1;
                }
            }
        } else {
            if (super.getBoard() [x][y+1] == true) {
                c += 1;
            }
            if (super.getBoard() [x-1][y+1] == true) {
                c += 1;
            }
            if (super.getBoard() [x+1][y+1] == true) {
                c += 1;
            }
            if (super.getBoard() [x+1][y] == true) {
                c += 1;
            }
            if (super.getBoard() [x-1][y] == true) {
                c += 1;
            }
            if (super.getBoard() [x-1][y-1] == true) {
                c += 1;
            }
            if (super.getBoard() [x][y-1] == true) {
                c += 1;
            }
            if (super.getBoard() [x+1][y-1] == true) {
                c += 1;
            }
        }
        }
       return c; 
    }

    @Override
    public void manageCell(int x, int y, int livingNeighbours) {
        if (super.getBoard()[x][y] == true && livingNeighbours < 2) {
            turnToDead(x,y);
        } else if (super.getBoard()[x][y] == true && livingNeighbours > 3) {
            turnToDead(x,y);
        } else if (super.getBoard()[x][y] == false && livingNeighbours == 3 ) {
            turnToLiving(x,y);
        }
    }
    
}
