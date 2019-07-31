(ns org.datavec.api.transform.transform.doubletransform.StandardizeNormalizer
  "Normalize using (x-mean)/stdev.
 Also known as a standard score, standardization etc."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.transform.doubletransform StandardizeNormalizer]))

(defn ->standardize-normalizer
  "Constructor.

  column-name - `java.lang.String`
  mean - `double`
  stdev - `double`"
  (^StandardizeNormalizer [^java.lang.String column-name ^Double mean ^Double stdev]
    (new StandardizeNormalizer column-name mean stdev)))

(defn map
  "Transform an object
  in to another object

  input - the record to transform - `java.lang.Object`

  returns: the transformed writable - `java.lang.Object`"
  (^java.lang.Object [^StandardizeNormalizer this ^java.lang.Object input]
    (-> this (.map input))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^StandardizeNormalizer this]
    (-> this (.toString))))

