(ns org.nd4j.util.FingerPrintKeyer
  "Copied from google refine:
 takes the key and gets rid of all punctuation, transforms to lower case
 and alphabetic sorts the words"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.util FingerPrintKeyer]))

(defn ->finger-print-keyer
  "Constructor."
  (^FingerPrintKeyer []
    (new FingerPrintKeyer )))

(defn key
  "s - `java.lang.String`
  o - `java.lang.Object`

  returns: `java.lang.String`"
  (^java.lang.String [^FingerPrintKeyer this ^java.lang.String s ^java.lang.Object o]
    (-> this (.key s o))))

