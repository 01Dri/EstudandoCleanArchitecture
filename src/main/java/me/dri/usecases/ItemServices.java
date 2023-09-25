package me.dri.usecases;

import me.dri.entity.gateways.IOperationsCrudContact;
import me.dri.entity.model.Item;

public class ItemServices {


    private IOperationsCrudContact itemRepository;

    public ItemServices(IOperationsCrudContact itemRepository) {
        this.itemRepository = itemRepository;
    }

    public void saveItem(Item item) {
        this.itemRepository.save(item);
    }


}
