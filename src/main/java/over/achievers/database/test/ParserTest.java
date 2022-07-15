package over.achievers.database.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import over.achievers.database.model.Employee;
import over.achievers.database.parsing.DateParser;
import over.achievers.database.parsing.Parser;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class ParserTest {

    Parser employeeParser;

    @BeforeEach
    void setUp() {
        employeeParser = new Parser();
    }

    @Test
    @DisplayName("Valid employee")
    void testValidEmployee(){
        Employee employee = new Employee(1, "Mrs.", "Ronda", 'W', "Jackson", 'F', "rjackson77@hotmail.com", DateParser.parse("10/10/1982"), DateParser.parse("4/1/2009"), 100123);
        Assertions.assertEquals(employee.toString(), employeeParser.parse("1,Mrs.,Ronda,W,Jackson,F,rjackson77@hotmail.com,10/10/1982,4/1/2009,100123").toString());
    }

}