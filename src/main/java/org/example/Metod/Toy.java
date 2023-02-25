package org.example.Metod;

import java.io.Serializable;

public class Toy implements Serializable {
    private Integer idToy;
    private String nameToy;
    private Integer quantityToy;
    private Integer dropFrequency;

    public Toy(Integer idToy, String nameToy, Integer quantityToy, Integer dropFrequency) {
        this.idToy = idToy;
        this.nameToy = nameToy;
        this.quantityToy = quantityToy;
        this.dropFrequency = dropFrequency;
    }

    public Integer getIdToy() {
        return idToy;
    }

    public void setIdToy(Integer idToy) {
        this.idToy = idToy;
    }

    public String getNameToy() {
        return nameToy;
    }

    public void setNameToy(String nameToy) {
        this.nameToy = nameToy;
    }

    public Integer getQuantityToy() {
        return quantityToy;
    }

    public void setQuantityToy(Integer quantityToy) {
        this.quantityToy = quantityToy;
    }

    public Integer getDropFrequency() {
        return dropFrequency;
    }

    public void setDropFrequency(Integer dropFrequency) {

        this.dropFrequency = dropFrequency;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "idToy=" + idToy +
                ", nameToy='" + nameToy + '\'' +
                ", quantityToy=" + quantityToy +
                ", dropFrequency=" + dropFrequency +
                '}';
    }
}
