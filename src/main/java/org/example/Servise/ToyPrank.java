package org.example.Servise;

import org.example.Metod.Customer;
import org.example.Metod.RuffelPriz;
import org.example.Metod.Toy;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ToyPrank {
    private List<Toy> toyList;
    private List<RuffelPriz> ruffelPrizList;
    private  List<Customer> customerList;
    private List<RuffelPriz> getPriz;

    public ToyPrank(List<Toy> toyList, List<Customer> customerList,List<RuffelPriz> ruffelPrizList ) {
        this.toyList = toyList;
        this.ruffelPrizList = ruffelPrizList;
        this.customerList = customerList;
        this.getPriz = new ArrayList<>();
    }
    public List<Toy> changeDropFreuency (Integer idToy, Integer quantityToy) {
        for (Toy item : this.toyList) {
            if (idToy.equals(item.getIdToy())) {
                    item.setQuantityToy(quantityToy);
            }

        }
        return toyList;
    }

   public List<RuffelPriz> prank (Integer idToy){
        boolean flag = false;
        for(Toy toy: this.toyList){
            if (idToy.equals(toy.getIdToy()) && toy.getQuantityToy() > 0){
                toy.setDropFrequency(toy.getDropFrequency() - 1);
                flag = true;
            }
        }
        if (!flag){
            return this.ruffelPrizList;
        } else {
            int[] temp = new int[this.customerList.size()];
            int i = 0;
            for (Customer customer : this.customerList) {
                temp[i] = customer.getIdCustomer();
                i++;
            }

            int rnd = new Random().nextInt(temp.length);
            if (rnd == 0){
                rnd++;
            }
            this.ruffelPrizList.add(new RuffelPriz(rnd, idToy));

        }
        return this.ruffelPrizList;
    }
    public List<Toy> gottoys (){
        return this.toyList;
    }

    public List<RuffelPriz> getPriz (Integer idCustomer){
        Boolean flag = false;
        for (RuffelPriz prizes: ruffelPrizList){
            if(idCustomer.equals(prizes.getIdCustomer())){
                this.getPriz.add(new RuffelPriz(prizes.getIdCustomer(), prizes.getIdToy()));
                flag = true;
            }
        }
        if (!flag){
            System.out.printf("Покупатель с ID %d ничего не выиграл \n", idCustomer);
        }

        ruffelPrizList.removeIf(item -> idCustomer.equals(item.getIdCustomer()));
        return this.getPriz;
    }
}
