# java-modularity-example
![](https://github.com/gpassini/java-modularity-example/workflows/CI/badge.svg)

Practicing with the Java Platform Module System

## Compiling
```
javac -d out --module-source-path "./*/src/" $(find . -name *.java)
```

## Running
```
java -p out -m smart.text.cli/com.smart.text.cli.SmartTextCli input-text.txt
```
