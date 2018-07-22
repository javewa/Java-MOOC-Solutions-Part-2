/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reader.criteria;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author nacht
 */
public class AtLeastOne implements Criterion{
    
    private List<Criterion> criterias;
    
    public AtLeastOne(Criterion... criteria) {
        this.criterias = new ArrayList<Criterion>();
        for (int i = 0; i < criteria.length; i ++) {
            criterias.add(criteria[i]);
        }
    }

    @Override
    public boolean complies(String line) {
        boolean c = false;
        for (Criterion criteria : criterias) {
            if (criteria.complies(line)) {
                c = true;
            }
        }
        return c;
    }
    
}
