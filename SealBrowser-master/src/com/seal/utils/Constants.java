/*
 * Tint Browser for Android
 *
 * Copyright (C) 2014 mogoweb.
 * Copyright (C) 2012 - to infinity and beyond J. Devauchelle and contributors.
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * version 3 as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 */

package com.seal.utils;

public class Constants {

	/**
	 * Actions.
	 */
	public static final String ACTION_BROWSER_CONTEXT_MENU = "ACTION_BROWSER_OPEN";

	/**
	 * Extras.
	 */
	public static final String EXTRA_ID = "EXTRA_ID";
	public static final String EXTRA_ACTION_ID = "EXTRA_ACTION_ID";
	public static final String EXTRA_NEW_TAB = "EXTRA_NEW_TAB";
	public static final String EXTRA_LABEL = "EXTRA_LABEL";
	public static final String EXTRA_URL = "EXTRA_URL";
	public static final String EXTRA_FOLDER_ID = "EXTRA_FOLDER_ID";
	public static final String EXTRA_HIT_TEST_RESULT = "EXTRA_HIT_TEST_RESULT";
	public static final String EXTRA_INCOGNITO = "EXTRA_INCOGNITO";

	/**
	 * Specials urls.
	 */
	public static final String URL_ABOUT_BLANK = "about:blank";
	public static final String URL_ABOUT_START = "about:start";

	/**
	 * User agents
	 */
	public static final String USER_AGENT_ANDROID = "";
	public static final String USER_AGENT_DESKTOP = "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/534.24 (KHTML, like Gecko) Chrome/11.0.696.34 Safari/534.24";

	/**
	 * Preferences.
	 */
	public static final String PREFERENCE_HOME_PAGE = "PREFERENCE_HOME_PAGE";
	public static final String PREFERENCE_SEARCH_URL = "PREFERENCE_SEARCH_URL";
	public static final String PREFERENCE_START_PAGE_LIMIT = "PREFERENCE_START_PAGE_LIMIT";
	public static final String PREFERENCE_BUBBLE_POSITION = "PREFERENCE_BUBBLE_POSITION";
	public static final String PREFERENCE_TOOLBARS_AUTOHIDE_DURATION = "PREFERENCE_TOOLBARS_AUTOHIDE_DURATION";
	public static final String PREFERENCES_SWITCH_TABS_METHOD = "PREFERENCES_SWITCH_TABS_METHOD";

	public static final String PREFERENCE_ENABLE_JAVASCRIPT = "PREFERENCE_ENABLE_JAVASCRIPT";
	public static final String PREFERENCE_ENABLE_IMAGES = "PREFERENCE_ENABLE_IMAGES";
	public static final String PREFERENCE_USE_WIDE_VIEWPORT = "PREFERENCE_USE_WIDE_VIEWPORT";
	public static final String PREFERENCE_LOAD_WITH_OVERVIEW = "PREFERENCE_LOAD_WITH_OVERVIEW";
	public static final String PREFERENCE_USER_AGENT = "PREFERENCE_USER_AGENT";
	public static final String PREFERENCE_PLUGINS = "PREFERENCE_PLUGINS";

	public static final String PREFERENCE_ACCEPT_COOKIES = "PREFERENCE_ACCEPT_COOKIES";
	public static final String PREFERENCE_ENABLE_GEOLOCATION = "PREFERENCE_ENABLE_GEOLOCATION";
	public static final String PREFERENCE_REMEMBER_FORM_DATA = "PREFERENCE_REMEMBER_FORM_DATA";
	public static final String PREFERENCE_REMEMBER_PASSWORDS = "PREFERENCE_REMEMBER_PASSWORDS";

	public static final String PREFERENCE_HISTORY_SIZE = "PREFERENCE_HISTORY_SIZE";
	public static final String PREFERENCE_CLEAR_CACHE = "PREFERENCE_CLEAR_CACHE";
	public static final String PREFERENCE_WEBSITES_SETTINGS = "PREFERENCE_WEBSITES_SETTINGS";
	public static final String PREFERENCE_SSL_EXCEPTIONS = "PREFERENCE_SSL_EXCEPTIONS";
	public static final String PREFERENCE_CLEAR_HISTORY = "PREFERENCE_CLEAR_HISTORY";
	public static final String PREFERENCE_CLEAR_COOKIES = "PREFERENCE_CLEAR_COOKIES";
	public static final String PREFERENCE_CLEAR_GEOLOCATION = "PREFERENCE_CLEAR_GEOLOCATION";
	public static final String PREFERENCE_CLEAR_FORM_DATA = "PREFERENCE_CLEAR_FORM_DATA";
	public static final String PREFERENCE_CLEAR_PASSWORDS = "PREFERENCE_CLEAR_PASSWORDS";
	public static final String PREFERENCE_INCOGNITO_BY_DEFAULT = "PREFERENCE_INCOGNITO_BY_DEFAULT";

	public static final String PREFERENCE_TEXT_SCALING = "PREFERENCE_TEXT_SCALING";
	public static final String PREFERENCE_MINIMUM_FONT_SIZE = "PREFERENCE_MINIMUM_FONT_SIZE";

	public static final String PREFERENCE_BOOKMARKS_SORT_MODE = "PREFERENCE_BOOKMARKS_SORT_MODE";

	public static final String PREFERENCE_FULL_SCREEN = "PREFERENCE_FULL_SCREEN";

	public static final String PREFERENCE_RESTORE_TABS = "PREFERENCE_RESTORE_TABS";

	public static final String PREFERENCE_UI_TYPE = "PREFERENCE_UI_TYPE";
	public static final String PREFERENCE_CLOSE_PANEL_ON_NEW_TAB = "PREFERENCE_CLOSE_PANEL_ON_NEW_TAB";

	public static final String PREFERENCE_JS_LOG_ON_LOGCAT = "PREFERENCE_JS_LOG_ON_LOGCAT";

	/**
	 * Technical preferences.
	 */
	public static final String TECHNICAL_PREFERENCE_LAST_HISTORY_TRUNCATION = "TECHNICAL_PREFERENCE_LAST_HISTORY_TRUNCATION";
	public static final String TECHNICAL_PREFERENCE_FIRST_RUN = "TECHNICAL_PREFERENCE_FIRST_RUN";
	public static final String TECHNICAL_PREFERENCE_LAST_RUN_VERSION_CODE = "TECHNICAL_PREFERENCE_LAST_RUN_VERSION_CODE";
	public static final String TECHNICAL_PREFERENCE_ADDON_ENABLED = "TECHNICAL_PREFERENCE_ADDON_ENABLED_";
	public static final String TECHNICAL_PREFERENCE_SAVED_TABS = "TECHNICAL_PREFERENCE_SAVED_TABS";
	public static final String TECHNICAL_PREFERENCE_HOMEPAGE_URL_UPDATE_NEEDED = "TECHNICAL_PREFERENCE_HOMEPAGE_URL_UPDATE_NEEDED";
	public static final String TOGGLE_MENU_STATUS = "TOGGLE_MENU_STATUS";
	// Baidu Map
	public static final String BAIDU_MAP_KAY = "1xUfcxWPCOkGjH1ODA05jBXd";
	public static final String BAIDU_MAP_MCODE = "21:C8:8D:03:7C:29:7D:EB:51:32:90:50:28:49:13:0A:D6:CA:35:C9;com.seal";
	public static final String BAIDU_BASE_URL = "http://api.map.baidu.com/telematics/v3/weather?location=";
	// Hot News
	public static final String HOT_NEWS_URL = "http://api.yi18.net/top/list?id=";
}
