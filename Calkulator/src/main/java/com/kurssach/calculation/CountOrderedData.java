package com.kurssach.calculation;

import com.kurssach.description.OrderedData;
import com.kurssach.interfaces.Clean;

public class CountOrderedData extends OrderedData implements Clean<Double> {
    public CountOrderedData(Double[][] list) {
        super(list);
    }

    public void plusAndMinus(int row, int column, Double[][] firstMatrix, Double[][] secondMatrix, boolean action) {
        setList(clean(getList(), row, column, 0.0));
        if (action) {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    getList()[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
                }
            }
        } else {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    getList()[i][j] = firstMatrix[i][j] - secondMatrix[i][j];
                }
            }
        }
    }

    public Double[][] transposing(int row, int column, Double[][] matrix) {
        setList(clean(getList(), row, column, 0.0));
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                getList()[j][i] = matrix[i][j];
            }
        }
        return getList();
    }

    public void multiplicationByNumber(int row, int column, Double[][] matrix, double number) {
        setList(clean(getList(), row, column, 0.0));
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                getList()[i][j] = matrix[i][j] * number;
            }
        }
    }

    public Double[][] multiplication(int firstRow, int firstColumn, int secondRow, int secondColumn, Double[][] firstMatrix, Double[][] secondMatrix) {
        setList(clean(getList(), firstRow, secondColumn, 0.0));
        Double[][] buff = new Double[firstRow][secondColumn];
        buff = clean(buff, firstRow, secondColumn, 0.0);
        for (int i = 0; i < firstRow; ++i) {
            for (int j = 0; j < secondColumn; ++j) {
                for (int k = 0; k < firstColumn; ++k) {
                    buff[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }
        setList(buff);
        return getList();
    }
}
