package com.vw.xz.test.web

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class TestpageController {

    @RequestMapping(value=[ '/', '/home' ])
    String showHomepage() {
        "index";
    }

}