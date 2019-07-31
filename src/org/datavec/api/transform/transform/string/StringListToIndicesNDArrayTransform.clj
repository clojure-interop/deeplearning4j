(ns org.datavec.api.transform.transform.string.StringListToIndicesNDArrayTransform
  "Converts String column into a sparse bag-of-words (BOW)
 represented as an NDArray of indices. Appropriate for
 embeddings or as efficient storage before being expanded
 into a dense array."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.transform.string StringListToIndicesNDArrayTransform]))

(defn ->string-list-to-indices-nd-array-transform
  "Constructor.

  column-name - `java.lang.String`
  new-column-name - `java.lang.String`
  vocabulary - `java.util.List`
  delimiter - `java.lang.String`
  binary - `boolean`
  ignore-unknown - `boolean`"
  (^StringListToIndicesNDArrayTransform [^java.lang.String column-name ^java.lang.String new-column-name ^java.util.List vocabulary ^java.lang.String delimiter ^Boolean binary ^Boolean ignore-unknown]
    (new StringListToIndicesNDArrayTransform column-name new-column-name vocabulary delimiter binary ignore-unknown))
  (^StringListToIndicesNDArrayTransform [^java.lang.String column-name ^java.util.List vocabulary ^java.lang.String delimiter ^Boolean binary ^Boolean ignore-unknown]
    (new StringListToIndicesNDArrayTransform column-name vocabulary delimiter binary ignore-unknown)))

