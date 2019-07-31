(ns org.datavec.api.transform.analysis.quality.time.TimeQualityMergeFunction
  "Created by Alex on 5/03/2016."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.analysis.quality.time TimeQualityMergeFunction]))

(defn ->time-quality-merge-function
  "Constructor."
  (^TimeQualityMergeFunction []
    (new TimeQualityMergeFunction )))

(defn apply
  "Description copied from interface: BiFunction

  v-1 - First argument - `org.datavec.api.transform.quality.columns.TimeQuality`
  v-2 - Second argument - `org.datavec.api.transform.quality.columns.TimeQuality`

  returns: Result - `org.datavec.api.transform.quality.columns.TimeQuality`"
  (^org.datavec.api.transform.quality.columns.TimeQuality [^TimeQualityMergeFunction this ^org.datavec.api.transform.quality.columns.TimeQuality v-1 ^org.datavec.api.transform.quality.columns.TimeQuality v-2]
    (-> this (.apply v-1 v-2))))

