package com.gamba.listaspesa.service;

import com.gamba.listaspesa.model.Item;
import com.gamba.listaspesa.model.ListItem;

import java.util.List;

public interface ShopService {

    List<ListItem> getAllList();
    ListItem getListById(long id);
    ListItem addList(ListItem listItem);
    void deleteList(long id);
    void updateTitleList(long id, String title);

    List<Item> getAllItem();
    Item addItem(Item item);
    void deleteItem(long id);
    Item updateItem(Item item);

}
