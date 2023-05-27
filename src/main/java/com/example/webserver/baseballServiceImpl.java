package com.example.webserver;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class baseballServiceImpl implements baseballService{
    private ArrayList<baseballDto> db = new ArrayList<>();

    public baseballServiceImpl(){
        System.out.println("baseballServiceImpl 객체 생성");
        db.add(new baseballDto(1, "ssg","templates/kbologo/SK.png"));
        db.add(new baseballDto(2, "lg","templates/kbologo/LG.png"));
        db.add(new baseballDto(3,  "두산","templates/kbologo/OB.png"));
        db.add(new baseballDto(4, "키움","templates/kbologo/WO.png"));
        db.add(new baseballDto(5,  "kia","templates/kbologo/HT.png"));
        db.add(new baseballDto(6, "삼성","templates/kbologo/SS.png"));
        db.add(new baseballDto(7, "롯데","templates/kbologo/LT.png"));
        db.add(new baseballDto(8, "nc","templates/kbologo/NC.png"));
        db.add(new baseballDto(9, "kt","templates/kbologo/KT.png"));
        db.add(new baseballDto(10, "한화","templates/kbologo/HH.png"));

    }

    @Override
    public ArrayList<baseballDto> select() {
        return db;
    }
    public baseballDto  read(int idx) {
        baseballDto ret = db.stream().filter(m -> m.getIdx() == idx).findAny().get() ;
        return ret;
    }
    @Override
    public int count() {
        return db.size();
    }
}