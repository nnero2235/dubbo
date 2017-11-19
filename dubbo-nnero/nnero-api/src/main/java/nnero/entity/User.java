package nnero.entity;

import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Author: NNERO
 * Time: 2017/11/19 17:58
 **/
@Data
public class User implements Serializable{

    private static final long serialVersionUID = -8608648489017692470L;

    private String name;

    private int status;

    private String password;

    private Timestamp startTime;

}
