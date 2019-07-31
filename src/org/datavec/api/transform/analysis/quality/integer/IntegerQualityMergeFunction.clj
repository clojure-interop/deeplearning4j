(ns org.datavec.api.transform.analysis.quality.integer.IntegerQualityMergeFunction
  "Created by Alex on 5/03/2016."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.analysis.quality.integer IntegerQualityMergeFunction]))

(defn ->integer-quality-merge-function
  "Constructor."
  (^IntegerQualityMergeFunction []
    (new IntegerQualityMergeFunction )))

(defn apply
  "Description copied from interface: BiFunction

  v-1 - First argument - `org.datavec.api.transform.quality.columns.IntegerQuality`
  v-2 - Second argument - `org.datavec.api.transform.quality.columns.IntegerQuality`

  returns: Result - `org.datavec.api.transform.quality.columns.IntegerQuality`"
  (^org.datavec.api.transform.quality.columns.IntegerQuality [^IntegerQualityMergeFunction this ^org.datavec.api.transform.quality.columns.IntegerQuality v-1 ^org.datavec.api.transform.quality.columns.IntegerQuality v-2]
    (-> this (.apply v-1 v-2))))

