/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.obsidiam.controller.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

/**
 *
 * @author obsidiam
 */
public class StandardFormatter extends Formatter{
    @Override
    public String format(LogRecord record) {
        return new SimpleDateFormat("HH:mm:ss").format(new Date(record.getMillis()))+" : "+record.getLevel()+" : "+record.getMessage();
    }
}
