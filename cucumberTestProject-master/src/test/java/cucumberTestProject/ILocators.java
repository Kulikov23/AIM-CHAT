package cucumberTestProject;


public interface ILocators {


    String PAGE_BREADCRUMB = "//a[contains(text(),'$1')]";
    String WELCOME_IMAGECAROUSEL_SPECIAL = "//h1[@class='portlet-title']/span[contains(text(),'OUR SPECIAL OFFERS')]";
    String GOOGLE_PLAY_HEADER = "//*[text()='Demo ICT4APPS SERIES BASIC']";
    String GOOGLE_PLAY_INSTALL_BUTTON = "//div[@class='details-actions-right']//button[@class='price buy id-track-click id-track-impression']";

    //TODO: ///////////////////////////////////////////WELCOME PAGE ////////////////////////////////////////////////////

    String WELCOME_HEADER_MENULINK = "(//span[contains(text(),'$1')])[$2]";
    String WELCOME_PAGE_LOGOTYPE = "//*[@class='logo custom-logo']";
    String WELCOME_HEADER_GOOGLEPLAYLINK = "(//img[@alt='Android app on Google Play'])[$1]";
    String WELCOME_HEADER_APPSTORELINK = "//img[@alt='Available on the App Store']";
    String CONTACT_US_HEADER = "//h1[@class='portlet-title']/span[contains(text(),'Contacts')]";
    String WELCOME_PAGE_SOCIAL_BLOCK_FOOTER = ".//*[@id='atstbx']/div";
    String WELCOME_PAGE_FOOTER_SOCIAL_ICON = "(.//*[@id='atstbx']/div//span[@class='at-icon-wrapper'])[$1]";


    //TODO: LANGUAGE DROPDOWN MENU
    String LANGUAGE_DROPDOWN = "//div/select";
    String LANGUAGE_DROPDOWN_OPTION = "//option[contains(text(),'$1')]";

//TODO: SPECIAL OFFERS IMAGE CAROUSEL
    String IMAGE_CAROUSEL_ITEM = "//div[@data-slick-index='$1']//img";
    String IMAGE_CAROUSEL_TITLE = "//div[@data-slick-index='$1']//h3/a";
    String IMAGE_CAROUSEL_DESCRIPTION = "//div[@data-slick-index='$1']//div[@id='latestDesc']";
    String IMAGE_CAROUSEL_MORE = "//div[@data-slick-index='$1']//a[contains(text(),'More')]";

    //////////////////////////////////////////                       //////////////////////////////////////////
    String SIGN_IN = "//a[contains(text(),'Sign In')]";

    String ERROR_MESSAGE_REQUIRED = "(//div[contains(text(),'This field is required.')])[$1]";
    String SIGN_IN_INPUT = ".//*[@id='_58_$1']";
    String SPECIAL_IMAGE_CAROUSEL_NEXT = "(//button[contains(text(),'Next')])[1]";
    String From1 = "//div[@data-slick-index='0']//img";
    String To1 = "//div[@data-slick-index='2']//img";
    String From2 = "//div[@data-slick-index='2']//img";
    String To2 = "//div[@data-slick-index='4']//img";
    String CONTACT_US_TEXTBOX = ".//textarea";
    String LANGUAGES_LIST = "//*[@id='_82_languageId']/option";

    //////////////////////////////////////////CATEGORY IMAGE CAROUSEL //////////////////////////////////////////
    String CATEGORY_IMAGE_CAROUSEL = "//div[@id='column-2']//li[@class!='slick-slide slick-cloned']/div[@class='item_content num_$1']/a";
    String CATAGORY_IMAGE_CAROUSEL_NEXT = "//ul[@class='slick-3 category-list-slide slick-initialized slick-slider']//button[contains(text(),'Next')]";
    String CATEGORY_IMAGE_CAROUSEL_TEXT = "//div[@id='column-2']//li[@class!='slick-slide slick-cloned']/div[@class='item_content num_$1']//h3";

    /////////////////////////////////////////NEWS FEED ON WELCOME PAGE///////////////////////////////////////////
    String NEWS_FEED_ITEM_TITLE = "(//div[@class='asset-abstract']//a)[$1]";

