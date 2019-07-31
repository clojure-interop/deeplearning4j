(ns org.datavec.api.transform.analysis.quality.longq.LongQualityMergeFunction
  "Created by Alex on 5/03/2016."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.analysis.quality.longq LongQualityMergeFunction]))

(defn ->long-quality-merge-function
  "Constructor."
  (^LongQualityMergeFunction []
    (new LongQualityMergeFunction )))

(defn apply
  "Description copied from interface: BiFunction

  v-1 - First argument - `org.datavec.api.transform.quality.columns.LongQuality`
  v-2 - Second argument - `org.datavec.api.transform.quality.columns.LongQuality`

  returns: Result - `org.datavec.api.transform.quality.columns.LongQuality`"
  (^org.datavec.api.transform.quality.columns.LongQuality [^LongQualityMergeFunction this ^org.datavec.api.transform.quality.columns.LongQuality v-1 ^org.datavec.api.transform.quality.columns.LongQuality v-2]
    (-> this (.apply v-1 v-2))))

