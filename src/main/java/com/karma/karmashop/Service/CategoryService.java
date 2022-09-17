package com.karma.karmashop.Service;

import com.karma.karmashop.Domain.Category;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public interface CategoryService {
    List<Category> findByNameContaining(String name);

    Page<Category> findByNameContaining(String name, Pageable pageable);

    List<Category> findAll();

    List<Category> findAll(Sort sort);

    List<Category> findAllById(Iterable<Long> longs);

    <S extends Category> List<S> saveAll(Iterable<S> entities);

    void flush();

    <S extends Category> S saveAndFlush(S entity);

    <S extends Category> List<S> saveAllAndFlush(Iterable<S> entities);

    void deleteAllInBatch(Iterable<Category> entities);

    void deleteAllByIdInBatch(Iterable<Long> longs);

    void deleteAllInBatch();

    Category getById(Long aLong);

    Page<Category> findAll(Pageable pageable);

    <S extends Category> S save(S entity);

    Optional<Category> findById(Long aLong);

    boolean existsById(Long aLong);

    long count();

    void deleteById(Long aLong);

    void delete(Category entity);

    void deleteAllById(Iterable<? extends Long> longs);

    void deleteAll(Iterable<? extends Category> entities);

    void deleteAll();

    <S extends Category> boolean exists(Example<S> example);
}
