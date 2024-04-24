package com.fengtaisec.d3_math;

import java.io.IOException;
import java.io.PipedReader;

public class RuntimeTest {
    public static void main(String[] args) throws IOException, InterruptedException {
        // Runtime的常见方法
        Runtime r = Runtime.getRuntime();
        // System.out.println(r);
        // r.exit(0); // 终止当前的虚拟机

        System.out.println(r.availableProcessors()); // 获取虚拟机能够处理的处理器数量
        System.out.println(r.totalMemory() / 1024.0 / 1024.0 + "MB"); // 返回java虚拟机中的内存总量 1024 = 1k
        System.out.println(r.freeMemory() / 1024.0 / 1024.0 + "MB"); // 返回java虚拟机的可用内存

        // r.exec("C:\\Program Files\\bilibili\\哔哩哔哩.exe");
        Process p = r.exec("QQ");
        Thread.sleep(5000); // 程序在这里暂停5s
        p.destroy();

    }
}
