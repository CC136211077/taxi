package com.cc.utils;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoadDataTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getTaxiInfos() {
        String path = "src/main/resources/TaxiInput.txt";
        LoadData.getTaxiInfos(path);
    }
}