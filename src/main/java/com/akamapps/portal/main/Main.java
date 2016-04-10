package com.akamapps.portal.main;

/**
 * PACKAGE_NAME
 *
 * <Class Description>
 *
 * <Reference source if any><a href=""></a>
 * 
 *
 * @author Cyrus G. Gabilla <a href="mailto:cgabilla@gmail.com">cgabilla@gmail.com</a>
 * @version 8:36 PM; 4/3/2016
 * @since 1.8
 */


import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {
        get("/main", (req, res) -> "Welcome to Akam Apps!");
    }
}