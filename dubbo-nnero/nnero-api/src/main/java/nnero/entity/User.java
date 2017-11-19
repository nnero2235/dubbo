package nnero.entity;

import lombok.Data;

import java.sql.Timestamp;

/**
 * Author: NNERO
 * Time: 2017/11/19 17:58
 **/
@Data
public class User {

    private String name;

    private int status;

    private String password;

    private Timestamp startTime;

}
