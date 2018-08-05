package com.faderw.school.web;

import com.faderw.school.domain.CountryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * Created by FaderW on 2018/7/22
 */
@RestController
public class WebController {

    @Autowired
//    CountryMapper countryMapper;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public Object test() throws IOException {
//        return countryMapper.getClass().getClassLoader();
        return "";
    }
}
