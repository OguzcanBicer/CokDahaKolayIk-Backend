package com.fmss.cokdahakolayik.integration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;

public class BaseIntegrationTest {

    public static final String EMPLOYEE_API_ENDPOINT = "/api/v1/employees";
    public static final String ENUM_API_ENDPOINT = "/api/v1/enums";
    public static final String EXPENSE_API_ENDPOINT = "/api/v1/expenses";
    public static final String LEAVE_API_ENDPOINT = "/api/v1/leaves";
    public static final String OVERTIME_API_ENDPOINT = "/api/v1/overtimes";

    public final Long LEAVE_ID = 3L;
    public final Long EXPENSE_ID = 3L;
    public final Long OVERTIME_ID = 3L;
    public final Long EMPLOYEE_ID = 1L;
    public final Long INSTANCE_WITH_THIS_ID_WILL_BE_DELETED_IN_TEST = 1L;
    public final int NUMBER_OF_INSTANCE = 11;


    public static final LocalDate getDate = LocalDate.now();
    public final ObjectMapper mapper = new ObjectMapper();

    @BeforeEach
    public void setup() {
        mapper.registerModule(new JavaTimeModule());
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
    }
}
