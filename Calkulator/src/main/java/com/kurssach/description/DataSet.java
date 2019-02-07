package com.kurssach.description;

import com.kurssach.interfaces.Clean;
import lombok.Data;

public@Data
class DataSet<T> implements Clean<T> {
    private T[][] firstList;
    private T[][] secondList;
    private T[][] resultList;

    public DataSet(T[][] firstList, T[][] secondList, T[][] resultList) {
        this.firstList = firstList;
        this.secondList = secondList;
        this.resultList = resultList;
    }



    public void add(int i, int j, T value, int choise) {


        if (choise == 1) {
            firstList[i][j]=value;
        } else
            secondList[i][j] = value;
        }

    }


