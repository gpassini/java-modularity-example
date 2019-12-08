import com.smart.text.analyser.SmartTextAnalyser;
import com.smart.text.analyser.word.SmartTextWordCounter;

module smart.text.word.counter {
    requires smart.text.analyser;
    provides SmartTextAnalyser with SmartTextWordCounter;
}