(ns org.datavec.spark.transform.analysis.unique.UniqueAddFunction
  "Simple function used in AnalyzeSpark.getUnique"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.transform.analysis.unique UniqueAddFunction]))

(defn ->unique-add-function
  "Constructor."
  (^UniqueAddFunction []
    (new UniqueAddFunction )))

(defn call
  "v-1 - `java.util.Map`
  v-2 - `java.util.List`

  returns: `java.util.Map<java.lang.String,java.util.Set<org.datavec.api.writable.Writable>>`

  throws: java.lang.Exception"
  (^java.util.Map [^UniqueAddFunction this ^java.util.Map v-1 ^java.util.List v-2]
    (-> this (.call v-1 v-2))))

