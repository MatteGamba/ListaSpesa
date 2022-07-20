package com.gamba.listaspesa.repository;

import com.gamba.listaspesa.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepo extends JpaRepository<Item, Long> {

    void deleteItemById(long id);

}
