/*
 *    SLDEditor - SLD Editor application
 *
 *    (C) 2016, SCISYS
 *
 */

/**
 * Author: Domenico Monaco, Yong Mook Kim
 *
 * <p>Source: https://gist.github.com/kiuz/816e24aa787c2d102dd0
 *
 * <p>License: GNU v2 2014
 *
 * <p>Fork / Learned: http://www.mkyong.com/java/how-to-detect-os-in-java-systemgetpropertyosname/
 */
package com.sldeditor.common.utils;

/**
 * The Class OSValidator.
 *
 * @author Robert Ward (SCISYS)
 */
public class OSValidator {

    /** The os. */
    private static String OS = System.getProperty("os.name").toLowerCase();

    /**
     * Checks if is windows.
     *
     * @return true, if is windows
     */
    public static boolean isWindows() {
        return (OS.indexOf("win") >= 0);
    }

    /**
     * Checks if is mac.
     *
     * @return true, if is mac
     */
    public static boolean isMac() {
        return (OS.indexOf("mac") >= 0);
    }

    /**
     * Checks if is unix.
     *
     * @return true, if is unix
     */
    public static boolean isUnix() {
        return (OS.indexOf("nix") >= 0 || OS.indexOf("nux") >= 0 || (OS.indexOf("aix") > 0));
    }

    /**
     * Checks if is solaris.
     *
     * @return true, if is solaris
     */
    public static boolean isSolaris() {
        return (OS.indexOf("sunos") >= 0);
    }

    /**
     * Gets the os.
     *
     * @return the os
     */
    public static String getOS() {
        if (isWindows()) {
            return "win";
        } else if (isMac()) {
            return "osx";
        } else if (isUnix()) {
            return "unix";
        } else if (isSolaris()) {
            return "sol";
        } else {
            return "err";
        }
    }
}
