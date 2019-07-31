(ns org.deeplearning4j.arbiter.util.CollectionUtils
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.util CollectionUtils]))

(defn ->collection-utils
  "Constructor."
  (^CollectionUtils []
    (new CollectionUtils )))

(defn *count-unique
  "Count the number of unique values in a collection

  collection - `java.util.Collection`

  returns: `int`"
  (^Integer [^java.util.Collection collection]
    (CollectionUtils/countUnique collection)))

(defn *get-unique
  "Returns a list containing only unique values in a collection

  collection - `java.util.Collection`

  returns: `<T> java.util.List<T>`"
  ([^java.util.Collection collection]
    (CollectionUtils/getUnique collection)))

