package io.github.astankowski.coilscribe.list;

import jakarta.persistence.Id;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.UUID;


@Getter
@Setter
public class List {
    @Id
    @Generated
    private UUID id;
    private ArrayList<ListItem> listItems;
}
