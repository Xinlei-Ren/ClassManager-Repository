package com.czxy.controller;

import com.czxy.domain.Pcd;
import com.czxy.service.PcdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author xixilidemeilichuanshuo
 * @version 1.0
 * @date 2019.7.31 09:46
 */
@RestController
@RequestMapping("/pcd")
public class PcdController {

    /*城市服务*/
    @Autowired
    private PcdService pcdService;

    /**
     * 查询所有省份信息
     * @return
     */
    @GetMapping("/findP")
    public ResponseEntity<List<Pcd>>findP(){
        try {
            List<Pcd> pcdList = pcdService.findP();
            return new ResponseEntity<>(pcdList, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    /**
     * 根据id查询市，区信息
     * @param id
     * @return
     */
    @GetMapping("/findCD")
    public ResponseEntity<List<Pcd>>findCD(Integer id){
        try {
            List<Pcd> pcdList = pcdService.findCD(id);
            return new ResponseEntity<>(pcdList, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
