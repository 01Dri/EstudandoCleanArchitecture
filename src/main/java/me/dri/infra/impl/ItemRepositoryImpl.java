package me.dri.infra.impl;

import me.dri.entity.gateways.IOperationsCrudContact;
import me.dri.entity.model.Item;


public class ItemRepositoryImpl implements IOperationsCrudContact {



    @Override
    public void save(Item item) {
        System.out.println("Item salvo");
    }

    @Override
    public void delete(Item item) {
        System.out.println("Item deletado");
    }
}
