package com.example.wzb.entity;

import lombok.Data;

import java.io.Serializable;
@Data
public class Jiyixian implements Serializable {
    private Long id;
    private String message;
    private String url;
    private String other;
    private String create_time;
    private String update_time;
}
