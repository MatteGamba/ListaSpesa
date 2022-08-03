package com.gamba.listaspesa.controller;

import com.gamba.listaspesa.model.ListItem;
import com.gamba.listaspesa.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class ShopRest {

    private ShopService service;

    @Autowired
    public ShopRest(ShopService service) {
        this.service = service;
    }

    @GetMapping("/list")
    public ResponseEntity<List<ListItem>> getAllList(){
        List<ListItem> listItems = service.getAllList();
        return new ResponseEntity<List<ListItem>>(listItems, HttpStatus.OK);
    }

    @GetMapping("/list/{id}")
    public ResponseEntity<ListItem> getListById(@PathVariable("id") Long id){
        ListItem listItem = service.getListById(id);
        return new ResponseEntity<ListItem>(listItem,HttpStatus.OK);
    }

    @PostMapping("/list/add")
    public ResponseEntity<ListItem> addList(@RequestBody ListItem listItem){
        ListItem newListItem = service.addList(listItem);
        return new ResponseEntity<ListItem>(newListItem, HttpStatus.CREATED);
    }
}
