package com.imooc.service;

import com.imooc.domain.MetaDatabase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Collections;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MetaDatabaseServiceTest {

    @Autowired
    private MetaDatabaseService metaDatabaseService;

    @Test
    public void testSave() {
        MetaDatabase metaDatabase = new MetaDatabase();
        metaDatabase.setName("default");
        metaDatabase.setLocation("/user/hive/table.xml");
        metaDatabaseService.save(metaDatabase);
    }
    @Test
    public void testQuery() {
        Iterable<MetaDatabase> metaDatabaseIter = metaDatabaseService.query();
        for (MetaDatabase metaDatabase : metaDatabaseIter) {
            System.out.println(metaDatabase);
        }
    }
}
