package com.imooc.respository

import com.imooc.domain.MetaTable
import org.springframework.data.repository.CrudRepository

trait MetaTableRespository extends CrudRepository[MetaTable, Int]{

}
