package com.kurssach.calculation;

import com.kurssach.interfaces.Clean;

public class CountMatrix extends CountOrderedData implements Clean<Double> {
    public CountMatrix(Double[][] matrix) {
        super(matrix);
    }

    public void expoonent(int exponent, int row, int column, Double[][] matrix) {
        setList(clean(getList(), row, column, 0.0));
        Double[][] doubles = new Double[row][column];
        Double[][] buffer = new Double[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                buffer[i][j] = matrix[i][j];
                getList()[i][j] = matrix[i][j];
            }
        }
        for (int t = 1; t < exponent; t++) {
            setList(clean(getList(), row, column, 0.0));
            for (int i1 = 0; i1 < row; i1++) {
                if (column >= 0) System.arraycopy(buffer[i1], 0, doubles[i1], 0, column);
            }
            setList(multiplication(row, column, row, column, doubles, matrix));
            buffer = clean(buffer, row, column, 0.0);
            for (int i = 0; i < row; i++) {
                if (column >= 0) System.arraycopy(getList()[i], 0, buffer[i], 0, column);
            }

        }
    }

    public double determinate(int size, Double[][] matrix) {
        double determinate;
        if (size == 1) {
            determinate = matrix[0][0];

        } else if (size == 2) {
            determinate = matrix[0][0] * matrix[1][1] - matrix[1][0] * matrix[0][1];
        } else {
            determinate = 0;
            Double[][] buffer = new Double[size][size];
            for (int k = 0; k < size; k++) {
                for (int i = 1; i < size; i++) {
                    int j1 = 0;
                    for (int j = 0; j < size; j++) {
                        if (j == k) {
                            continue;
                        }
                        buffer[i - 1][j1] = matrix[i][j];
                        j1++;
                    }
                }
                determinate += Math.pow(-1.0, 1.0 + k + 1.0) * matrix[0][k] * determinate(size - 1, buffer);
            }
        }
        return determinate;
    }

    public void revers(int size, Double[][] matrix) {
        Double[][] minor = new Double[size - 1][size - 1];
        Double[][] united = new Double[size][size];
        united = clean(united, size, size, 0.0);
        Double[][] buffer = new Double[size][size];
        buffer = clean(buffer, size, size, 0.0);
        setList(clean(getList(), size, size, 0.0));

        int k, k1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                k = 0;
                k1 = 0;
                for (int i1 = 0; i1 < size; i1++) {
                    for (int j1 = 0; j1 < size; j1++) {
                        if ((i != i1) && (j != j1)) {
                            minor[k][k1++] = matrix[i1][j1];
                            if (k1 == size - 1) {
                                k1 = 0;
                                k++;
                            }
                        }
                    }
                }
                united[i][j] = Math.pow(-1, i + j) * determinate(size - 1, minor);
            }
        }
        for (int i1 = 0; i1 < size; i1++) {
            for (int j1 = 0; j1 < size; j1++) {
                buffer[i1][j1] = transposing(size, size, united)[i1][j1];
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                getList()[i][j] = buffer[i][j] / determinate(size, matrix);
            }
        }
    }

    public void multiplicationByVector(int row, int column, Double[][] matrix, Double[][] vector) {
        setList(clean(getList(), row, column, 0.0));
        Double[][] buffer = new Double[row][1];
        buffer = clean(buffer, row, 1, 0.0);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                buffer[i][0] += vector[j][0] * matrix[i][j];
            }
        }

        setList(buffer);

    }
}

