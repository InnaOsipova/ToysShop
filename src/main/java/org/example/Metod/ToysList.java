package org.example.Metod;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ToysList implements Serializable {
    private final List<Toy> toyList;
    private Integer id =0;

    public ToysList() {
        this.toyList = new ArrayList<>();
    }

    public void addToy(String name, Integer quantityToy, Integer dropFrequency) {
        for (Toy item : this.toyList) {
            if (item != null) {
                if (id < item.getIdToy()) {
                    id = item.getIdToy();
                }
            }
        }
        id++;
        this.toyList.add(new Toy(id, name, quantityToy, dropFrequency));
    }

    public List<Toy> getAll() {
        return this.toyList;
    }

    public List<Toy> deleteToy (Integer idToy, List<Toy> toyList) {
        toyList.removeIf(item -> idToy.equals(item.getIdToy()));

        return toyList;
    }
}
