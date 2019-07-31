package com.czxy.service;

import com.czxy.domain.Pcd;

import java.util.List;

/**
 * @author xixilidemeilichuanshuo
 * @version 1.0
 * @date 2019.7.31 09:51
 */
public interface PcdService  {
    /**
     * 省
     * @return
     */
    List<Pcd> findP();

    /**
     * 市区
     * @param id
     * @return
     */
    List<Pcd> findCD(Integer id);
}
