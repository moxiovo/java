package com.fengtaisec.define;

public class ArrayTest7 {
    public static void main(String[] args) {
        int [] faceScores ={15, 9000, 10000, 20000, 9500, -5};
        int max = faceScores[0];
        for (int i = 1; i < faceScores.length; i++) {
            // 判断一下当前遍历的数据，是否大于最大值变量max的数据，如果大于，遍历的数据存给max。
            if (faceScores[i] > max){
                max = faceScores[i];
            }
        }
        System.out.println("最大值为：" + max);
    }
}
