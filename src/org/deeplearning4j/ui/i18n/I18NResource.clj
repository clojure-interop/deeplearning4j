(ns org.deeplearning4j.ui.i18n.I18NResource
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.i18n I18NResource]))

(defn ->i-18-n-resource
  "Constructor."
  (^I18NResource []
    (new I18NResource )))

(defn get-input-stream
  "returns: `java.io.InputStream`

  throws: java.io.IOException"
  (^java.io.InputStream [^I18NResource this]
    (-> this (.getInputStream))))

