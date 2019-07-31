(ns org.datavec.api.transform.analysis.quality.string.StringQualityMergeFunction
  "Created by Alex on 5/03/2016."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.analysis.quality.string StringQualityMergeFunction]))

(defn ->string-quality-merge-function
  "Constructor."
  (^StringQualityMergeFunction []
    (new StringQualityMergeFunction )))

(defn apply
  "Description copied from interface: BiFunction

  v-1 - First argument - `org.datavec.api.transform.quality.columns.StringQuality`
  v-2 - Second argument - `org.datavec.api.transform.quality.columns.StringQuality`

  returns: Result - `org.datavec.api.transform.quality.columns.StringQuality`"
  (^org.datavec.api.transform.quality.columns.StringQuality [^StringQualityMergeFunction this ^org.datavec.api.transform.quality.columns.StringQuality v-1 ^org.datavec.api.transform.quality.columns.StringQuality v-2]
    (-> this (.apply v-1 v-2))))

