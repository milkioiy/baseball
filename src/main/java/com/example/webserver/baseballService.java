package com.example.webserver;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public interface baseballService {
    public ArrayList<baseballDto> select();
    public baseballDto  read(int idx);
    public int count();
}