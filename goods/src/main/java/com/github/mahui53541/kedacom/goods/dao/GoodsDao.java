package com.github.mahui53541.kedacom.goods.dao;

import com.github.mahui53541.kedacom.goods.domain.Goods;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @description:
 * @author: MaHui
 * @created: 2017/12/26 15:45
 * @version:1.0.0
 */
@Repository
public interface GoodsDao extends JpaRepository<Goods,Long> {
}