(ns org.ansj.dic.DicReader
  "加载词典用的类"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.ansj.dic DicReader]))

(defn ->dic-reader
  "Constructor."
  (^DicReader []
    (new DicReader )))

(defn *get-reader
  "name - `java.lang.String`

  returns: `java.io.BufferedReader`"
  (^java.io.BufferedReader [^java.lang.String name]
    (DicReader/getReader name)))

(defn *get-input-stream
  "name - `java.lang.String`

  returns: `java.io.InputStream`"
  (^java.io.InputStream [^java.lang.String name]
    (DicReader/getInputStream name)))

