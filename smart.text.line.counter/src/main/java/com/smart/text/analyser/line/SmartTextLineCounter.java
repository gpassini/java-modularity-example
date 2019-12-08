package com.smart.text.analyser.line;

import com.smart.text.analyser.SmartTextAnalyser;

import java.util.List;

public class SmartTextLineCounter implements SmartTextAnalyser {
    @Override
    public void analyze(List<String> lines) {
        System.out.println("Line count: " + lines.size());
    }
}
