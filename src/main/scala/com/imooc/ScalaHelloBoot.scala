package com.imooc

import org.springframework.web.bind.annotation.{RequestMapping, RequestMethod, RestController}

@RestController
class ScalaHelloBoot {

  @RequestMapping(value = Array("/sayScalaHello"), method = Array(RequestMethod.GET))
  def sayHello(): String = {
    "hello scala boot......"
  }
}
