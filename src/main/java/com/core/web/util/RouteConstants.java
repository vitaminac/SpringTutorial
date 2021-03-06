package com.core.web.util;

public class RouteConstants {
    private RouteConstants() {
        throw new AssertionError();
    }

    public static final String MatchesAllPath = "/{path:[^\\.]+}/**";
    public static final String ForwardToRootPath = "forward:/";
    public static final String UserMappingPath = "/users";
    public static final String LOGIN_ENDPOINT = "/login";
    public static final String REGISTER_ENDPOINT = "/register";
    public static final String LogoutMappingPath = "/logout";
    public static final String TEST_PATH = "/test";
    public static final String VIDEO_API = "/videos";
    public static final String FILES_API = "/files";

    public static final String REDIRECT = "redirect:";
}
