package com.classes;
import lombok.Data;

public @Data
class DataSet<T extends Object> {
    private T firstList[][];
    private T secondList[][];
    private T resultList[][];
    private int firstRow;
    private int firstColumn;
    private int secondRow;
    private int secondColumn;
    private int resultRow;
    private int resultColumn;

    public DataSet(T[][] firstList, T[][] secondList, T[][] resultList) {
        this.firstList = firstList;
        this.secondList = secondList;
        this.resultList = resultList;
    }


    protected Object[][] add(int i, int j, T number, int choise){
        if (choise==1){
            getFirstList()[i][j]=number;
            return getFirstList();
        }else
        if (choise==2){
            getSecondList()[i][j]=number;
            return getSecondList();
        }else{
            getResultList()[i][j]=number.toString();
            return getResultList();
        }
    }

    public Object[][] getFirstList() {

        return firstList;
    }
    public Object[][] getSecondList() {

        return secondList;
    }

    public Object[][] getResultList() {

        return resultList;
    }

    protected Number[][] clean(Number[][] matrix){

        for (int i=0;i<resultRow;i++){
            for (int j=0;j<resultColumn;j++){
                matrix[i][j]=0.0;
            }
        }

        return matrix;
    }

    protected Double[][] clean(Double[][] matrix){

        for (int i=0;i<firstRow;i++){
            for (int j=0;j<secondColumn;j++){
                matrix[i][j]=0.0;
            }
        }

        return matrix;
    }
    protected Object[][] clean(Object[][]list){
        for (int i=0;i<resultRow;i++){
            for (int j=0;j<secondColumn;j++){
                list[i][j]=null;
            }
        }
        return list;
    }
}
