package com.konkuk.solvedac.api;

public class Constants {

    public static final String SERVER_URL = "https://api.solved.ac";
    public static final String SOLVED_PROBLEMS_URL = "/v2/search/problems.json?query=solved_by:";
    public static final String PROBLEMS_URL = "/v2/search/problems.json?query=tier:";
    public static final String ALL_PROBLEMS_QUERY = "b5ornottier:b5";
    public static final String USERS_GROUP_URL = "/v2/ranking/list.json?type=organization&organization.id=";
    public static final String PER_PAGE_URL = "&page=";
}
