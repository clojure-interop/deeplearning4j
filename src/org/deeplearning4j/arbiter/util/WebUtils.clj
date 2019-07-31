(ns org.deeplearning4j.arbiter.util.WebUtils
  "Various utilities for webpages and dealing with browsers"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.util WebUtils]))

(defn ->web-utils
  "Constructor."
  (^WebUtils []
    (new WebUtils )))

(defn *try-open-browser
  "path - `java.lang.String`
  log - `org.slf4j.Logger`"
  ([^java.lang.String path ^org.slf4j.Logger log]
    (WebUtils/tryOpenBrowser path log)))

(defn *open-browser
  "uri - `java.net.URI`

  throws: java.lang.Exception"
  ([^java.net.URI uri]
    (WebUtils/openBrowser uri)))

