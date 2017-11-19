package me.nnero.rpc;

import com.alibaba.dubbo.config.annotation.Reference;
import lombok.extern.slf4j.Slf4j;
import nnero.api.UserService;
import nnero.common.RPCStatus;
import nnero.entity.User;
import nnero.entity.rpc.RPCRequest;
import nnero.entity.rpc.RPCResponse;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author: NNERO
 * Time: 2017/11/19 22:46
 **/
@Service
public class UserAction {

    @Reference(interfaceClass = UserService.class, timeout = 100)
    private UserService userService;


    public User getUser(String name){
        RPCRequest request = new RPCRequest();
        request.setData(name);
        RPCResponse<User> response = userService.getUserByName(request);
        if(response.getCode() == RPCStatus.CODE_SUCCESS) {
            return response.getData();
        } else {
            System.out.println(response.getMsg());
            return null;
        }
    }

    public List<User> listUsers(){
        RPCRequest request = new RPCRequest();
        RPCResponse<List<User>> response = userService.listUsers(request);
        return response.getData();
    }
}
