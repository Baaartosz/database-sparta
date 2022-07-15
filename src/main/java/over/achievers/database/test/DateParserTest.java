package over.achievers.database.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import over.achievers.database.parsing.DateParser;
import over.achievers.database.parsing.InvalidFormatException;

import java.sql.Date;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class DateParserTest {

    @Test
    @DisplayName("Parse valid date")
    void testParseValidDate(){
        Assertions.assertEquals(Date.valueOf(LocalDate.of(2021,1,1)), DateParser.parse("1/1/2021"));
    }

}