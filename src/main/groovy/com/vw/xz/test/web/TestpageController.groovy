package com.vw.xz.test.web

import org.springframework.stereotype.Controller
import org.springframework.ui.ModelMap
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@Controller
class TestpageController {

    @RequestMapping(value="/", method = RequestMethod.GET)
    String showHomepage() {
        "index";
    }

}