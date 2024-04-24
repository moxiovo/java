package com.fengtaisec.d1_stringBuidler;

public class Test3 {
    // 完成遍历数组内容，并拼接成指定格式的案例
    public static void main(String[] args) {

    }

    public static String getArrayData(int [] arr){
        // 判断arr是否为null
        if (arr == null){
            return null;
        }
        // arr 数组存在 arr = [11, 22, 33]
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1){
                sb.append(arr[i]);
            }else {
                sb.append(arr[i]).append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}


