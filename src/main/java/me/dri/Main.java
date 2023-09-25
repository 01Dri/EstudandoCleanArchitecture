package me.dri;


import me.dri.entity.gateways.IOperationsCrudContact;
import me.dri.entity.model.Item;
import me.dri.infra.impl.ItemRepositoryImpl;
import me.dri.usecases.ItemServices;

public class Main {
    public static void main(String[] args) {

        Item item   = new Item("carro", 20.0);
        IOperationsCrudContact operationsCrudContact = new ItemRepositoryImpl();
        ItemServices services = new ItemServices(operationsCrudContact);
        services.saveItem(item);
    }
}