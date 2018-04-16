/**
 * Copyright (C) 2017 PatSnap Pte Ltd, All Rights Reserved.
 */
package com.job.dao;

import com.job.common.util.FieldUtil;
import com.job.enumerate.EntityEnum;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import java.util.Optional;

/**
 * Author: Tory
 * Date: 4/23/17
 * Time: 6:27 PM
 */
interface BaseRespository<T, ID extends Serializable> extends PagingAndSortingRepository<T, ID> {

    default void saveUnset(T entity) {
        try {
            Object id = FieldUtil.getFieldValueByName(EntityEnum.FIELD_ID.getName(), entity);
            if (Objects.isNull(id)) {
                save(entity);
                return;
            }
            Optional<T> optional = findById((ID) id);
            save(optional.get());
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
