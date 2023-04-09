package RestServicePart2.restpart2.Internationalization;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class Ques2 {
    private MessageSource ms;

    public Ques2(MessageSource ms) {
        this.ms = ms;
    }

    @GetMapping("/hello/{name}")
    public String get(@PathVariable String name){
        Locale locale= LocaleContextHolder.getLocale();
        String msg=ms.getMessage("hello.message",null,"Default Msg",locale);

        return msg+" "+name;
    }
}
