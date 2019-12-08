# java-modularity-example
![](https://github.com/gpassini/java-modularity-example/workflows/CI/badge.svg)

Practicing with the Java Platform Module System

## Compiling
With classes :
```
javac -d out --module-source-path "./*/src/" $(find . -name *.java)
```

## Running
With classes :
```
java -p out -m smart.text.cli/com.smart.text.cli.SmartTextCli input-text.txt
```
With JARs (eg. built by Maven):
```
java -p "$(find . -name *.jar | tr '\n' ';')" -m smart.text.cli/com.smart.text.cli.SmartTextCli input-text.txt
```
