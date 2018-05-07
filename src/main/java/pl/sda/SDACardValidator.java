package pl.sda;

import java.util.LinkedHashMap;
import java.util.List;

class SDACardValidator {
    Card analyze(String number, List<LinkedHashMap> rules) {

            Card result = new Card();
            result.setNumber(number);
            rules.forEach(s-> { String length =(String) s.get("length");
            String code = (String) s.get("code");
                if (Integer.parseInt(length) == number.length() && number.startsWith(code) ) {
                    result.setIssuer((String)s.get("issuer"));
                    CheckLuhn checkLuhn = new CheckLuhn();
                    result.setVerificationPassed(checkLuhn.checkLuhn(number));
                }

            });


               return result;
    }
}
