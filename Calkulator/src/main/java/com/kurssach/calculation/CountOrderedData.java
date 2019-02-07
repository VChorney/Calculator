package com.kurssach.calculation;

import com.kurssach.description.OrderedData;
import com.kurssach.interfaces.Clean;

public class CountOrderedData extends OrderedData implements Clean<Double> {
    public CountOrderedData(Double[][] firstMatrix, Double[][] secondMatrix, Double[][] resultMatrix) {
        super(firstMatrix, secondMatrix, resultMatrix);
    }

    public void plusAndMinus(int row, int column, Double[][] firstMatrix, Double[][] secondMatrix, boolean action) {
        setResultList(clean(getResultList(), row, column, 0.0));
              if (action){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                getResultList()[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }
        } else {
            for (int i=0;i<row;i++){
                for (int j=0;j<column;j++){
                    getResultList()[i][j]=firstMatrix[i][j]-secondMatrix[i][j];
                }
            }
        }
    }

    public Double[][] transposing(int row, int column, Double[][] matrix) {
        setResultList(clean(getResultList(), row, column, 0.0));
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                getResultList()[j][i] = matrix[i][j];
            }
        }
        return getResultList();
    }

    public void multiplicationByNumber(int row, int column, Double[][] matrix, double number) {
        setResultList(clean(getResultList(), row, column, 0.0));
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                getResultList()[i][j] = matrix[i][j] * number;
            }
        }
    }

    public Double[][] multiplication(int firstRow, int firstColumn, int secondRow, int secondColumn, Double[][] firstMatrix, Double[][] secondMatrix) {
        setResultList(clean(getResultList(), firstRow, secondColumn, 0.0));
        Double[][] buff = new Double[firstRow][secondColumn];
        buff = clean(buff, firstRow, secondColumn, 0.0);
        for (int i = 0; i < firstRow; ++i) {
            for (int j = 0; j < secondColumn; ++j) {
                for (int k = 0; k < firstColumn; ++k) {
                    buff[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }
        setResultList(buff);
        return getResultList();
    }
}
