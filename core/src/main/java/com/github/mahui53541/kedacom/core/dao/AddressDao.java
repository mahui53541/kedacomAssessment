package com.github.mahui53541.kedacom.core.dao;

import com.github.mahui53541.kedacom.core.domain.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @description:
 * @author: MaHui
 * @created: 2017/12/26 15:44
 * @version:1.0.0
 */
@Repository
public interface AddressDao extends JpaRepository<Address,Long>{
}
