package com.gamba.listaspesa.service;

import com.gamba.listaspesa.model.Item;
import com.gamba.listaspesa.model.ListItem;
import com.gamba.listaspesa.repository.ItemRepo;
import com.gamba.listaspesa.repository.ListItemRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopServiceImpl implements ShopService{

    private ItemRepo itemRepo;
    private ListItemRepo listItemRepo;

    public ShopServiceImpl(ItemRepo itemRepo, ListItemRepo listItemRepo) {
        this.itemRepo = itemRepo;
        this.listItemRepo = listItemRepo;
    }

    @Override
    public List<ListItem> getAllList() {
        return listItemRepo.findAll();
    }

    @Override
    public ListItem getListById(long id) {
        return listItemRepo.findListItemById(id);
    }

    @Override
    public ListItem addList(ListItem listItem) {
        return listItemRepo.save(listItem);
    }

    @Override
    public void deleteList(long id) {
        listItemRepo.deleteListItemById(id);
    }

    @Override
    public void updateTitleList(long id, String title) {
        ListItem listItem = listItemRepo.findListItemById(id);
        listItem.setTitle(title);
        listItemRepo.save(listItem);
    }

    @Override
    public List<Item> getAllItem() {
        return itemRepo.findAll();
    }

    @Override
    public Item addItem(Item item) {
        return itemRepo.save(item);
    }

    @Override
    public void deleteItem(long id) {
        itemRepo.deleteItemById(id);
    }

    @Override
    public Item updateItem(Item item) {
        return itemRepo.save(item);
    }
}
