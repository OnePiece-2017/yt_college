package com.acsm.ytcollege.repository;

import com.acsm.ytcollege.entity.EnterprisePosition;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.Date;

/**
 * @Author : RedCometJ
 * @Description :
 * @Date : Create in 22:24 2017/12/17
 */
public interface JobEnterprisePositionRepository extends JpaRepository<EnterprisePosition,Integer>,JpaSpecificationExecutor<EnterprisePosition> {
   //招募中
   public Page<EnterprisePosition> findByEnterpriseIdAndStateAndExpirationTimeLessThanEqual(Integer eterpriseId, Integer state, Date nowDate , Pageable page);
   //已过期
   public Page<EnterprisePosition> findByEnterpriseIdAndStateAndExpirationTimeGreaterThanEqual(Integer eterpriseId, Integer state, Date nowDate , Pageable page);
   //未发布
   public Page<EnterprisePosition> findByEnterpriseIdAndState(Integer eterpriseId, Integer state, Pageable page);
}
