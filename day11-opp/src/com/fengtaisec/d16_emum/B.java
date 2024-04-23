package com.fengtaisec.d16_emum;

public enum B {
    // 抽象枚举
    X(){
        @Override
        public void go() {

        }
    },Y("张三"){
        @Override
        public void go() {
            System.out.println("在跑~~~");
        }
    };

    B(String name) {
        this.name = name;
    }

    B() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public abstract void go();
}
