(ns org.datavec.spark.functions.pairdata.PathToKeyConverterNumber
  "A PathToKeyConverter that generates a key based on the file name. Specifically, it extracts a digit from
 the file name. so \"/my/directory/myFile0.csv\" -> \"0\""
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.functions.pairdata PathToKeyConverterNumber]))

(defn ->path-to-key-converter-number
  "Constructor."
  (^PathToKeyConverterNumber []
    (new PathToKeyConverterNumber )))

(defn get-key
  "Description copied from interface: PathToKeyConverter

  path - Input path - `java.lang.String`

  returns: Key for the file - `java.lang.String`"
  (^java.lang.String [^PathToKeyConverterNumber this ^java.lang.String path]
    (-> this (.getKey path))))

