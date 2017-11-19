package me.nnero.rpc;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.google.common.base.Strings;
import me.nnero.repo.UserRepo;
import nnero.api.UserService;
import nnero.common.RPCStatus;
import nnero.entity.User;
import nnero.entity.rpc.RPCRequest;
import nnero.entity.rpc.RPCResponse;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.List;

/**
 * Author: NNERO
 * Time: 2017/11/19 22:15
 **/
@Service(interfaceClass = UserService.class, timeout = 100)
public class UserServiceImpl implements UserService {

    @Resource
    UserRepo userRepo;

    @Override
    public RPCResponse<User> getUserByName(RPCRequest request) {
        String name = (String) request.getData();
        if(Strings.isNullOrEmpty(name)){
            return new RPCResponse<User>(RPCStatus.CODE_FAIL,"name is null or empty");
        }
        User user = userRepo.getUser(name);
        if(user == null){
            return new RPCResponse<User>(RPCStatus.CODE_SUCCESS,"can't find user with name:"+name);
        }
        RPCResponse<User> response = new RPCResponse<User>(RPCStatus.CODE_SUCCESS,"");
        response.setData(user);
        return response;
    }

    @Override
    public RPCResponse<List<User>> listUsers(RPCRequest request) {
        RPCResponse<List<User>> response = new RPCResponse<List<User>>(RPCStatus.CODE_SUCCESS,"");
        response.setData(userRepo.listUsers());
        return response;
    }
}
