package dry.validator;

import static dry.validator.Validator.validateType;
import static dry.validator.Validator.validateMinInteger;

public class Service {

    public void validateAge(String value) throws Exception {
        validateType(value, Integer.TYPE);
        validateMinInteger(value, 18);
    }

    //...

    public void validQuantity(String value) throws Exception {
        validateType(value, Integer.TYPE);
        validateMinInteger(value, 18);
    }
}
