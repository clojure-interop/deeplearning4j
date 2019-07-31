(ns com.atilika.kuromoji.buffer.WordIdMap
  (:refer-clojure :only [require comment defn ->])
  (:import [com.atilika.kuromoji.buffer WordIdMap]))

(defn ->word-id-map
  "Constructor.

  input - `java.io.InputStream`

  throws: java.io.IOException"
  (^WordIdMap [^java.io.InputStream input]
    (new WordIdMap input)))

(defn look-up
  "source-id - `int`

  returns: `int[]`"
  ([^WordIdMap this ^Integer source-id]
    (-> this (.lookUp source-id))))

