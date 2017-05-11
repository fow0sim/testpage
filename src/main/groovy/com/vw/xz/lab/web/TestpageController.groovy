package com.vw.xz.lab.web

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class TestpageController {

    @RequestMapping(value=[ '/', '/home' ])
    String showHomepage(Model model) {
        model.addAttribute('props', fetchProperties())
        model.addAttribute('envars', fetchEnvars())
        "index"
    }

    @RequestMapping(value='/properties')
    String showProperties(Model model) {
        model.addAttribute('props', fetchProperties())
        "properties"
    }

    @RequestMapping(value='/environment')
    String showEnvironment(Model model) {
        model.addAttribute('envars', fetchEnvars())
        "environment"
    }

    static Properties fetchProperties() {
        System.properties
    }

    static Map<String, String> fetchEnvars() {
        System.getenv()
    }

}