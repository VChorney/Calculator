package com.classes;
import lombok.Data;

public @Data abstract class OrderedData<T extends Number> extends DataSet<Object>{
    private T number;
    private boolean action;

    public OrderedData(Object[][] firstMatrix, Object[][] secondMatrix, Object[][] resultMatrix) {
        super(firstMatrix, secondMatrix, resultMatrix);
    }

    protected Object[][] plusAndMinus(int column, int row, Double[][]firstMatrix, Double[][]secondMatrix, boolean action){
        setSecondList(clean(getResultList()));
        if (action){
        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                getResultList()[i][j]=firstMatrix[i][j]+secondMatrix[i][j];
            }
        }
            } else {
            for (int i=0;i<row;i++){
                for (int j=0;j<column;j++){
                    getResultList()[i][j]=firstMatrix[i][j]-secondMatrix[i][j];
                }
            }
        }
        return getResultList();
    }
    protected Object[][] transposing(int column,int row, Double[][] matrix){
        setResultList(clean(getResultList()));
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                getResultList()[j][i]=matrix[i][j];
            }
        }
        return getResultList();
    }

    protected Object[][] multiplicationByNumber(int column,int row,Double[][]matrix, double number){
        setResultList(clean(getResultList()));
        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                getResultList()[i][j]=matrix[i][j]*number;
            }
        }
        return getResultList();
    }
    abstract Object[][] multiplication(int firstColumn,int firstRow,int secondColumn, int secondRow, Double[][]firstMatrix,Double[][]secondMatrix);
}