    //TODO://////////////////////////////////////////////MULTI PAGES/////////////////////////////////////////////////////
    String SEARCH_FIELD = "//input[@class='search-query']";


    //TODO://////////////////////////////////////////////////PRODUCTS PAGE//////////////////////////////////////////////////

    //TODO:CATEGORY LIST
    String CATEGORY_LIST_ITEM = "//li//a[text()='$1']";
    String CATEGORY_LIST_SUBCATEGORY_LIST = "//span[text()='$1']/../a[text()='►']";
    String CATEGORY_LIST_SUBCATEGORY_ITEM = "//a[text()='$1']";
    String CATEGORY_LIST_CATEGORY_FOLDER = "(//li[contains(@class,'jqtree_common jqtree-folder')])[1]";
    String CATEGORY_LIST_SUBCATEGORY_ITEM2 = ".//a[text()='►']";


    //TODO: BREADCRUMB
    String BREADCRUMB_FIRST_ITEM = "//*[text()='$1']";
    String BREADCRUMB_CATEGORY = "//ul[@aria-label='Breadcrumb']/li[text()='$1']";
    String BREADCRUMB_LAST = "//li[contains(@class,'last breadcrumb')]";

    //TODO: PRODUCTS PAGE, PRODUCTS LIST
    String PRODUCTS_PAGE_PRODUCTS_LIST = "//li[@class='b-product gallery--item gallery-list--item ']";

    //TODO: PRODUCTS PAGE, SEARCH
    String PRODUCTS_PAGE_SEARCH_BUTTON = "//button[contains(text(),'Search')]";

    //TODO: PRODUCT PAGE, ELEMENTS OF ITEM
    String PRODUCTS_PAGE_TITLE_OF_ITEM = "(//h3[@class='galery-product__title']/a)[$1]"; //Need a replace
    String PRODUCTS_PAGE_IMAGE_OF_ITEM = "(//li[@class='b-product gallery--item gallery-list--item ']//img)[$1]"; //Need a replace
    String PRODUCTS_PAGE_READMORE_OF_ITEM = "(//li[@class='b-product gallery--item gallery-list--item ']//a[contains(text(),'Read More')])[$1]"; //Need a replace
    String PRODUCTS_PAGE_SOCIAL_NETWORK_ICON = "(//a[@title='$2'])[$1]";


    //TODO: PRODUCTS DESCRIPTION PAGE, ELEMENTS
    String PRODUCTS_DESCRIPTION_PAGE_TITLE = "//div[@class='clearfix product']/h1/span";
    String PRODUCTS_DESCRIPTION_PAGE_IMAGE  = "//img[@class='example-image']";
    String PRODUCTS_DESCRIPTION_PAGE_DESCRIPTION = "//div[@class='info-product table-word-wrap']";

    //TODO: PRODUCTS PAGE, CATEGORY LIST
    String PRODUCTS_PAGE_CATEGORY_LIST_ITEM = "//a[contains(text(),'$1')]";  //Need a replace

    //TODO: PRODUCTS DESCRIPTION PAGE, IMAGE GALLERY
    String IMAGE_GALLERY_CLOSE_BUTTON = "//button[@class='image-viewer-close close']";
    String IMAGE_GALLERY_RIGHT_ARROW = "//a[contains(text(),'›')]";
    String IMAGE_GALLERY_LEFT_ARROW = "//a[contains(text(),'‹')]";

    //TODO: PRODUCTS PAGE, PAGES DROPDOWN MENU
    String PRODUCTS_PAGE_PAGES_DROPDOWNMENU = "(//span [@class=\"lfr-icon-menu-text\"])[1]";
    String PRODUCTS_PAGE_PAGES_DROPDOWNMENU_ITEM = "//a[@id='_PRODUCT_PORTLET_WAR_ict4appsportlet_kldx_column4_0_menu_$1']/span"; //Need a replace

    //TODO: PRODUCTS PAGE, LABEL THAT SHOWING RESULTS
    String PRODUCTS_PAGE_SHOWING_RESULTS_PAGE = "(//small)[1]";

