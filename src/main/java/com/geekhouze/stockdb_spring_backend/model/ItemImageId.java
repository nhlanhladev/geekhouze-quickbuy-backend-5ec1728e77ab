package com.geekhouze.stockdb_spring_backend.model;

import java.io.Serializable;
import java.util.Objects;

public class ItemImageId implements Serializable {

    private static final long serialVersionUID = -2834827403836993112L;

    private Item item;
    private Image image;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemImageId that = (ItemImageId) o;
        return Objects.equals(item, that.item) &&
                Objects.equals(image, that.image);
    }

    @Override
    public int hashCode() {
        return Objects.hash(item, image);
    }
}
