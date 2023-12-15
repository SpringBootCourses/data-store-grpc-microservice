package com.example.datastore.web.mapper;

import java.util.List;

public interface Mappable<E, D> {

    D toDto(E e);

}
