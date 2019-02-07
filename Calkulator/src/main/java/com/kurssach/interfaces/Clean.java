package com.kurssach.interfaces;

public interface Clean<T> {
    default T[][] clean(T[][]list,int row,int column,T buff){
        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                list[i][j]=buff;
            }
        }
        return list;
    }
}
