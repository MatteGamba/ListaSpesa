package com.gamba.listaspesa.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "item")
@Data
@Builder
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "title")
    private String title;
    @Column(name = "quantity")
    private int quantity;


    public Item(Long id, String title, int quantity) {
        this.id = id;
        this.title = title;
        this.quantity = quantity;
    }



}
