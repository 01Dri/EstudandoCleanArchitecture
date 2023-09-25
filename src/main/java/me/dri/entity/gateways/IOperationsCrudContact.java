package me.dri.entity.gateways;

import me.dri.entity.model.Item;

public interface IOperationsCrudContact {

    void save(Item item);
    void delete(Item item);
}
