(ns org.ansj.dic.impl.File2Stream
  "将文件转换为流 file://c:/dic.txt"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.ansj.dic.impl File2Stream]))

(defn ->file-2-stream
  "Constructor."
  (^File2Stream []
    (new File2Stream )))

(defn to-stream
  "path - `java.lang.String`

  returns: `java.io.InputStream`"
  (^java.io.InputStream [^File2Stream this ^java.lang.String path]
    (-> this (.toStream path))))

