package com.example.demo.services;

import com.example.demo.entities.Base;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;

public interface BaseService<E extends Base, ID extends Serializable> {

    List<E> findAll() throws Exception;
    E findById(ID id) throws Exception;
    Page<E> findAll(Pageable pageable) throws Exception;
    E save (E entity) throws Exception;
    E update (E entity, ID id) throws Exception;
    boolean delete (ID id) throws Exception;

}
