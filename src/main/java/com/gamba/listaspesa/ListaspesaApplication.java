package com.gamba.listaspesa;

import com.gamba.listaspesa.model.Item;
import com.gamba.listaspesa.model.ListItem;
import com.gamba.listaspesa.repository.ItemRepo;
import com.gamba.listaspesa.repository.ListItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ListaspesaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ListaspesaApplication.class, args);
	}

	@Autowired
	private ItemRepo itemRepo;
	@Autowired
	private ListItemRepo listItemRepo;

	@Override
	public void run(String... args) throws Exception {

//		Item I1 = Item.builder()
//				.title("Latte")
//				.quantity(2)
//				.build();
//		Item I2 = Item.builder()
//				.title("Caffè")
//				.quantity(2)
//				.build();
//		Item I3 = Item.builder()
//				.title("Biscotti")
//				.quantity(3)
//				.build();
//		List<Item> items = new ArrayList<Item>();
//		items.add(I1);
//		items.add(I2);
//		items.add(I3);
//
//		ListItem L1 = ListItem.builder()
//				.title("Carrefour")
//				.items(items).build();
//		ListItem L2 = ListItem.builder()
//				.title("Bennet")
//				.build();
//
//		itemRepo.save(I1);
//		itemRepo.save(I2);
//		itemRepo.save(I3);
//		listItemRepo.save(L1);
//		listItemRepo.save(L2);



	}
}
