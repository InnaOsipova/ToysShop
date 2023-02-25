package org.example.Controller;

import org.example.Metod.*;
import org.example.Servise.ToyPrank;
import org.example.View.ViewObject;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    CustomerList cl = new CustomerList();
    ToysList tl = new ToysList();
    ViewObject vo = new ViewObject();
    ToyPrank tp;
    RuffelPrzesList rp;

    public Controller() {

    }

    public void addCustomer (String nameCustomer, String CustomerAdres, String customerPhonNumber){
        cl.addCustomer(nameCustomer, CustomerAdres, customerPhonNumber);
        List<Customer> customerList = cl.getAll();
        vo.writeObject(customerList, "customers.bin");

    }
    public void addToy(String name, Integer quantityToy, Integer dropFrequency){
        tl.addToy(name, quantityToy, dropFrequency);
        List<Toy> toyList = tl.getAll();
        vo.writeObject(toyList, "toys.bin");

    }

    public void deletCustomer (Integer idCustomer){
        List<Customer> customerList = cl.deleteCustomer(idCustomer, (List<Customer>) vo.readObject("customers.bin"));
        //System.out.println(customerList);
        vo.writeObject(customerList, "customers.bin");
    }

    public void deletToy (Integer idToy){
        List<Toy> toyList = tl.deleteToy(idToy, (List<Toy>) vo.readObject("toys.bin"));
        //System.out.println(toyList);
        vo.writeObject(toyList, "toys.bin");
    }

    public void deleteWinners (){
        List<RuffelPriz> prizes = (List<RuffelPriz>) vo.readObject("prizes.bin");
        if (!prizes.isEmpty()){
            prizes.clear();
        }
        vo.writeObject(prizes, "prizes.bin");
    }

    public void changeDropFreuency (Integer idToy, Integer quantityToy){
        List<Toy> toys = (List<Toy>) vo.readObject("toys.bin");
        tp = new ToyPrank(toys, null, null);
        List<Toy> toyList = tp.changeDropFreuency(idToy, quantityToy);
        vo.writeObject(toyList, "toys.bin");

    }

    public void  prank (Integer idToy){
        List<Customer> customers = (List<Customer>) vo.readObject("customers.bin");
        List<Toy> toys = (List<Toy>) vo.readObject("toys.bin");
        List<RuffelPriz> prizes = (List<RuffelPriz>) vo.readObject("prizes.bin");
        tp = new ToyPrank(toys, customers, prizes);
        List<RuffelPriz> priz = tp.prank(idToy);
        vo.writeObject(priz, "prizes.bin");
        List<Toy> toyList = tp.gottoys();
        vo.writeObject(toyList, "toys.bin");
    }

    public void getPriz (Integer idCustomer){
        List<RuffelPriz> prizes = (List<RuffelPriz>) vo.readObject("prizes.bin");
        tp = new ToyPrank(null, null, prizes);
        rp = new RuffelPrzesList(prizes);
        List<RuffelPriz> gotPriz = tp.getPriz(idCustomer);
        vo.writeObject(gotPriz, "gotprizes.bit");
        List<RuffelPriz> prizList = rp.getAll();
        vo.writeObject(prizList, "prizes.bin");

    }

    public void showWinners (){
        System.out.println("Список победителей :");
        List<RuffelPriz> prizes = (List<RuffelPriz>) vo.readObject("prizes.bin");
        System.out.println(prizes);

    }
    public void showGotPrizes (){
        System.out.println("Свой приз забрали :");
        //List<RuffelPriz> gotPrizes = (List<RuffelPriz>) vo.readObject("gotprizes.bit");
        System.out.println(vo.readObject("gotprizes.bit"));

    }

}
