(ns org.deeplearning4j.ui.i18n.DefaultI18N
  "Default internationalization implementation.
 Content for internationalization is implemented using resource files.
 For the resource files: they should be specified as follows:
 1. In the /dl4j_i18n/ directory in resources
 2. Filenames should be \"somekey.langcode\" - for example, \"index.en\" or \"index.ja\"
 3. Each key should be unique across all files. Any key can appear in any file; files may be split for convenience

 Loading of these UI resources is done as follows:
 - On initialization of the DefaultI18N:
   - Resource files for the default language are loaded
 - If a different language is requested, the content will be loaded on demand (and stored in memory for future use)
 Note that if a specified language does not have the specified key, the result from the defaultfallback language (English)
 will be used instead."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.i18n DefaultI18N]))

(def *-default-language
  "Static Constant.

  type: java.lang.String"
  DefaultI18N/DEFAULT_LANGUAGE)

(def *-fallback-language
  "Static Constant.

  type: java.lang.String"
  DefaultI18N/FALLBACK_LANGUAGE)

(defn *get-instance
  "returns: `org.deeplearning4j.ui.api.I18N`"
  (^org.deeplearning4j.ui.api.I18N []
    (DefaultI18N/getInstance )))

(defn no-i-18-n-data
  "returns: `boolean`"
  (^Boolean [^DefaultI18N this]
    (-> this (.noI18NData))))

(defn get-message
  "Description copied from interface: I18N

  lang-code - ISO 639-1 language code: \"en\", \"ja\", etc - `java.lang.String`
  key - Key value for the message to retrieve - `java.lang.String`

  returns: Message for the given key/language pair, or null if none is found - `java.lang.String`"
  (^java.lang.String [^DefaultI18N this ^java.lang.String lang-code ^java.lang.String key]
    (-> this (.getMessage lang-code key)))
  (^java.lang.String [^DefaultI18N this ^java.lang.String key]
    (-> this (.getMessage key))))

(defn get-default-language
  "Description copied from interface: I18N

  returns: The current default language - `java.lang.String`"
  (^java.lang.String [^DefaultI18N this]
    (-> this (.getDefaultLanguage))))

(defn set-default-language
  "Description copied from interface: I18N

  lang-code - Language code, as an ISO 639-1 code - `java.lang.String`"
  ([^DefaultI18N this ^java.lang.String lang-code]
    (-> this (.setDefaultLanguage lang-code))))

