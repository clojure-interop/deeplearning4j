(ns org.ansj.dic.impl.Jar2Stream
  "从系统jar包中读取文件，你们不能用，只有我能用 jar://org.ansj.dic.DicReader|/crf.model"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.ansj.dic.impl Jar2Stream]))

(defn ->jar-2-stream
  "Constructor."
  (^Jar2Stream []
    (new Jar2Stream )))

(defn to-stream
  "path - `java.lang.String`

  returns: `java.io.InputStream`"
  (^java.io.InputStream [^Jar2Stream this ^java.lang.String path]
    (-> this (.toStream path))))

