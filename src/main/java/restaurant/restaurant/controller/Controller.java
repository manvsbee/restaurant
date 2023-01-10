package restaurant.restaurant.controller;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller


    public class Controller {

        @RequestMapping(value={"", "/", "home"})
        public String displayPlaceholder() {
            return "placeholder.html";
        }

    }

