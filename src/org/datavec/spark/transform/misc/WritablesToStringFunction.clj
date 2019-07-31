(ns org.datavec.spark.transform.misc.WritablesToStringFunction
  "Simple function to map an example to a String format (such as CSV)
 with given quote around the string value if it contains the delimiter."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.transform.misc WritablesToStringFunction]))

(defn ->writables-to-string-function
  "Constructor.

  delim - `java.lang.String`"
  (^WritablesToStringFunction [^java.lang.String delim]
    (new WritablesToStringFunction delim)))

(defn *append
  "c - `java.util.List`
  sb - `java.lang.StringBuilder`
  delim - `java.lang.String`
  quote - `java.lang.String`"
  ([^java.util.List c ^java.lang.StringBuilder sb ^java.lang.String delim ^java.lang.String quote]
    (WritablesToStringFunction/append c sb delim quote)))

(defn call
  "c - `java.util.List`

  returns: `java.lang.String`

  throws: java.lang.Exception"
  (^java.lang.String [^WritablesToStringFunction this ^java.util.List c]
    (-> this (.call c))))

