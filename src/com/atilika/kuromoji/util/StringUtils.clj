(ns com.atilika.kuromoji.util.StringUtils
  (:refer-clojure :only [require comment defn ->])
  (:import [com.atilika.kuromoji.util StringUtils]))

(defn ->string-utils
  "Constructor."
  (^StringUtils []
    (new StringUtils )))

(defn *join
  "values - `java.lang.String[]`
  separator - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [values ^java.lang.String separator]
    (StringUtils/join values separator)))

