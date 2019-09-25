package com.imooc;

import com.imooc.domain.MetaDatabase;
import com.imooc.service.MetaDatabaseService;
import com.imooc.utils.ResultVO;
import com.imooc.utils.ResultVOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/meta/database", method = RequestMethod.GET)
public class MetaDatabaseController {
    @Autowired
    private MetaDatabaseService metaDatabaseService;

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ResultVO save(@ModelAttribute MetaDatabase metaDatabase) {
        metaDatabaseService.save(metaDatabase);
        return ResultVOUtil.success();

    }

    @RequestMapping(value = "/query", method = RequestMethod.GET)
    public ResultVO query() {
        return ResultVOUtil.success(metaDatabaseService.query());

    }


}
