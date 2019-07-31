(ns org.deeplearning4j.ui.api.I18N
  "Interface to handle user interface internationalization.
 Internationalization support is bulit into Play framework, but this doesn't seem to function with a Java  Maven
 embedded server like we are using here.

 Basic idea: UI messages are available by specifying 2 values:
 (a) The ISO 639-1 language code, as a String (\"en\", \"fr\", \"ja\" etc)
 (b) A key for the message. For example, \"index.home.title\" or \"histogram.nav.home\"

 See https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.api I18N]))

(defn get-message
  "Get the specified message for the specified language

  lang-code - ISO 639-1 language code: \"en\", \"ja\", etc - `java.lang.String`
  key - Key value for the message to retrieve - `java.lang.String`

  returns: Message for the given key/language pair, or null if none is found - `java.lang.String`"
  (^java.lang.String [^I18N this ^java.lang.String lang-code ^java.lang.String key]
    (-> this (.getMessage lang-code key)))
  (^java.lang.String [^I18N this ^java.lang.String key]
    (-> this (.getMessage key))))

(defn get-default-language
  "Get the currently set default language as an ISO 639-1 code

  returns: The current default language - `java.lang.String`"
  (^java.lang.String [^I18N this]
    (-> this (.getDefaultLanguage))))

(defn set-default-language
  "Set the default language

  lang-code - Language code, as an ISO 639-1 code - `java.lang.String`"
  ([^I18N this ^java.lang.String lang-code]
    (-> this (.setDefaultLanguage lang-code))))

