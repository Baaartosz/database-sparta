package over.achievers.database.validation;

import over.achievers.database.model.Employee;

public class GenderValidator implements Validator{
    @Override
    public boolean isValid(Employee employee) {
        return true;
    }
}
