package com.czxy.controller;

import com.czxy.domain.Position;
import com.czxy.service.PositionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author huangdonghu
 * @version 1.0
 * @date 2019/7/31 11:36
 */
@RestController
@RequestMapping("/position")
public class PositionController {

    @Resource
    private PositionService positionService;

    /**
     * 查询多有的职位信息
     * @return
     */
    @GetMapping("/findAllPosition")
    public ResponseEntity<List<Position>> findAllPosition(){
        try {
            List<Position> list= positionService.findAllPosition();
            return new ResponseEntity<>(list, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
