package com.test3.springboot.controller;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
public class doubleDigit {
    public static String[] lattertable = { "", "", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ" };

    public ArrayList<String> combinations(int[] number) {

        ArrayList<String> list = new ArrayList<>();

        Queue<String> qlist = new LinkedList<>();

        for (int index : number) {

            String val = numToLatter(index);

            if (!"".equals(val)) {

                if (!qlist.isEmpty()) {

                    int size = qlist.size();
                    int ith = 0;

                    while (size > ith) {
                        String s = qlist.remove();
                        for (int i = 0; i < val.length(); i++) {
                            qlist.add(s + val.charAt(i));
                        }
                        ith++;
                    }
                } else {

                    for (int i = 0; i < val.length(); i++) {
                        qlist.add(String.valueOf(val.charAt(i)));
                    }
                }
            }

        }

        list.addAll(qlist);

        return list;

    }

    public String numToLatter(int index) {

            if(index < lattertable.length) {

                return lattertable[index];
            }else {
                if (index > 99 || index < 0) {
                    throw new IllegalArgumentException("请输入0-99的数字");
                } else {

                    int tens = index / 10;
                    int digit = index % 10;
                    return lattertable[tens] + lattertable[digit];
                }
        }
    }


}



