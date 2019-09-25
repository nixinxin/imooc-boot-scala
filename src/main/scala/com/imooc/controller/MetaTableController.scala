package com.imooc.controller

import com.imooc.domain.MetaTable
import com.imooc.service.MetaTableService
import com.imooc.utils.{ResultVO, ResultVOUtil}
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.{ModelAttribute, RequestBody, RequestMapping, RequestMethod, RestController}

@RestController
@RequestMapping(value = Array("/meta/table"))
class MetaTableController @Autowired()(metaTableService: MetaTableService) {

  @RequestMapping(value = Array("/"), method = Array(RequestMethod.POST))
  @RequestBody
  def save(@ModelAttribute metaTable: MetaTable): ResultVO[_] = {
    metaTableService.save(metaTable)
    ResultVOUtil.success()
  }
  @RequestMapping(value = Array("/"), method = Array(RequestMethod.GET))
  @RequestBody
  def query(): ResultVO[_] = {
    ResultVOUtil.success(metaTableService.query())
  }
}
