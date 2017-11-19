package nnero.api;

import nnero.entity.User;
import nnero.entity.rpc.RPCRequest;
import nnero.entity.rpc.RPCResponse;

import java.util.List;

/**
 * Author: NNERO
 * Time: 2017/11/19 17:57
 **/
public interface UserService {

    RPCResponse<User> getUserByName(RPCRequest request);

    RPCResponse<List<User>> listUsers(RPCRequest request);
}
