(ns org.datavec.api.transform.transform.doubletransform.SubtractMeanNormalizer
  "Normalize by substracting the mean"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.transform.doubletransform SubtractMeanNormalizer]))

(defn ->subtract-mean-normalizer
  "Constructor.

  column-name - `java.lang.String`
  mean - `double`"
  (^SubtractMeanNormalizer [^java.lang.String column-name ^Double mean]
    (new SubtractMeanNormalizer column-name mean)))

(defn map
  "Transform an object
  in to another object

  input - the record to transform - `java.lang.Object`

  returns: the transformed writable - `java.lang.Object`"
  (^java.lang.Object [^SubtractMeanNormalizer this ^java.lang.Object input]
    (-> this (.map input))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^SubtractMeanNormalizer this]
    (-> this (.toString))))

