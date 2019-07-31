(ns com.atilika.kuromoji.buffer.StringValueMapBuffer
  (:refer-clojure :only [require comment defn ->])
  (:import [com.atilika.kuromoji.buffer StringValueMapBuffer]))

(defn ->string-value-map-buffer
  "Constructor.

  features - `java.util.TreeMap`"
  (^StringValueMapBuffer [^java.util.TreeMap features]
    (new StringValueMapBuffer features)))

(defn put-map
  "input - `java.util.TreeMap`"
  ([^StringValueMapBuffer this ^java.util.TreeMap input]
    (-> this (.putMap input))))

(defn get
  "i - `int`

  returns: `java.lang.String`"
  (^java.lang.String [^StringValueMapBuffer this ^Integer i]
    (-> this (.get i))))

(defn write
  "os - `java.io.OutputStream`

  throws: java.io.IOException"
  ([^StringValueMapBuffer this ^java.io.OutputStream os]
    (-> this (.write os))))

