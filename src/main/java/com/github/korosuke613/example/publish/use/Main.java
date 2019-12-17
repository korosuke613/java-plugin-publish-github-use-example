package com.github.korosuke613.example.publish.use;

import com.github.korosuke613.example.publish.Sample;

public class Main {
    public static void main(String[] args) {
        Sample sample = new Sample();

        System.out.println(sample.sum(1, 2));
        System.out.println(sample.sum("Hello ", "GitHub Package Registry"));
    }
}

