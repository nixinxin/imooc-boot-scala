package com.imooc.service;

import com.imooc.domain.MetaDatabase;
import com.imooc.repository.MetaDatabaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class MetaDatabaseService {
    @Autowired
    private MetaDatabaseRepository metaDatabaseRepository;

    @Transactional
    public void save(MetaDatabase metaDatabase) {
        metaDatabaseRepository.save(metaDatabase);
    }

    @Transactional
    public Iterable<MetaDatabase> query() {
        return metaDatabaseRepository.findAll();
    }
}
