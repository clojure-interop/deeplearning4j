(ns org.deeplearning4j.ui.UiUtils
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui UiUtils]))

(defn *try-open-browser
  "path - `java.lang.String`
  log - `org.slf4j.Logger`"
  ([^java.lang.String path ^org.slf4j.Logger log]
    (UiUtils/tryOpenBrowser path log)))

(defn *open-browser
  "uri - `java.net.URI`

  throws: java.lang.Exception"
  ([^java.net.URI uri]
    (UiUtils/openBrowser uri)))

