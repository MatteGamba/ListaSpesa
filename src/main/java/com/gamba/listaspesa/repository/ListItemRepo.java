package com.gamba.listaspesa.repository;

import com.gamba.listaspesa.model.ListItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ListItemRepo extends JpaRepository<ListItem, Long> {

    ListItem findListItemById(long id);

    void deleteListItemById(long id);

}
