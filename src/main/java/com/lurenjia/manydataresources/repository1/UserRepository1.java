package com.lurenjia.manydataresources.repository1;


import com.lurenjia.manydataresources.entity.MysqlUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author yanggt
 * @date 18-12-3
 */
@Repository
public interface UserRepository1 extends JpaRepository<MysqlUser,Integer> {
}
