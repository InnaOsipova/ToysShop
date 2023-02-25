package org.example.Metod;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class RuffelPrzesList implements Serializable {
    private final List<RuffelPriz> ruffelPrizList;

    public RuffelPrzesList(List<RuffelPriz> ruffelPrizList) {
        this.ruffelPrizList = ruffelPrizList;
    }


    public List<RuffelPriz> getAll() {
        return this.ruffelPrizList;
    }

    public void deleteruffelPriz (Integer IdCustomer) {
        for (RuffelPriz item:this.ruffelPrizList) {
            if(IdCustomer.equals(item.getIdCustomer())){
                    this.ruffelPrizList.remove(item);
            }
        }
    }

}
