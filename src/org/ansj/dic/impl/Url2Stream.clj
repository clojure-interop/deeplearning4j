(ns org.ansj.dic.impl.Url2Stream
  "url://http://maven.nlpcn.org/down/library/default.dic"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.ansj.dic.impl Url2Stream]))

(defn ->url-2-stream
  "Constructor."
  (^Url2Stream []
    (new Url2Stream )))

(defn to-stream
  "path - `java.lang.String`

  returns: `java.io.InputStream`"
  (^java.io.InputStream [^Url2Stream this ^java.lang.String path]
    (-> this (.toStream path))))

