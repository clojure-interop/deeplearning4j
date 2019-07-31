(ns org.datavec.spark.functions.pairdata.PathToKeyConverter
  "PathToKeyConverter: Used to match up files based on their file names, for PairSequenceRecordReaderBytesFunction
 For example, suppose we have files \"/features_0.csv\" and \"/labels_0.csv\", map both to same key: \"0\""
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.functions.pairdata PathToKeyConverter]))

(defn get-key
  "Determine the key from the file path

  path - Input path - `java.lang.String`

  returns: Key for the file - `java.lang.String`"
  (^java.lang.String [^PathToKeyConverter this ^java.lang.String path]
    (-> this (.getKey path))))

