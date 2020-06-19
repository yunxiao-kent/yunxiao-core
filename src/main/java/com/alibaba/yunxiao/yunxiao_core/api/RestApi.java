package com.alibaba.yunxiao.yunxiao_core.api;

import com.alibaba.yunxiao.api.PluginA;
import com.alibaba.yunxiao.api.PluginB;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApi {

    @RequestMapping(value = "/upper")
    public String getUpperString(@RequestParam(name = "origin") String origin) {
        PluginA pluginA = new PluginA();

        return pluginA.upperCase(origin);
    }


    @RequestMapping(value = "/concat")
    public String getConcatString(@RequestParam(name = "first") String first, @RequestParam(name = "second") String second) {
        PluginA pluginA = new PluginA();
        return pluginA.concat(first, second);
    }

    @RequestMapping(value = "/lower")
    public String getLowerString(@RequestParam(name = "origin") String origin) {
        PluginB pluginB = new PluginB();

        return pluginB.lowerCase(origin);
    }
}
