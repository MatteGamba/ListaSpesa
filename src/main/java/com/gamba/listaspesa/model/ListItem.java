package com.gamba.listaspesa.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "listitem")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ListItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;

    @OneToMany(cascade = CascadeType.MERGE, fetch = FetchType.LAZY, orphanRemoval = true)
    @JoinColumn(name = "listitem_id")
    @JsonIgnore
    private List<Item> items;

}
