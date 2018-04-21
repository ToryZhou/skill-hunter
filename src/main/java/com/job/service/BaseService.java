package com.job.service;

import com.job.entity.BaseEntity;

import java.util.Objects;

public class BaseService {
    void initSave(BaseEntity baseEntity) {
        if (Objects.isNull(baseEntity.getId())) {
            initialPropertiesForCreatedObject(baseEntity);
        } else {
            initialPropertiesForUpdatedObject(baseEntity);
        }
    }

    private void initialPropertiesForCreatedObject(BaseEntity baseEntity) {
        baseEntity.setDataChangeCreatedBy("admin");
        baseEntity.setDataChangeLastModifiedBy("admin");
    }

    private void initialPropertiesForUpdatedObject(BaseEntity baseEntity) {
    }
}
