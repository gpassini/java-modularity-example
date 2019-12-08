package com.smart.text.analyser.word;

import com.smart.text.analyser.SmartTextAnalyser;

import java.util.List;
import java.util.stream.Stream;

public class SmartTextWordCounter implements SmartTextAnalyser {

    @Override
    public void analyze(List<String> lines) {
        final long wordCount = lines
                .stream()
                .map(line -> line.split(" "))
                .flatMap(Stream::of)
                .count();

        System.out.println("Word count: " + wordCount);
    }
}
