(ns org.datavec.spark.functions.pairdata.PathToKeyConverterFilename
  "Convert the path to a key by taking the full file name (excluding the file extension and directories)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.functions.pairdata PathToKeyConverterFilename]))

(defn ->path-to-key-converter-filename
  "Constructor."
  (^PathToKeyConverterFilename []
    (new PathToKeyConverterFilename )))

(defn get-key
  "Description copied from interface: PathToKeyConverter

  path - Input path - `java.lang.String`

  returns: Key for the file - `java.lang.String`"
  (^java.lang.String [^PathToKeyConverterFilename this ^java.lang.String path]
    (-> this (.getKey path))))

