package com.fengtaisec.d16_emum;

public enum A {
    // 注意事项：枚举的第一行必须罗列的事枚举对象的名字
    X, Y, Z;

    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
