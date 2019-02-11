package com.kurssach.description;

import com.kurssach.interfaces.Clean;
import lombok.Data;

public @Data
class DataSet<T> implements Clean<T> {
    private T[][] list;

    public DataSet(T[][] list) {
        this.list = list;
    }


    public void add(int i, int j, T value) {
        list[i][j] = value;
    }
}


