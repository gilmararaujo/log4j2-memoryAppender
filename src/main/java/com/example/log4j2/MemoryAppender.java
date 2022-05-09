package com.example.log4j2;

import org.apache.logging.log4j.core.Appender;
import org.apache.logging.log4j.core.Core;
import org.apache.logging.log4j.core.Filter;
import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.core.appender.AbstractAppender;
import org.apache.logging.log4j.core.config.plugins.Plugin;
import org.apache.logging.log4j.core.config.plugins.PluginAttribute;
import org.apache.logging.log4j.core.config.plugins.PluginElement;
import org.apache.logging.log4j.core.config.plugins.PluginFactory;
@Plugin(name="MemoryAppender", category=Core.CATEGORY_NAME, elementType=Appender.ELEMENT_TYPE)
public class MemoryAppender extends AbstractAppender {
    protected MemoryAppender(String name, Filter filter) {
        super(name, filter, null, false, null);
    }
    @PluginFactory
    public static MemoryAppender createAppender(@PluginAttribute("name") String name, @PluginElement("Filter") Filter filter) {
        return new MemoryAppender(name, filter);
    }
    public void append(LogEvent event) {
        // TODO Auto-generated method stub
        System.out.println("logback loading test appender");
    }
}
