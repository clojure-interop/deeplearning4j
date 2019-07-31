(ns org.datavec.spark.transform.analysis.unique.UniqueMergeFunction
  "Simple function used in AnalyzeSpark.getUnique"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.transform.analysis.unique UniqueMergeFunction]))

(defn ->unique-merge-function
  "Constructor."
  (^UniqueMergeFunction []
    (new UniqueMergeFunction )))

(defn call
  "v-1 - `java.util.Map`
  v-2 - `java.util.Map`

  returns: `java.util.Map<java.lang.String,java.util.Set<org.datavec.api.writable.Writable>>`

  throws: java.lang.Exception"
  (^java.util.Map [^UniqueMergeFunction this ^java.util.Map v-1 ^java.util.Map v-2]
    (-> this (.call v-1 v-2))))

