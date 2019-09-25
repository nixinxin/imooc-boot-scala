package com.imooc.service

import java.lang

import com.imooc.domain.MetaTable
import com.imooc.respository.MetaTableRespository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class MetaTableService @Autowired()(metaTableRespository: MetaTableRespository) {

  def save(metaTable: MetaTable): MetaTable = {
    metaTableRespository.save(metaTable)
  }

  def query(): lang.Iterable[MetaTable] = {
    metaTableRespository.findAll()
  }
}
