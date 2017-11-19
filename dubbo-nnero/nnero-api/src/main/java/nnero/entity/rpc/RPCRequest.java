package nnero.entity.rpc;

import lombok.Data;

import java.io.Serializable;

/**
 * Author: NNERO
 * Time: 2017/11/19 17:58
 **/
@Data
public class RPCRequest implements Serializable{

    private static final long serialVersionUID = 341063544906523620L;

    private Object data;

}
