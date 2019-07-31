(ns org.datavec.api.transform.transform.doubletransform.Log2Normalizer
  "Normalize by taking scale * log2((in-columnMin)/(mean-columnMin)  1)
 Maps values in range (columnMin to infinity) to (0 to infinity)
 Most suitable for values with a geometric/negative exponential type distribution."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.transform.doubletransform Log2Normalizer]))

(defn ->log-2-normalizer
  "Constructor.

  column-name - `java.lang.String`
  column-mean - `double`
  column-min - `double`
  scaling-factor - `double`"
  (^Log2Normalizer [^java.lang.String column-name ^Double column-mean ^Double column-min ^Double scaling-factor]
    (new Log2Normalizer column-name column-mean column-min scaling-factor)))

(defn map
  "Transform an object
  in to another object

  input - the record to transform - `java.lang.Object`

  returns: the transformed writable - `java.lang.Object`"
  (^java.lang.Object [^Log2Normalizer this ^java.lang.Object input]
    (-> this (.map input))))

(defn get-new-column-meta-data
  "new-column-name - `java.lang.String`
  old-column-meta - `org.datavec.api.transform.metadata.ColumnMetaData`

  returns: `org.datavec.api.transform.metadata.ColumnMetaData`"
  (^org.datavec.api.transform.metadata.ColumnMetaData [^Log2Normalizer this ^java.lang.String new-column-name ^org.datavec.api.transform.metadata.ColumnMetaData old-column-meta]
    (-> this (.getNewColumnMetaData new-column-name old-column-meta))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Log2Normalizer this]
    (-> this (.toString))))

