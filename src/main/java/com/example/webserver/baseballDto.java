package com.example.webserver;

import lombok.Data;

@Data
public class baseballDto {

    private int idx;
    private String team;

    private String image;


    public baseballDto(int idx, String team,String image){
        this.idx=idx;
        this.team=team;
        this.image=image;

    }


    @Override
    public String toString() {
        return "baseballDto{" +
                "idx=" + idx +
                ", team='" + team + '\'' +
                ", image='" + image + '\'' +
                '}';
    }

}
