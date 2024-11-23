package io.github.astankowski.coilscribe.list;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "list_items")
public class ListItem {
    @Id
    @Generated
    private UUID id;
    private String description;
    private Boolean isChecked;
    private UUID ListId;
}
