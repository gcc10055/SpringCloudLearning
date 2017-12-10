package com.gzntest.service.serviceimpl;

import com.gzntest.service.SchedualServiceHi;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by GZN on 2017/12/9.
 */

public class SchedualServiceHiImpl implements SchedualServiceHi{
    @Override
    public String sayHiFromClientOne(@RequestParam(value = "name") String name) {
        return name;
    }
}
