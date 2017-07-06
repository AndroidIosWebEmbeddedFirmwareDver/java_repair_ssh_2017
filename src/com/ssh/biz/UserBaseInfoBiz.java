package com.ssh.biz;  
  
import java.util.List;  
  
import javax.annotation.Resource;  
  
import org.springframework.stereotype.Service;  
  
import com.ssh.biz.impl.UserBaseInfoBizImpl;  
import com.ssh.dao.impl.UserBaseInfoDaoImpl;  
import com.ssh.entity.UserBaseInfo;  
  
@Service("UserService")  
public class UserBaseInfoBiz implements UserBaseInfoBizImpl{  
      
    @Resource(name = "UserBaseInfoDao")  
    private UserBaseInfoDaoImpl usesBaseInfoDao;  
      
    public List<UserBaseInfo> findUserBaseInfo(){  
        return usesBaseInfoDao.findUserBaseInfo();  
    }  
  
}  