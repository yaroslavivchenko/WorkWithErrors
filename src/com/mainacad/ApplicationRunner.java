package com.mainacad;

import com.mainacad.exception.MyCustomException;
import com.mainacad.service.NumberService;

import java.util.logging.Logger;

public class ApplicationRunner {

    private static final Logger LOGGER = Logger.getLogger(ApplicationRunner.class.getName());

    public static void main(String[] args) throws MyCustomException {

        LOGGER.info("Result is " + NumberService.getDivResult(12,3));
    }
}
