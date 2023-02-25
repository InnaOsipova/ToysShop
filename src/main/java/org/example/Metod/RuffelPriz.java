package org.example.Metod;

import java.io.Serializable;

public class RuffelPriz implements Serializable {
    private Integer idCustomer;
    private Integer idToy;

    public RuffelPriz(Integer idCustomer, Integer idToy) {
        this.idCustomer = idCustomer;
        this.idToy = idToy;
    }

    public Integer getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Integer idCustomer) {
        this.idCustomer = idCustomer;
    }

    public Integer getIdToy() {
        return idToy;
    }

    public void setIdToy(Integer idToy) {
        this.idToy = idToy;
    }

    @Override
    public String toString() {
        return "RuffelPriz{" +
                "idCustomer=" + idCustomer +
                ", idToy=" + idToy +
                '}';
    }
}
