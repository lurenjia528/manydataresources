package com.lurenjia.manydataresources.repository2;

import com.lurenjia.manydataresources.entity.DMUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author yanggt
 * @date 18-12-3
 */
@Repository
public interface UserRepository2 extends JpaRepository<DMUser,Integer> {
}
