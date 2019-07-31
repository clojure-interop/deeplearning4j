(ns org.datavec.api.transform.sequence.comparator.StringComparator
  "A comparator for comparing
 String values in a single column"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.sequence.comparator StringComparator]))

(defn ->string-comparator
  "Constructor.

  column-name - Name of the column in which to compare values - `java.lang.String`"
  (^StringComparator [^java.lang.String column-name]
    (new StringComparator column-name)))

