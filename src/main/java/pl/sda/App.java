package pl.sda;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

public class App {
    public static void main(String[] args) throws IOException {
        String filePath = "src\\test\\resources\\cardNumbers.csv";
        String fileWithRulesPath = "src\\test\\resources\\rules.csv";
        if (args != null && args.length > 0) {
            filePath = args[0];
            if (args.length > 1) {
                fileWithRulesPath = args[1];
            }
        }
        Card[] cards = getValidationResults(filePath, fileWithRulesPath);
        System.out.println(Arrays.asList(cards));
    }

    public static Card[] getValidationResults(String filePath, String fileWithRulesPath) throws IOException {
        CSVFileReader reader = new CSVFileReader();
        List<LinkedHashMap> rules = reader.read(fileWithRulesPath);
        List<LinkedHashMap> numbers = reader.read(filePath);
        String[] array = new String[numbers.size()];
        Card[] cards = new Card[numbers.size()];
        for (int i = 0; i < numbers.size(); i++) {
            array[i] = (String) numbers.get(i).get("cardNumber");
            SDACardValidator sdaCardValidator = new SDACardValidator();
            cards[i] = sdaCardValidator.analyze(array[i], rules);
        }
        return cards;
    }
}
