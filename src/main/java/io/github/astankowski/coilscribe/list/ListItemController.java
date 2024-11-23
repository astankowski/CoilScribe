package io.github.astankowski.coilscribe.list;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/list")
public class ListItemController {
    @Autowired
    private  ListItemService listItemService;

}
