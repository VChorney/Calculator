package com.kurssach.calculation;

import com.kurssach.description.DataSet;
import com.kurssach.interfaces.Clean;

public class CountSets extends DataSet<String> implements Clean<String> {
    public CountSets(String[][] set) {
        super(set);
    }

    public void merge(int firstPower, int secondPower, String[][] firstSet, String[][] secondSet) {
        int i, f;
        setList(clean(getList(), 1, firstPower + secondPower, ""));
        for (i = 0; i < firstPower; i++) {
            getList()[0][i] = firstSet[0][i];
        }
        for (int k = 0; k < secondPower; k++) {
            f = 0;
            for (int j = 0; j < firstPower; j++) {
                if (getList()[0][j].equals(secondSet[0][k])) {
                    f = 1;
                }
            }
            if (f != 1) {
                firstPower++;
                getList()[0][i] = secondSet[0][k];
                i++;
            }
        }

    }

    public void cross(int firstPower, int secondPower, String[][] firstSet, String[][] secondSet) {
        int k = 0;
        setList(clean(getList(), 1, firstPower + secondPower, ""));
        String[][] strings = new String[1][firstPower + secondPower];
        for (int i = 0; i < firstPower; i++) {
            for (int j = 0; j < secondPower; j++) {
                if (firstSet[0][i].equals(secondSet[0][j])) {
                    strings[0][k++] = firstSet[0][i];
                    setList(strings);
                }
            }
        }
    }

    public int difference(int firstPower, int secondPower, String[][] firstSet, String[][] secondSet) {
        int k = 0;
        setList(clean(getList(), 1, firstPower + secondPower, ""));
        for (int i = 0; i < firstPower; i++) {
            int f = 0;
            for (int j = 0; j < secondPower; j++) {
                if (firstSet[0][i].equals(secondSet[0][j])) {
                    f = 1;
                }
            }
            if (f == 0) {
                getList()[0][k++] = firstSet[0][i];
            }
        }
        return k;
    }

    public int differentDifference(int firstPower, int secondPower, String[][] firstSet, String[][] secondSet) {
        int k = 0;
        for (int i = 0; i < secondPower; i++) {
            int f = 0;
            for (int j = 0; j < firstPower; j++) {
                if (secondSet[0][i].equals(firstSet[0][j])) {
                    f = 1;
                }
            }
            if (f == 0) {
                getList()[0][k++] = secondSet[0][i];
            }
        }
        return k;
    }

    public void addition(int firstPower, int secondPower, String[][] firstSet, String[][] secondSet) {
        int k = 0, f;
        setList(clean(getList(), 1, firstPower + secondPower, ""));
        for (int i = 0; i < firstPower; i++) {
            f = 0;
            for (int j = 0; j < secondPower; j++) {
                if (firstSet[0][i].equals(secondSet[0][j])) {
                    f = 1;
                }
            }
            if (f == 0) {
                getList()[0][k++] = firstSet[0][i];
            }
        }
        for (int i = 0; i < secondPower; i++) {
            f = 0;
            for (int j = 0; j < firstPower; j++) {
                if (secondSet[0][i].equals(firstSet[0][j])) {
                    f = 1;
                }
            }
            if (f == 0) {
                getList()[0][k++] = secondSet[0][i];
            }
        }

    }
}
