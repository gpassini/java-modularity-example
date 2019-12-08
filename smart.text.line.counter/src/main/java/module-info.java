import com.smart.text.analyser.SmartTextAnalyser;
import com.smart.text.analyser.line.SmartTextLineCounter;

module smart.text.line.counter {
    requires smart.text.analyser;
    provides SmartTextAnalyser with SmartTextLineCounter;
}