package com.gamba.listaspesa.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "listitem")
@Data
@Builder
public class ListItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    @JoinColumn(name = "listitem_id")
    private List<Item> items;

    public ListItem(Long id, String title, List<Item> items) {
        this.id = id;
        this.title = title;
        this.items = items;
    }
}
