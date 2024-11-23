package io.github.astankowski.coilscribe.list;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ListItemService {
    @Autowired
    private ListItemRepository listItemRepository;

    public Iterable<ListItem> getAllListItems() {
        return listItemRepository.findAll();
    }

    public Optional<ListItem> getListItemById(Long id) {
        return listItemRepository.findById(id);
    }

    public ListItem save(ListItem listItem) {
        return listItemRepository.save(listItem);
    }

    public void delete(ListItem listItem) {
        listItemRepository.delete(listItem);
    }

}
