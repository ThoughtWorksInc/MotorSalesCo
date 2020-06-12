package com.tw.motorsalesco;

import java.util.Collections;
import java.util.Map;

public class FilterOptions {

    public Map<String, Integer> getBrandFilterOptions(){

        return Collections.singletonMap("Suzuki", 3);
    }

    public String getCurrentFilter(){
        return "";
    }

}