    //TODO: PRODUCTS PAGE, ITEMS PER PAGE DROPDOWN MENU
    String PRODUCTS_PAGE_ITEMS_PER_PAGE_DROPDOWN = "(//span [@class=\"lfr-icon-menu-text\"])[2]";
    String PRODUCTS_PAGE_ITEMS_PER_PAGE_DROPDOWN_ITEM = "//a[@id='_PRODUCT_PORTLET_WAR_ict4appsportlet_tiym_column4_0_menu_$1']/span";  //Need a replace

    //TODO: PRODUCTS PAGE, PAGINATION BUTTON
    String PRODUCTS_PAGE_PAGINATION_BUTTON = "(//a[contains(text(),'$1')])[1]";

    //TODO: PRODUCTS PAGE, GRID AND LIST VIEW
    String PRODUCTS_PAGE_VIEW_ICON = "//i[@class='icon-$1']";

    //TODO://///////////////////////////////////////////////SEARCH PAGE///////////////////////////////////////////////

    //TODO: SEARCH PAGE ELEMENTS
    String SEARCH_PAGE_SEARCH_FIELD = "//*[@id='_3_keywords']";
    String SEARCH_PAGE_SCOPE_DROPDOWN = "//select[@title='selected_scope']";
    String SEARCH_PAGE_OPTION = "//option[contains(text(),'$1')]";
    String SEARCH_PAGE_SEARCH_BUTTON = "//button[contains(text(),'Search')]";
    String SEARCH_PAGE_CLEAR_BUTTON = ".//*[text()=' Clear ']";
    String SEARCH_PAGE_BLOG_ENTRY = "//tbody[@class='table-data']//span[contains(text(),'$1')]";
    String SEARCH_PAGE_RESULTS_OF_SEARCH = "//tbody[@class='table-data']";
    String SEARCH_PAGE_CHOSEN_BLOG_ENTRY = "(//tbody[@class='table-data']//span[contains(text(),'$2')])[$1]";

    //TODO://///////////////////////////////////////////SPECIAL OFFERS PAGE///////////////////////////////////////////////////////////////////
    String SPECIAL_OFFERS_PAGE_PAGES_DROPDOWNMENU_ITEM = "//a[@id='_PRODUCT_PORTLET_WAR_ict4appsportlet_kldx_column1_1_menu_$1']/span";
    String SPECIAL_OFFERS_PAGE_ITEMS_PER_PAGE_DROPDOWN_ITEM = "//a[@id='_PRODUCT_PORTLET_WAR_ict4appsportlet_tiym_column1_1_menu_$1']/span";

    //TODO:////////////////////////////////////////////BLOGS PAGE///////////////////////////////////////////////////////


    //TODO: BLOG_ENTRY_ELEMENTS
    String BLOG_ENTRY_TITLE = "(//div[@class='inline title-wrap']//a)[$1]";
    String BLOG_ENTRY_MORE = "(//div[@class='span8']//a)[$1]";
    String BLOG_ENTRY_IMAGE = "(//div[@class='span4']//img)[$1]";
    String BLOG_ENTRY_COMMENTS = "(//span[contains(text(),' 0 Comments ')])[$1]";

    //TODO: BLOGS DESCRIPTION PAGE
    String BLOG_DESCRIPTION_PAGE_IMAGE = "//div[@class='entry-body']/div/img[1]";
    String BLOG_DESCRIPTION_PAGE_READMORE = "//a[contains(text(),'Read More')]";
    String BLOG_DESCRIPTION_PAGE_ORIGINAL_POST  = "//a[contains(text(),'View Original Post')]";
    String BLOG_DESCRIPTION_PAGE_TWEET_LINK = "//span[contains(text(),'Tweet')]";
    String BLOG_DESCRIPTION_PAGE_FACEBOOK_LINK = "(//span[contains(text(),'Like')])[1]";
    String BLOG_DESCRIPTION_PAGE_BREADCRUMB = "//li[@class='active last breadcrumb-truncate']";
    // G+1 button
    String BLOG_DESCRIPTION_PAGE_TWEET_FRAME = "//iframe[@id='twitter-widget-0']";
    String BLOG_DESCRIPTION_PAGE_FACEBOOK_FRAME = "//iframe[@title='fb:like Facebook Social Plugin']";
    String BLOG_DESCRIPTION_PAGE_PREVIOUS_BUTTON = "//a[contains(text(),'Previous')]";
    String BLOG_DESCRIPTION_PAGE_NEXT_BUTTON = "//a[contains(text(),'Next')]";
    String BLOG_DESCRIPTION_PAGE_SOCIAL_ICON = "//li[contains(@class,'$1')]";


