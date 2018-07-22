/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reader.criteria;

/**
 *
 * @author nacht
 */
public class LengthAtLeast implements Criterion{

    private int num;
    
    public LengthAtLeast(int num) {
        this.num = num;
    }
    
    @Override
    public boolean complies(String line) {
        return (line.length() >= num);
    }
    
}
