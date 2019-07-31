(ns org.datavec.api.transform.transform.doubletransform.MinMaxNormalizer
  "Normalizer to map (min to max) -> (newMin-to newMax) linearly.

 Mathematically: (newMax-newMin)/(max-min) * (x-min)  newMin"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.transform.doubletransform MinMaxNormalizer]))

(defn ->min-max-normalizer
  "Constructor.

  column-name - `java.lang.String`
  min - `double`
  max - `double`
  new-min - `double`
  new-max - `double`"
  (^MinMaxNormalizer [^java.lang.String column-name ^Double min ^Double max ^Double new-min ^Double new-max]
    (new MinMaxNormalizer column-name min max new-min new-max))
  (^MinMaxNormalizer [^java.lang.String column-name ^Double min ^Double max]
    (new MinMaxNormalizer column-name min max)))

(defn map
  "Transform an object
  in to another object

  input - the record to transform - `java.lang.Object`

  returns: the transformed writable - `java.lang.Object`"
  (^java.lang.Object [^MinMaxNormalizer this ^java.lang.Object input]
    (-> this (.map input))))

(defn get-new-column-meta-data
  "new-column-name - `java.lang.String`
  old-column-meta - `org.datavec.api.transform.metadata.ColumnMetaData`

  returns: `org.datavec.api.transform.metadata.ColumnMetaData`"
  (^org.datavec.api.transform.metadata.ColumnMetaData [^MinMaxNormalizer this ^java.lang.String new-column-name ^org.datavec.api.transform.metadata.ColumnMetaData old-column-meta]
    (-> this (.getNewColumnMetaData new-column-name old-column-meta))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^MinMaxNormalizer this]
    (-> this (.toString))))