    String HEADER_ON_SOURCE_PAGE = "//*[contains(text(),'$1')]"; //TODO: fsfafasfasfasfasfasfasfasfasfas
    String BLOG_DESCRIPTION_PAGE_TEXT = "//div[@class='entry-body']/div/node()[not(self::img|self::a|self::div)]";

    String qwre = "//a[@class='at-icon-wrapper at-share-btn at-svc-facebook']//span[@class=\"at-icon-wrapper\"]";


    //TODO://////////////////////////////////////////CONTACT US PAGE////////////////////////////////////////////////////
    String CONTACTUS_PAGE_SEND_BUTTON ="//button[contains(text(),'Send')]";
    String CONTACTUS_PAGE_ERROR_MESSAGE = "//label[contains(text(),'$1')]/ancestor::div[@class='fildWrapper']//span[contains(text(),'This field is mandatory.')]";
    String CONTACTUS_PAGE_ERROR_MESSAGE_COMMENTS = "//label[contains(text(),'$1')]/ancestor::div[@class='fildTextWrapper']//span[contains(text(),'This field is mandatory.')]";
    String CONTACTUS_PAGE_INPUTFIELD = "//label[contains(text(),'$1')]/ancestor::div[@class='control-group']/input";
    String CONTACTUS_PAGE_TEXTAREA = "//textarea";

    //TODO://////////////////////////////////////////SIGN IN PAGE////////////////////////////////////////////////////////
    String SIGN_IN_SOCIAL_ICONS = "(//span[contains(text(),'$1')])[1]";
    String SIGN_IN_BUTTON = "//button[contains(text(), ' Sign In ')]";
    String SIGN_IN_INPUT_FIELD = ".//*[@id='_58_$1']";
    String SIGN_IN_ERROR_MESSAGE = "//label[text()='$1']/../div/div";
    String SIGN_IN_ERROR_MESSAGE_REQUEST = "//div[text()=' Your request failed to complete. ']";
    String SIGN_IN_ERROR_MESSAGE_TRY_AGAIN = "//*[text()=' Authentication failed. Please try again. ']";
    String SIGN_IN_CREATE_ACCOUNT_LINK = "//*[text()='Create Account']";
    String SIGN_IN_HEADER = "//span[@class='portlet-title-text']";

    //TODO://////////////////////////////////////////CREATE ACCOUNT PAGE////////////////////////////////////////////////
    String CREATE_ACCOUNT_HEADER = "//*[text()='Create Account']";
    String CREATE_ACCOUNT_SAVE_BUTTON = "//*[text()=' Save ']";
    String CREATE_ACCOUNT_INPUT_FIELD = "//label[contains(text(),'First Name ')]/../input";
    String CREATE_ACCOUNT_ERROR_MESSAGE = "//label[contains(text(),'$1')]/..//div[@class='required']";
    String CREATE_ACCOUNT_ERROR_MESSAGE_EMAIL = "//label[contains(text(),' Email Address ')]/..//div[@class='email']";

    //TODO:DATE-PICKER
    String CREATE_ACCOUNT_DATE_PICKER = ".//*[@id='_58_birthday']";
    String CREATE_ACCOUNT_DATE_PICKER_RIGHT_ARROW = "//*[@aria-label='Go to $1 month']";
    String CREATE_ACCOUNT_DATE_PICKER_CURRENT_DATE = ".//*[@class='yui3-u yui3-calendar-header-label']";
    String CREATE_ACCOUNT_DATE_PICKER_CALENDAR_DATE = "//*[@ aria-selected='true' AND text()='$1']";
    String CREATE_ACCOUNT_DATE_PICKER_VALUE = "//*[@value='01/01/1970']";
}
