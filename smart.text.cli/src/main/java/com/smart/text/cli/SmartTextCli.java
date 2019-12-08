package com.smart.text.cli;

import com.smart.text.analyser.SmartTextAnalyser;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.ServiceLoader;

public class SmartTextCli {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a text file path");
            return;
        }
        final var filePath = args[0];

        final List<String> lines;
        System.out.println("Reading " + filePath);
        try {
            lines = Files.readAllLines(Paths.get(filePath), StandardCharsets.UTF_8);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        final var textAnalyserServiceLoader = ServiceLoader.load(SmartTextAnalyser.class);
        textAnalyserServiceLoader.forEach(analyser -> analyser.analyze(lines));
    }
}
