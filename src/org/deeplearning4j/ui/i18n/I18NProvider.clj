(ns org.deeplearning4j.ui.i18n.I18NProvider
  "Returns the currently used I18N (Internationalization) class"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.i18n I18NProvider]))

(defn ->i-18-n-provider
  "Constructor."
  (^I18NProvider []
    (new I18NProvider )))

(defn *get-instance
  "Get the current/global I18N instance

  returns: `org.deeplearning4j.ui.api.I18N`"
  (^org.deeplearning4j.ui.api.I18N []
    (I18NProvider/getInstance )))

