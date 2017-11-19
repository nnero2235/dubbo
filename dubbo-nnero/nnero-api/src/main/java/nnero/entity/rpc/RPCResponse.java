package nnero.entity.rpc;

import lombok.Data;

import java.io.Serializable;

/**
 * Author: NNERO
 * Time: 2017/11/19 17:58
 **/
@Data
public class RPCResponse<T> implements Serializable {
    private static final long serialVersionUID = 4070839584775219860L;

    private T data;

    private String msg;

    private int code;

    public RPCResponse(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
