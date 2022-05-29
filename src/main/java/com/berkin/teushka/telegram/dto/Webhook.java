package com.berkin.teushka.telegram.dto;

import lombok.Data;

import java.io.File;

@Data
public class Webhook {

    private String url;
    private File certificate;
    private String ipAddress;
    private int max_connections;
    private String[] allowed_updates;
    private Boolean drop_pending_updates;
}
