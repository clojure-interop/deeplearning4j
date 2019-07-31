(ns org.ansj.dic.impl.Jdbc2Stream
  "jdbc:mysql://192.168.10.103:3306/infcn_mss?useUnicode=true&characterEncoding=utf-8&zeroDateTimeBehavior=convertToNull|username|password|select name as name,nature,freq from dic where type=1"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.ansj.dic.impl Jdbc2Stream]))

(defn ->jdbc-2-stream
  "Constructor."
  (^Jdbc2Stream []
    (new Jdbc2Stream )))

(defn *encryption
  "path - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String path]
    (Jdbc2Stream/encryption path)))

(defn to-stream
  "path - `java.lang.String`

  returns: `java.io.InputStream`"
  (^java.io.InputStream [^Jdbc2Stream this ^java.lang.String path]
    (-> this (.toStream path))))

